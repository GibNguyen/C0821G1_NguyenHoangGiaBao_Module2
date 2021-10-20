package case_study.models;

import java.util.Date;

public class Booking {
    private int bookingId;
    private Date dayStart;
    private Date dayStop;
    private int customerId;
    private String nameService;
    private String typeOfService;

    public Booking(){}

    public Booking(int bookingId, Date dayStart, Date dayStop, int customerId, String nameService, String typeOfService) {
        this.bookingId = bookingId;
        this.dayStart = dayStart;
        this.dayStop = dayStop;
        this.customerId = customerId;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayStop() {
        return dayStop;
    }

    public void setDayStop(Date dayStop) {
        this.dayStop = dayStop;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }
}
