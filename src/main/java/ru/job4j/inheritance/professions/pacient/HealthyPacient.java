package ru.job4j.inheritance.professions.pacient;

public class HealthyPacient {
    private String name = "Дмитрий";
    private Diagnosis diagnose;

    public Diagnosis getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnosis diagnose) {
        this.diagnose = diagnose;
    }

    private String getName() {
        return name;
    }
}
