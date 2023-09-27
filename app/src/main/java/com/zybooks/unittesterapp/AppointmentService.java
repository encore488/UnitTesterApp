package com.zybooks.unittesterapp;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    Map<String, Appointment> appointments = new HashMap<>();
    public AppointmentService() {}
    //For writing log lines
    private static final String TAG = "AppointmentService";

    // Add an appointment with a unique ID
    public void addAppointment(Appointment appointment) {
        if (appointment != null && !appointments.containsKey(appointment.getAppointmentId())) {
            appointments.put(appointment.getAppointmentId(), appointment);
        } else {
            // Handle duplicate ID or null task
            Log.e(TAG, "Duplicate ID or null appointment");
        }
    }

    // Delete appointment by ID
    public void deleteAppointment (String appointmentId) {
        appointments.remove(appointmentId);
    }
}