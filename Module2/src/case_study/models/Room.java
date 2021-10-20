package case_study.models;

import java.util.Date;

public class Room extends Facility {
    private String freeService;

    public Room(){
    }

    public Room(String serviceName, int areaUsed, int rentalCost, int maxPeople, Date typeOfRent, String freeService) {
        super(serviceName, areaUsed, rentalCost, maxPeople, typeOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
