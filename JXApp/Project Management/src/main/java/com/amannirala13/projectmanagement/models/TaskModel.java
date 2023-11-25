package com.amannirala13.projectmanagement.models;

import java.util.Date;

public class TaskModel {
    private String title;
    private String[] assignedTo;
    private String note;
    private Date startDate;
    private Long durationInDays;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(Long durationInDays) {
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

    public TaskModel(String title, String[] assignedTo, String note, Date startDate, Long durationInDays, boolean completed, String[] resources) {
        this.title = title;
        this.assignedTo = assignedTo;
        this.note = note;
        this.startDate = startDate;
        this.durationInDays = durationInDays;
        this.completed = completed;
        this.resources = resources;
    }


}
