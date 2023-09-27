package com.zybooks.unittesterapp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class ContactTest {
    //Initialize a Contact object
    Contact goodContactA = new Contact("kl09ex&","Bob","O'Hare","9376514482","Skippet Road, Ohio");
    Contact badContactA = new Contact("A pass of 12", "LongNameFredrick", "Stephenterklomossezen", "kfghs", "The Road");
    Contact badContactB = new Contact(null, null, null, null, null);

    @Test
    public void idNoLongerThanTen(){
        assertTrue(goodContactA.getContactId().length() <= 10);
        assertFalse(badContactA.getContactId().length() <= 10);
    }

    @Test
    public void idNotNull(){
        assertNotNull(goodContactA.getContactId());
        assertNull(badContactB.getContactId());
    }
    @Test
    public void firstNameNoLongerThanTen(){
        assertTrue(goodContactA.getFirstName().length() <= 10);
        assertFalse(badContactA.getFirstName().length() <= 10);
    }

    @Test
    public void firstNameNotNull(){
        assertNotNull(goodContactA.getFirstName());
        assertNull(badContactB.getFirstName());
    }
    @Test
    public void lastNameNoLongerThanTen(){
        assertTrue(goodContactA.getLastName().length() <= 10);
        assertFalse(badContactA.getLastName().length() <= 10);
    }

    @Test
    public void lastNameNotNull(){
        assertNotNull(goodContactA.getLastName());
        assertNull(badContactB.getLastName());
    }
    @Test
    public void phoneIsTen(){
        assertEquals(10, goodContactA.getPhone().length());
        assertNotEquals(10, badContactA.getPhone().length());
    }

    @Test
    public void phoneNotNull(){
        assertNotNull(goodContactA.getPhone());
        assertNull(badContactB.getPhone());
    }

}
