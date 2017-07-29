package cn.bdqn.service.impl;

import cn.bdqn.bean.Workorder;
import cn.bdqn.dao.BaseDao;
import cn.bdqn.service.WorkorderService;

import java.util.List;

/**
 * 工单的实现类
 * Created by dll on 2017/7/29.
 */
public class WorkorderServiceImpl implements WorkorderService {
    private BaseDao<Workorder> workorderBaseDao;

    public BaseDao<Workorder> getWorkorderBaseDao() {
        return workorderBaseDao;
    }

    public void setWorkorderBaseDao(BaseDao<Workorder> workorderBaseDao) {
        this.workorderBaseDao = workorderBaseDao;
    }

    @Override
    public void add(Workorder workorder) {
        workorderBaseDao.add(workorder);
    }

    @Override
    public void delete(Workorder workorder) {
        workorderBaseDao.delete(workorder);
    }

    @Override
    public void update(Workorder workorder) {
        workorderBaseDao.update(workorder);
    }

    @Override
    public List<Workorder> findList() {
        return workorderBaseDao.findList("from Workorder");
    }
}
