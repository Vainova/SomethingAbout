package taskOne;

public class Animals {
    static int countAnimal = 0;
    String name;

    public Animals() {
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public void running (int length) {
        System.out.println( name + "пробежал" + length + "м");
    }

    public void swimming (int length) {
        System.out.println(name + "проплыл" + length + "м");
    }
}
