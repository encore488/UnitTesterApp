package com.zybooks.unittesterapp;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;


public class ContactService {

    Map<String, Contact> contacts = new HashMap<>();
    public ContactService() {

        //Each instance of ContactService is instantiated with a map that holds contacts. Each item in the map holds a string(the contact's id) and a Contact(the contact's name)

        //A constructor. Restart with a new, empty map by declaring "ContactService contactServiceName = new ContactService();"
    }

    //For writing log lines
    private static final String TAG = "ContactService";

    // Add a contact with a unique ID
    public void addContact(Contact contact) {
        if (contact != null && !contacts.containsKey(contact.getContactId())) {
            contacts.put(contact.getContactId(), contact);
        } else {
            // Handle duplicate ID or null contact
            Log.e(TAG, "Duplicate ID or null contact");
        }
    }
    public String getContactId(Contact contact) {
        if (contact != null && contacts.containsKey(contact.getContactId())) {
            return contact.getContactId();
        } else {
            // Handle duplicate ID or null contact
            Log.e(TAG, "We can't find that contact");
            return null;
        }
    }

        // Delete a contact by contact ID
        public void deleteContact (String contactId){
            contacts.remove(contactId);
        }

        // Update contact fields by contact ID
        public void updateContact (String contactId, String firstName, String lastName, String
        phone, String address){
            Contact contact;
            if (contacts.containsKey(contactId)) {
                contact = contacts.get(contactId);
                if (firstName != null && firstName.length() <= 10) {
                    contact.setFirstName(firstName);
                }
                if (lastName != null && lastName.length() <= 10) {
                    contact.setLastName(lastName);
                }
                if (phone != null && phone.length() == 10) {
                    contact.setPhone(phone);
                }
                if (address != null && address.length() <= 30) {
                    contact.setAddress(address);
                }
            } else {
                // Handle contact not found
                Log.e(TAG, "ID not found. Or invalid name, phone, or address length, ");
            }
        }
    }

