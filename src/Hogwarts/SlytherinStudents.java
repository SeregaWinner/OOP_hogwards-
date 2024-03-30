package Hogwarts;

public class SlytherinStudents extends HogwartsStudents {
    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition;//амбициозность
    private int resourceful;//находчивость
    private int lord;//жажда власти

    public SlytherinStudents(String fullName, int witchcraft, int transgression, int cunning,
                             int determination, int ambition, int resourceful, int lord) {
        super(fullName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceful = resourceful;
        this.lord = lord;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getLord() {
        return lord;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public void setLord(int lord) {
        this.lord = lord;
    }
    @Override
    protected int sumOfCharacteristics() {
        return cunning + determination + ambition + resourceful + lord;
    }

    public void compareTo(SlytherinStudents slytherinStudents) {
        compareToHogwartsStudent(slytherinStudents);
    }

    public String toString() {
        return super.toString() + ", хитрость: %d, решительность: %d, амбициозность: %d, находчивость: %d, жажда власти: %d.."
                .formatted(cunning, determination, ambition, resourceful, lord);
    }
}
