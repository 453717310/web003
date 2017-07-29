package cn.bdqn.action;

import cn.bdqn.bean.Project;
import cn.bdqn.bean.Workorder;
import cn.bdqn.service.WorkorderService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;
import java.util.List;

/**
 * Created by dll on 2017/7/29.
 */
public class WorkorderAction extends ActionSupport {
    private WorkorderService workorderService;
    private List<Workorder> workorders;
    private Workorder workorder;
    private Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Workorder getWorkorder() {
        return workorder;
    }

    public void setWorkorder(Workorder workorder) {
        this.workorder = workorder;
    }

    public WorkorderService getWorkorderService() {
        return workorderService;
    }

    public void setWorkorderService(WorkorderService workorderService) {
        this.workorderService = workorderService;
    }

    public List<Workorder> getWorkorders() {
        return workorders;
    }

    public void setWorkorders(List<Workorder> workorders) {
        this.workorders = workorders;
    }

    /**
     * 添加
     * @return
     */
    public String add(){
        System.out.println(workorder.getProjectId());
        workorder.setCreateDate(new Date());
        workorderService.add(workorder);
        System.out.println(1111);
        return SUCCESS;
    }

    /**
     * 查询所有工单信息
     * @return
     */
    public String find(){
        workorders=workorderService.findList();
        return SUCCESS;
    }
    public String temp(){
        return SUCCESS;
    }
}
