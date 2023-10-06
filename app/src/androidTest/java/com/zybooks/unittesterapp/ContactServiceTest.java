package com.zybooks.unittesterapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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


    //The contact service shall be able to add contacts with a unique ID
    @Test
    public void canAddContact(){
        goodContactService.addContact(goodContactA);
        assertNotNull(goodContactService.getContactId(goodContactA));
    }
    // The contact service shall be able to delete contacts per contact ID.
    @Test
    public void canDelete(){
        goodContactService.addContact(goodContactB);
        goodContactService.deleteContact(goodContactB.getContactId());
        assertNull(goodContactService.getContactId(goodContactB));
    }
}
