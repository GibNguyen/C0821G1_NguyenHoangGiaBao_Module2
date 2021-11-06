package _21_behavioral_design_patterns.thuchanh.strategy;

import java.util.List;

public class SelectionSort implements SortStrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
