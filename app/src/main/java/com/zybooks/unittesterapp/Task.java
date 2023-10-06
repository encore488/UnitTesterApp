package com.zybooks.unittesterapp;

import android.util.Log;

public class Task {
    //Each task has an id, name and description
    private String taskId;
    private String taskName;
    private String description;


    //You want to create a Task?
    public Task(String taskId, String taskName, String description) {
        if(taskId != null){
            if(taskId.length() < 11) {
                this.taskId = taskId;
                this.taskName = taskName;
                this.description = description;
            }

        }
    }


    // Getters and setters for updatable fields
    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription(){ return description;}
    public void setTaskName(String taskName) {
        if (taskName != null && taskName.length() <= 20) {
            this.taskName = taskName;
        } else {
            // Handle invalid input
            Log.e(TAG, "Name null or too long");
        }
    }
    public void setDescription(String description) {
        if (description != null && description.length() <= 50) {
            this.description = description;
        } else {
            // Handle invalid input
            Log.e(TAG, "Description null or too long");
        }
    }
    //For writing log lines
    private static final String TAG = "Task";
}
