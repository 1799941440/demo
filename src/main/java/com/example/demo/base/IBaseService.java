package com.example.demo.base;

import java.util.List;

public interface IBaseService<R,Q extends BaseQuery> {
    List<R> getForAdmin(Q q);
    Integer getCountForAdmin(Q q);
    Integer logicDelete(BaseEntity be);
    Integer unDelete(Integer id);
    Integer delete(Integer id);
    R getById(Integer id);
}
