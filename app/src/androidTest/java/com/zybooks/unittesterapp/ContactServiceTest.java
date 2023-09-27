package com.zybooks.unittesterapp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ContactServiceTest {
    //Initialize a ContactService object
    Contact goodContactA = new Contact("kl09ex&","Bob","O'Hare","9376514482","Skippet Road, Ohio");
    Contact goodContactB = new Contact("jiF5%n","Elijah","Jewett","8286564453","Rainbow Road, North Carolina");

    ContactService goodContactService = new ContactService();

    @BeforeEach
    void init(){
        goodContactService.addContact(goodContactA);
    }


    //The contact service shall be able to add contacts with a unique ID
    @Test
    public void canAddContact(){
        assertTrue(goodContactService.contacts.containsValue(goodContactA));
    }
    // The contact service shall be able to delete contacts per contact ID.
    @Test
    public void canDelete(){
        goodContactService.deleteContact(goodContactA.getContactId());
        assertFalse(goodContactService.contacts.containsKey(goodContactA.getContactId()));
    }
    //The contact service shall be able to update contact fields per contact ID
   /* @Test
    public void canUpdateContactInfo(){
        goodContactService.updateContact("kl09ex&", "Globby", "Goobert", "4548881212", "Hobert Avenue");
        assertEquals("Globby", goodContactA.getFirstName());
    }*/

    @AfterEach
    void tearDown(){
        ContactService goodContactService = new ContactService();
        goodContactService.addContact(goodContactA);
    }
}
