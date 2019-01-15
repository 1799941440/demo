package com.example.demo.base;

import java.util.List;

public interface BaseMapper<T,Q extends BaseParam> {
    List<T> getForAdmin(Q q);
    Integer getCountForAdmin(Q q);
    Integer logicDelete(BaseEntity be);
    Integer unDelete(Integer id);
    Integer delete(Integer id);
}
