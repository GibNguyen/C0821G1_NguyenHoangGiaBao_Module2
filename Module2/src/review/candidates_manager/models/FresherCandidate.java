package review.candidates_manager.models;

import review.candidates_manager.models.Candidates;

import java.util.Date;

public class FresherCandidate extends Candidates {
    Date graduationDate;
    String graduationRank;
    String education;
    int candidateType =1;

    public FresherCandidate() {
    }

    public FresherCandidate(int iD, String firstName, String lastName, int birthDay, String address, int phone, String email, int candidateType, Date graduationDate, String graduationRank, String education) {
        super(iD, firstName, lastName, birthDay, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public FresherCandidate(Date graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                ", candidateType=" + candidateType +
                '}';
    }
}
