package review.candidates_manager.services;

import review.candidates_manager.models.Candidates;

import java.util.ArrayList;
import java.util.List;

public interface IReadAndWrite {

    public void writeFile(Candidates candidates);
    public List readFile();
}
