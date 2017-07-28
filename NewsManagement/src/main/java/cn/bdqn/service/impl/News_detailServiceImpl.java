package cn.bdqn.service.impl;

import cn.bdqn.bean.News_detail;
import cn.bdqn.dao.BaseDao;
import cn.bdqn.service.News_detailService;

import java.util.List;

/**
 * Created by dll on 2017/7/27.
 */
public class News_detailServiceImpl implements News_detailService {



    private BaseDao<News_detail> dao;

    public News_detailServiceImpl(BaseDao<News_detail> dao) {
        this.dao = dao;
    }

    public News_detailServiceImpl() {
    }

    public BaseDao<News_detail> getDao() {
        return dao;
    }

    public void setDao(BaseDao<News_detail> dao) {
        this.dao = dao;
    }

    @Override
    public void add(News_detail news_detail) {
        dao.add(news_detail);
    }

    @Override
    public void delete(News_detail news_detail) {
        dao.delete(news_detail);
    }

    @Override
    public void update(News_detail news_detail) {
        dao.update(news_detail);
    }

    @Override
    public List<News_detail> findList() {
        return dao.findList("from News_detail");
    }

    @Override
    public List<News_detail> findList(String hql) {
        return null;
    }
}
