package com.zybooks.unittesterapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.Test;
import java.time.LocalDate;

public class AppointmentTest {

    @Test
    public void createsTheGoodStuff(){
        //We want to know that a proper appointment is created and accessible
        Appointment goodAppointmentA = new Appointment("Simone", LocalDate.of(2028, 07, 10),"Talk to doctor about discoloration on flaps");
        assertNotNull(goodAppointmentA.getAppointmentId());
    }
    @Test
    public void idNoLongerThanTen(){
        //Try to create an id that's too long, then access it to see if creation was success
        //We don't want to be able to create appointments with an id > 10
        Appointment badAppointmentA = new Appointment("tooLongiI1|l!]jslkdjfsal", LocalDate.of(2028, 07, 10),"Talk to doctor about discoloration on flaps");
        assertNull(badAppointmentA.getAppointmentDate());
    }
        @Test
    public void idNotNull(){
        //We shouldn't be able to create an appointment with a null id
        Appointment badAppointmentB = new Appointment(null, LocalDate.of(2027, 01, 01), "Business call with Bartholemew?");
        assertNull(badAppointmentB.getAppointmentDate());
    }
    @Test
    public void dateNotNull(){
        //We shouldn't be able to create an appointment without a date
        Appointment badAppointmentC = new Appointment("Clapton", null, "Business call with Bartholemew?");
        assertNull(badAppointmentC.getAppointmentId());
    }
    @Test
    public void dateNotInPast(){
        //We can't make an appointment in the past
        Appointment badAppointmentD = new Appointment("Hendrix", LocalDate.of(2002, 12, 25), "A valid description");
        assertNull(badAppointmentD.getAppointmentId());

    }
    @Test
    public void descriptionNotNull(){
        //We can't create an appointment with no description
        Appointment badAppointmentE = new Appointment("Withers", LocalDate.of(2039, 02,21), null);
        assertNull(badAppointmentE.getAppointmentId());
    }
    @Test
    public void descriptionNotTooLong(){
        //We can't create an appointment with description > 50
        Appointment badAppointmentF = new Appointment("BeeGee", LocalDate.of(2039, 02,21), "Hey lil momma let me whisper in ya ear. Tell ya something that you might like to hear. I'm gonna swing from the chandelier");
        assertNull(badAppointmentF.getAppointmentId());
    }

}
