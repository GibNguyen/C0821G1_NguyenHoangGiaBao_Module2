package review.candidates_manager.services;

import review.candidates_manager.models.Candidates;

import java.io.FileWriter;
import java.util.List;

public interface ICandidateService {
    public void creatExperienceCandidate();
    public void creatFresherCandidate();
    public void creatInternCandidate();
    public void searchCandidates();
    public void showAll();

}
