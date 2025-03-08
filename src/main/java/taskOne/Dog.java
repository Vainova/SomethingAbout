package taskOne;

public class Dog extends Animals {
    public static int countDog = 0;

    public static int getCountDog() {
        return countDog;
    }

    public Dog (String name) {
        super();
        countDog++;
        this.name =name;
    }

    @Override
    public void running (int length) {
        if (length > 500) {
            System.out.println( name + " " + "не может бежать больше 500 м ");
        } else {
            System.out.println(name + " " +  "пробежал" + " " +  length + " " + "м");
        }
    }

    @Override
    public void swimming (int length) {
        if (length > 10) {
            System.out.println("Собака не может плавать больше 10 метров!");
        } else {
            System.out.println( name + " " + "проплыл" + " " +  length + " " + "м");
        }
    }
}
