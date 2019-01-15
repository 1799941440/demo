package com.example.demo.base;

public class BaseParam {
    private Integer page = 1;
    private Integer rows = 10;
    private Integer start;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getStart() {
        return rows*(page-1);
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
