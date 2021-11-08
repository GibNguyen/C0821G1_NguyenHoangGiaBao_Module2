package case_study.services;

import case_study.models.Booking;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    Set<Booking> bookingSet;
    Scanner scanner = new Scanner(System.in);
    public BookingService() {
        bookingSet = new TreeSet<>();
    }
    public BookingService(Set<Booking> bookingSet){
        this.bookingSet=bookingSet;
    }

    @Override
    public void addNewBooking() {

    }

    @Override
    public void addNew() {
        
    }

    @Override
    public void editInformation() {

    }

    @Override
    public void displayList() {

    }
}
