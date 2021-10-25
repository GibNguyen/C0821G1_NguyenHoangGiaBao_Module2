package review.candidates_manager.models;

import review.candidates_manager.models.Candidates;

public class ExperienceCandicate extends Candidates {
    int experienceYear;
    String proSkill;
    int candidateType =0;

    public ExperienceCandicate(int iD, String firstName, String lastName, int birthDay, String address, int phone, String email, int candidateType, int experienceYear, String proSkill) {
        super(iD, firstName, lastName, birthDay, address, phone, email);
        this.experienceYear = experienceYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandicate(int experienceYear, String proSkill) {
        this.experienceYear = experienceYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandicate() {
    }

    public ExperienceCandicate(int experienceId, String experienceFirstName, String experienceLastName, int experienceDateOfBirth, String experienceAddress, int experiencePhone, String experienceEmail) {
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "ExperienceCandicate{" +
                "experienceYear=" + experienceYear +
                ", proSkill='" + proSkill + '\'' +
                ", candidateType=" + candidateType +
                '}';
    }
}
