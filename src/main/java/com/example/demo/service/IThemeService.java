package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.vo.ThemeInfo;
import com.example.demo.queryparam.ThemeQuery;

import java.util.List;

public interface IThemeService extends IBaseService<ThemeInfo, ThemeQuery> {
    List<ThemeInfo> getForUser(ThemeQuery q);
    Integer getCountForUser(ThemeQuery q);
}
