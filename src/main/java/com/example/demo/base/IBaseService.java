package com.example.demo.base;

import java.util.List;

public interface IBaseService<R,Q extends BaseParam> {
    List<R> getForAdmin(Q q);
    Integer getCountForAdmin(Q q);
}
