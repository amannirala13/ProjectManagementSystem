package com.amannirala13.projectmanagement.models;

public class ProjectModel {
    private String projectId;
    private String title;
    private String[] owners;
    private String startDate;
    private String endDate;
    private String bufferDays;
    private TaskModel[] tasks;

    private boolean completed;

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getBufferDays() {
        return bufferDays;
    }

    public void setBufferDays(String bufferDays) {
        this.bufferDays = bufferDays;
    }

    public TaskModel[] getTasks() {
        return tasks;
    }

    public void setTasks(TaskModel[] tasks) {
        this.tasks = tasks;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ProjectModel(
            String projectId,
            String title,
            String[] owners,
            String startDate,
            String endDate,
            String bufferDays,
            TaskModel[] tasks,
            boolean completed) {
        this.title = title;
        this.owners = owners;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bufferDays = bufferDays;
        this.tasks = tasks;
        this.projectId = projectId;
        this.completed = completed;
    }
}
