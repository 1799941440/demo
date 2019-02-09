package com.example.demo.base;

/**
 * @author wz
 * @description 基本查询参数类
 */
public class BaseQuery {
    /**
     * 第几页
     */
    private Integer page = 1;
    /**
     * 以几个为一页
     */
    private Integer rows = 10;
    /**
     * 数据库中以多少开始，start = rows*(page-1)
     */
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
