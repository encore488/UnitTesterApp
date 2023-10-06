package com.zybooks.unittesterapp;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TaskTest {
    //Initialize a Task object
    Task goodTaskA = new Task("theBest", "Washing", "Wash the dishes");
    Task badTaskA = new Task("theVeryWorst really. This name is too long!", "Laundry or something along those lines, I guess.", "We really do love to flush the toilet, don't we? We are just always trying to flush toilets. I'll do it 5, maybe 10 or 15 times before everything really goes down.");
    Task badTaskB = new Task(null, "Cassius", "Shouldn't be saved because this thing has an invalid name.");

    @Test
    public void idNotNull(){
        assertNotNull(goodTaskA.getDescription());
        assertNull(badTaskB.getDescription());
    }
    @Test
    public void nameNotNull(){
        assertNotNull(goodTaskA.getTaskName());
    }
    @Test
    public void descriptionNotNull(){
        assertNotNull(goodTaskA.getDescription());
    }
    @Test
    public void idNoLongerThanTen(){
        assertTrue(goodTaskA.getTaskId().length() <= 10);
        //A task with too long of a name shouldn't even be creatable, if that's a word
        assertNull(badTaskA.getTaskId());
    }
    @Test
    public void nameLengthLimit(){
        assertTrue(goodTaskA.getTaskName().length() <= 20);
        //A task with too long of a name shouldn't even be creatable, if that's a word
        assertNull(badTaskA.getTaskName());
    }
    @Test
    public void descriptionLengthLimit(){
        assertTrue(goodTaskA.getDescription().length() <= 50);
        //A task with too long of a description shouldn't even be creatable, if that's a word
        assertNull(badTaskA.getDescription());
    }
}