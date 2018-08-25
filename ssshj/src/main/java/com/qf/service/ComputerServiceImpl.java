package com.qf.service;

import com.qf.dao.ComputerDAO;
import com.qf.dto.ComDTO;
import com.qf.dto.PageDTO;
import com.qf.pojo.TbComputer;
import com.qf.utils.MyDateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
@Service
public class ComputerServiceImpl implements ComputerService {
    //
    @Autowired
    private ComputerDAO computerDAO;

    @Override
    public void addCom(ComDTO dto) {
        TbComputer pojo = new TbComputer();
        BeanUtils.copyProperties(dto,pojo);
        String comGendate = dto.getComGendate();
        Date date = MyDateUtils.strToDate(comGendate);
        Timestamp timestamp = new Timestamp(date.getTime());
        pojo.setComGendate(timestamp);
        computerDAO.save(pojo);
    }

    @Override
    public void delCom(Long id) {
        computerDAO.delete(id);
    }

    @Override
    public void update(ComDTO dto) {
        TbComputer pojo = new TbComputer();
        BeanUtils.copyProperties(dto,pojo);
        String comGendate = dto.getComGendate();
        pojo.setComGendate(new Timestamp(MyDateUtils.strToDate(comGendate).getTime()));
        computerDAO.saveAndFlush(pojo);
    }

    @Transactional
    public void zhuanZhan(String comModel, long comId) {//在服务层加事务
        computerDAO.udpdateCom(comModel, comId);
    }

    @Override
    public ComDTO findById(Long id) {
        TbComputer one = computerDAO.findOne(id);
        ComDTO dto = new ComDTO();
        BeanUtils.copyProperties(one,dto);
        Timestamp comGendate = one.getComGendate();
        dto.setComGendate(comGendate.toString());//
        return dto;
    }

    @Override
    public List<ComDTO> findAll() {
        List<ComDTO> list = new ArrayList<>();
        List<TbComputer> all = computerDAO.findAll();
        for (TbComputer tbComputer : all) {
            ComDTO dto = new ComDTO();
            BeanUtils.copyProperties(tbComputer,dto);
            Timestamp comGendate = tbComputer.getComGendate();
            dto.setComGendate(comGendate.toString());
            list.add(dto);
        }
        return list;
    }

    @Override
    public List<ComDTO> findByMode(String comModel) {
        List<ComDTO> list = new ArrayList<>();
        List<TbComputer> all = computerDAO.findByComModel(comModel);
        for (TbComputer tbComputer : all) {
            ComDTO dto = new ComDTO();
            BeanUtils.copyProperties(tbComputer,dto);
            Timestamp comGendate = tbComputer.getComGendate();
            dto.setComGendate(comGendate.toString());
            list.add(dto);
        }
        return list;
    }

    @Override
    public List<ComDTO> findByPage(PageDTO pageDTO) {
        List<ComDTO> list = new ArrayList<>();
        Sort.Order order = new Sort.Order(Sort.Direction.DESC,"comId");
        Sort sort = new Sort(order);
        Pageable pageable = new PageRequest(pageDTO.getPage(),pageDTO.getSize(),sort);
        Page<TbComputer> all = computerDAO.findAll(pageable);
        //得到总页数
        int totalPages = all.getTotalPages()-1;
        System.out.println("总页数:"+totalPages);
        pageDTO.setMaxPage(totalPages);//返回总页数
        int page = pageDTO.getPage();
        if(page>=totalPages){
            page=totalPages;
            pageDTO.setPage(page);
        }

        List<TbComputer> content = all.getContent();
        for (TbComputer tbComputer : content) {
            ComDTO dto = new ComDTO();
            BeanUtils.copyProperties(tbComputer,dto);
            Timestamp comGendate = tbComputer.getComGendate();
            dto.setComGendate(comGendate.toString());
            list.add(dto);
        }

        return list;
    }
}
