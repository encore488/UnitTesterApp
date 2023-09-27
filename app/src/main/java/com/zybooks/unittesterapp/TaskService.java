package com.zybooks.unittesterapp;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    Map<String, Task> tasks = new HashMap<>();
    public TaskService() {}
    //For writing log lines
    private static final String TAG = "TaskService";

    // Add a task with a unique ID
    public void addTask(Task task) {
        if (task != null && !tasks.containsKey(task.getTaskId())) {
            tasks.put(task.getTaskId(), task);
        } else {
            // Handle duplicate ID or null task
            Log.e(TAG, "Duplicate ID or null task");
        }
    }

    // Delete a task by task ID
    public void deleteTask (String taskId){
        tasks.remove(taskId);
    }

    // Update task fields
    public void updateTask (String taskId, String taskName, String description){
        Task task;
        //If this task exists in tasks map, then change its name and description
        if (tasks.containsKey(taskId)) {
            task = tasks.get(taskId);
            task.setTaskName(taskName);
            task.setDescription(description);
        }
        else {
            // Handle contact not found
            Log.e(TAG, "ID not found. Or invalid name or description");
        }
    }
}