package cn.bdqn.bean;

import java.util.Date;

/**
 * Created by dll on 2017/7/28.
 * 工单表
 */
public class Workorder {
    private Integer id;//工单编号
    private Project project;//项目编号
    private String executor;//执行人
    private String description;//任务描述
    private Integer orderLevel;//工单级别
    private Date createDate;//创建时间

    public Workorder(Integer id, Project project, String executor, String description, Integer orderLevel, Date createDate) {
        this.id = id;
        this.project = project;
        this.executor = executor;
        this.description = description;
        this.orderLevel = orderLevel;
        this.createDate = createDate;
    }

    public Workorder() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(Integer orderLevel) {
        this.orderLevel = orderLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Workorder{" +
                "id=" + id +
                ", project=" + project +
                ", executor='" + executor + '\'' +
                ", description='" + description + '\'' +
                ", orderLevel=" + orderLevel +
                ", createDate=" + createDate +
                '}';
    }
}
