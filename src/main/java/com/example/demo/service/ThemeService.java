package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.vo.ThemeInfo;
import com.example.demo.mapper.ThemeMapper;
import com.example.demo.queryparam.ThemeQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ThemeService implements IThemeService{

    @Resource
    private ThemeMapper tMapper;

    @Override
    public List<ThemeInfo> getForAdmin(ThemeQuery themeQuery) {
        return tMapper.getForAdmin(themeQuery);
    }

    @Override
    public Integer getCountForAdmin(ThemeQuery themeQuery) {
        return tMapper.getCountForAdmin(themeQuery);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return tMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return tMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return tMapper.delete(id);
    }

    @Override
    public ThemeInfo getById(Integer id) {
        return tMapper.getById(id);
    }

    @Override
    public List<ThemeInfo> getForUser(ThemeQuery q) {
        return tMapper.getForUser(q);
    }

    @Override
    public Integer getCountForUser(ThemeQuery q) {
        return tMapper.getCountForUser(q);
    }
}
