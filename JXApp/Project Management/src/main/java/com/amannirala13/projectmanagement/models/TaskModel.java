package com.amannirala13.projectmanagement.models;

public class TaskModel {
    private String projectId;
    private String title;
    private String[] assignedTo;
    private String note;
    private String startDate;
    private String durationInDays;
    private boolean completed;
    private String[] resources;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String[] assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(String durationInDays) {
        this.durationInDays = durationInDays;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String[] getResources() {
        return resources;
    }

    public void setResources(String[] resources) {
        this.resources = resources;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskModel(
            String projectId,
            String title,
            String[] assignedTo,
            String note,
            String startDate,
            String durationInDays,
            boolean completed,
            String[] resources) {
        this.projectId = projectId;
        this.title = title;
        this.assignedTo = assignedTo;
        this.note = note;
        this.startDate = startDate;
        this.durationInDays = durationInDays;
        this.completed = completed;
        this.resources = resources;
    }


}
