package Hogwarts;

public class GryffindorStudents extends HogwartsStudents {
    private int generosity;//благородство
    private int honor;//честь
    private int bravery;//храбрость


    public GryffindorStudents(String fullName, int witchcraft, int transgression, int generosity, int honor, int bravery) {
        super(fullName, witchcraft, transgression);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getGenerosity() {
        return generosity;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setGenerosity(int generosity) {
        this.generosity = generosity;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    protected int sumOfCharacteristics() {
        return generosity + honor + bravery;
    }

    public void compareTo(GryffindorStudents gryffindorStudent) {
        compareToHogwartsStudent(gryffindorStudent);
    }

    public String toString() {
        return super.toString() + ", благородство: %d, честь: %d, храбрость: %d.".formatted(generosity,honor,bravery);
    }
}
