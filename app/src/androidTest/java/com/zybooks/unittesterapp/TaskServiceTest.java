package com.zybooks.unittesterapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class TaskServiceTest {
    Task goodTaskA = new Task("theBest", "Washing", "Wash the dishes");
    Task goodTaskB = new Task("Okay", "Laundry", "Wash the clothes n such");
    TaskService goodServiceA = new TaskService();
    @BeforeAll
    //Add and update a task so we can test later to see if we were successful
    void init(){
        goodServiceA.addTask(goodTaskA);
        goodServiceA.updateTask("theBest", "Jumps", "Fly away!");
    }


    //The task service shall be able to add tasks with a unique ID.
    @Test
    public void canAddTasks(){
        assertTrue(goodServiceA.tasks.containsValue(goodTaskA));
    }
    //The task service shall be able to update task fields per task ID.
    @Test
    public void canUpdateTasks(){
        assertEquals("Fly away!", goodTaskA.getDescription());
    }

    //The task service shall be able to delete tasks per task ID.
    @Test
    public void canDeleteTasks(){
        goodServiceA.addTask(goodTaskB);
        goodServiceA.deleteTask(goodTaskB.getTaskId());
        assertNull(goodServiceA.tasks.containsValue(goodTaskB));
    }
}