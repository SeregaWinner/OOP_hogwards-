package Hogwarts;

public class RavenclawStudents extends HogwartsStudents {
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creative;//творчество

    public RavenclawStudents(String fullName, int witchcraft, int transgression, int mind, int wisdom, int wit, int creative) {
        super(fullName, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    protected int sumOfCharacteristics() {
        return mind + wisdom + wit + creative;
    }

    public void compareTo(RavenclawStudents ravenclawStudents) {
        compareToHogwartsStudent(ravenclawStudents);
    }

    public String toString() {
        return super.toString() + ", ум: %d, мудрость: %d, остроумие: %d, творчество: %d."
                .formatted(mind, wisdom, wit, creative);
    }
}
