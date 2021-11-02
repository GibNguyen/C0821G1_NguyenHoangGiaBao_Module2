package _19_creational_design_patterns.thuchanh.factory_method;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
