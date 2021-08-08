package Homework_4;

public class Lesson_4 {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(200, 0), new Dog(500, 10)};
        for (Animal an : animal)
            System.out.println(
                    an.getClass().getName() +
                            "\nrun: " + an.run(200) +
                            "\nswim: " + an.swim(5));
    }
}

