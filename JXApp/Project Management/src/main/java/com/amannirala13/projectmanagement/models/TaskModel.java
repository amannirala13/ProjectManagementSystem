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
}
