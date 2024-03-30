package Hogwarts;

public class HufflepuffStudents extends HogwartsStudents {
    private int labor;//трудолюбие
    private int loyalty;//верность
    private int honesty;//Честность

    public HufflepuffStudents(String fullName, int witchcraft, int transgression, int labor, int loyalty, int honesty) {
        super(fullName, witchcraft, transgression);
        this.labor = labor;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getLabor() {
        return labor;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setLabor(int labor) {
        this.labor = labor;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    protected int sumOfCharacteristics() {
        return labor + loyalty + honesty;
    }

    public void compareTo(HufflepuffStudents hufflepuffStudents) {
        compareToHogwartsStudent(hufflepuffStudents);
    }

    public String toString() {
        return super.toString() + ", трудолюбие: %d, верность: %d, чесность: %d.".formatted(labor, loyalty, honesty);
    }
}