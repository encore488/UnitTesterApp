package com.zybooks.unittesterapp;

import android.util.Log;

public class Contact {
    //Each contact has an id, first and last name, phone, and address
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;


    //You want to set all of a contact's attributes at once?
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }


    // Getters and setters for updatable fields (firstName, lastName, phone, address)

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        } else {
            // Handle invalid input
            Log.e(TAG, "First name null or too long");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        } else {
            // Handle invalid input
            Log.e(TAG, "Last name null or too long");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() == 10) {
            this.phone = phone;
        } else {
            // Handle invalid input
            Log.e(TAG, "Phone # null or not 10 digits");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && address.length() <= 30) {
            this.address = address;
        } else {
            // Handle invalid input
            Log.e(TAG, "Address null or more than 30");
        }
    }
    //For writing log lines
    private static final String TAG = "Contact";
}
