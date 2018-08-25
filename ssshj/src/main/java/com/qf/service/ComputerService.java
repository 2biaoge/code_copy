package com.qf.service;

import com.qf.dto.ComDTO;
import com.qf.dto.PageDTO;

import java.util.List;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
public interface ComputerService {

    public void addCom(ComDTO dto);

    public void delCom(Long id);

    public void update(ComDTO dto);

    public void zhuanZhan(String comModel,long comId);

    public ComDTO findById(Long id);

    public List<ComDTO> findAll();

    public List<ComDTO> findByMode(String comModel);

    public List<ComDTO> findByPage(PageDTO pageDTO);

}
