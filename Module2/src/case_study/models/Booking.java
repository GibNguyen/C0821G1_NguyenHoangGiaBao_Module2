package case_study.models;

public class Booking {
    private int bookingId;
    private String dayStart;
    private String dayStop;
    private int customerId;
    private String nameService;
    private String typeOfService;

    public Booking(){}

    public Booking(int bookingId, String dayStart, String dayStop, int customerId, String nameService, String typeOfService) {
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

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayStop() {
        return dayStop;
    }

    public void setDayStop(String dayStop) {
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
