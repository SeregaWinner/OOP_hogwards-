import Hogwarts.*;

public class Main {
    public static int genRandInt() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        GryffindorStudents harry = new GryffindorStudents("Гарри Поттер",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        GryffindorStudents germiona = new GryffindorStudents("Гермиона Грейнджер",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        GryffindorStudents ron = new GryffindorStudents("Рон Уизли",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());

        HufflepuffStudents zahari = new HufflepuffStudents("Захария Смит",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        HufflepuffStudents sedrik = new HufflepuffStudents("Седрик Диггори",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        HufflepuffStudents djastin = new HufflepuffStudents("Джастин Финч-Флетчли",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());

        RavenclawStudents chung = new RavenclawStudents("Чжоу Чанг",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        RavenclawStudents pudma = new RavenclawStudents("Падма Патил",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        RavenclawStudents markus = new RavenclawStudents("Маркус Белби",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());

        SlytherinStudents draco = new SlytherinStudents("Драко Малфой",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        SlytherinStudents grahem = new SlytherinStudents("Грэхэм Монтегю",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());
        SlytherinStudents gregory = new SlytherinStudents("Грегори Гойл",
                genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt(), genRandInt());

        System.out.println();

        ron.print();
        draco.compareTo(harry);
        harry.compareToHogwartsStudent(ron);
    }
}