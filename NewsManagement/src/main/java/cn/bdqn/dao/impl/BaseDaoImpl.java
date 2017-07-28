package cn.bdqn.dao.impl;

import cn.bdqn.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

/**
 * 不去调用HibernateDaoSupport
 * Created by dll on 2017/7/27.
 */
public class BaseDaoImpl<T>  implements BaseDao<T> {

    private SessionFactory sessionFactory;

    /**
     * 返回session 对象
     * @return
     */
    private Session getCurrentSession(){
        Session session= sessionFactory.getCurrentSession();
        return session;

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(T t) {
        getCurrentSession().save(t);
    }

    @Override
    public void delete(T t) {
        getCurrentSession().delete(t);
    }

    @Override
    public void update(T t) {
        getCurrentSession().update(t);
    }

    @Override
    public List<T> findList(String hql) {
        return getCurrentSession().createQuery(hql).list();
    }
}
