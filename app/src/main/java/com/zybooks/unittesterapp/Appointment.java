package com.zybooks.unittesterapp;

import android.util.Log;

import java.time.LocalDate;

public class Appointment {
    //Each appointment has an id, date, and description
    private static String appointmentId;
    private LocalDate appointmentDate;
    private String description;


    //You want to create an appointment?
    public Appointment(String appointmentId, LocalDate appointmentDate, String description) {
        if(appointmentId.length() < 11 && appointmentDate != null &&
                !appointmentDate.isBefore(LocalDate.now()) && description != null &&
                description.length() <= 50) {
            Appointment.appointmentId = appointmentId;
            this.appointmentDate = appointmentDate;
            this.description = description;
        }
    }


    // Getters and setters for updatable fields
    public String getAppointmentId() {
        return appointmentId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription(){ return description;}
    public void setAppointmentDate(LocalDate appointmentDate) {
        if (appointmentDate != null && !appointmentDate.isBefore(LocalDate.now())) {
            this.appointmentDate = appointmentDate;
        } else {
            // Handle invalid input
            Log.e(TAG, "Null or past date");
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
    private static final String TAG = "Appointment";
}
