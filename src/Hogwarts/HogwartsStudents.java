package Hogwarts;

public abstract class HogwartsStudents {
    private final String fullName;
    private  int witchcraft;
    private  int transgressionDistance;


    public HogwartsStudents(String fullName,int witchcraft, int transgression) {
        this.fullName = fullName;
        this.witchcraft = witchcraft;
        this.transgressionDistance = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int sumOfBaseCharacteristics(){
        return witchcraft + transgressionDistance;

    }
    protected abstract int sumOfCharacteristics();
    public void compareToHogwartsStudent(HogwartsStudents hogwartsStudent){
        int sumOfBaseCharacteristics1 = this.sumOfBaseCharacteristics();
        int sumOfBaseCharacteristics2 = hogwartsStudent.sumOfBaseCharacteristics();
        if(sumOfBaseCharacteristics1>sumOfBaseCharacteristics2){
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    hogwartsStudent.getFullName(),
                    sumOfBaseCharacteristics1,
                    sumOfBaseCharacteristics2
            );
        }else  if(sumOfBaseCharacteristics1<sumOfBaseCharacteristics2){
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n",
                    hogwartsStudent.getFullName(),
                    this.getFullName(),
                    sumOfBaseCharacteristics2,
                    sumOfBaseCharacteristics1
            );
        }else {
            System.out.printf("Студент %s и %s одинаковые(%d vs %d)%n",
                    this.getFullName(),
                    hogwartsStudent.getFullName(),
                    sumOfBaseCharacteristics1,
                    sumOfBaseCharacteristics2
            );
        }
    }
    public void compareTo(HogwartsStudents hogwartsStudent){
        int sumOfCharacteristics1 = this.sumOfCharacteristics();
        int sumOfCharacteristics2 = hogwartsStudent.sumOfCharacteristics();
        if(sumOfCharacteristics1>sumOfCharacteristics2){
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    hogwartsStudent.getFullName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        }else  if(sumOfCharacteristics1<sumOfCharacteristics2){
            System.out.printf("Студент %s лучше студента %s (%d vs %d)%n",
                    hogwartsStudent.getFullName(),
                    this.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }else {
            System.out.printf("Студент %s и %s одинаковые(%d vs %d)%n",
                    this.getFullName(),
                    hogwartsStudent.getFullName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        }
    }

    public String toString(){
    return "%s, сила магии: %d, дистанция трансгрессии: %d".formatted(fullName,witchcraft,transgressionDistance);
    }
    public void print(){
        System.out.println(this);
    }
}
