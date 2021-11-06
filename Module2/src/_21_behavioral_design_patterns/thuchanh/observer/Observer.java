package _21_behavioral_design_patterns.thuchanh.observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
