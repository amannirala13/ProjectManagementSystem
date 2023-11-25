package com.amannirala13.projectmanagement.models;

import java.util.Date;

public class ProjectModel {
    private String projectId;
    private String title;
    private String[] owners;
    private Date startDate;
    private Date endDate;
    private Long bufferDays;
    private TaskModel[] tasks;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getOwners() {
        return owners;
    }

    public void setOwners(String[] owners) {
        this.owners = owners;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getBufferDays() {
        return bufferDays;
    }

    public void setBufferDays(Long bufferDays) {
        this.bufferDays = bufferDays;
    }

    public TaskModel[] getTasks() {
        return tasks;
    }

    public void setTasks(TaskModel[] tasks) {
        this.tasks = tasks;
    }
    public ProjectModel(String title, String[] owners, Date startDate, Date endDate, Long bufferDays, TaskModel[] tasks, String projectId) {
        this.title = title;
        this.owners = owners;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bufferDays = bufferDays;
        this.tasks = tasks;
        this.projectId = projectId;
    }
}
