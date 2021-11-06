package _21_behavioral_design_patterns.thuchanh.strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
