package cn.bdqn.dao;

import java.util.List;

/**
 * 公共的BaseDao
 * Created by dll on 2017/7/27.
 */
public interface BaseDao<T> {
    /**
     * 增加
     * @param t
     */
    void add(T t);

    /**
     * 删除
     * @param t
     */
    void delete(T t);

    /**
     * 修改
     * @param t
     */
    void update(T t);

    /**
     * 查询所有的信息
     * @param hql
     * @return
     */
    List<T> findList(String hql);

}
