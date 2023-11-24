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
}
