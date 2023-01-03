package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Maksymilian", "Żmijewski");
        Tasks task1 = new Tasks("programming", "creating programs", 1, person1);

        Person person2 = new Person("Jan", "Kowalski");
        Tasks task2 = new Tasks("restoration", "restoration old cars",
                 1, person2);

        Tasks task3 = new Tasks("cleaning", "cleaning house");

        Tasks task4 = new Tasks("playing", "playing cards", 0);

        System.out.println(task1.highPriority());
        System.out.println(task2.mediumPriority());
        System.out.println(task4.mediumPriority());

    }
}
