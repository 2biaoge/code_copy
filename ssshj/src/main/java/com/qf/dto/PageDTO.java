package com.qf.dto;

/**
 * @Auther: Administrator
 * Thanks for Everything
 */
public class PageDTO {

    private int page;
    private int size=5;
    private int maxPage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }
}
