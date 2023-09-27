package com.zybooks.unittesterapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import java.time.LocalDate;

public class AppointmentServiceTest {
    //Initialize an AppointmentService object
    AppointmentService goodAppointmentService = new AppointmentService();

    @Test
    public void canAddContact(){
        //Add an appointment, then check that it's there
        Appointment goodAppointmentA = new Appointment("jtE3)6", LocalDate.of(2024, 05, 18), "Talk to psych about why I can't read.");
        goodAppointmentService.addAppointment(goodAppointmentA);
        assertTrue(goodAppointmentService.appointments.containsValue(goodAppointmentA));
    }
   @Test
    public void canDelete(){
        //Add an object, then delete it. Is it still there?
       Appointment goodAppointmentB = new Appointment("kd96", LocalDate.of(2025, 05, 18), "Talk to Rufus.");
       goodAppointmentService.addAppointment(goodAppointmentB);
       goodAppointmentService.deleteAppointment(goodAppointmentB.getAppointmentId());
       assertFalse(goodAppointmentService.appointments.containsKey(goodAppointmentB.getAppointmentId()));
    }
}