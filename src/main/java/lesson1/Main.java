package lesson1;

public class Main {

    public static void main(String[] args) {
        Animal bobik = new Dog("Bobik", 500, 15);
        Animal kuzya = new Cat("Kuzya", 500, 15);
        Animal tigra = new Tiger("Tigra", 500, 15);


        Animal[] animals = {
                new Dog("Bars", 56712, 9),
                new Cat("Tom", 333, 15),
                new Tiger("Tigrun", 12, 15),
                new Tiger("Tigruna", 12, 15)
        };


        for (Animal animal : animals) {
            animal.run();
        }

        System.out.println(animals.length);
    }
}
