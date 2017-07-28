package cn.bdqn.service;

import cn.bdqn.bean.News_detail;
import cn.bdqn.dao.BaseDao;

import java.util.List;

/**
 * Created by dll on 2017/7/27.
 */
public interface News_detailService extends BaseDao<News_detail>{
    List<News_detail> findList() ;
}
