package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.vo.ThemeInfo;
import com.example.demo.queryparam.ThemeQuery;

import java.util.List;

public interface ThemeMapper extends BaseMapper<ThemeInfo, ThemeQuery> {
    List<ThemeInfo> getForUser(ThemeQuery q);
    Integer getCountForUser(ThemeQuery q);
}
