package _19_creational_design_patterns.thuchanh.object_pool;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
