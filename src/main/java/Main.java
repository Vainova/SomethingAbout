import taskOne.Animals;
import taskOne.Bowl;
import taskOne.Cat;
import taskOne.Dog;
import taskTwo.Circle;
import taskTwo.Inteface.GeometricShapes;
import taskTwo.Rectangle;
import taskTwo.Triangle;

public class Main{
    public static void main(String[] args) {
        Cat vasya = new Cat("Vasya",4);
        Cat murzik = new Cat("Murzik",6);
        Dog zuzha = new Dog("Zuzha");
        Dog butuz = new Dog("Butuz");

        vasya.swimming(100);
        murzik.swimming(0);
        zuzha.swimming(150);
        butuz.swimming(3);
        vasya.running(90);
        murzik.running(300);
        zuzha.running(550);
        butuz.running(390);

        System.out.println(Animals.getCountAnimal());
        System.out.println(Dog.getCountDog());
        System.out.println(Cat.getCountCat());

        Bowl bowl = new Bowl(10);
        Cat[] cats = {
                new Cat ("Kotik",4),
                new Cat ("Vasiliy",6),
                new Cat ("Murka",10),
        };

        for (Cat cat : cats) {
            cat.eatFromBowl(bowl);
        }

        System.out.println(bowl.getFood());
        bowl.addFood(5);
        System.out.println(bowl.getFood());

        //Task 2
        GeometricShapes circle = new Circle(8,"Green","Red");
        GeometricShapes rectangle = new Rectangle(4,5,"Red", "Yellow");
        GeometricShapes triangle = new Triangle("Violet","Green",5,7,8,2);

        System.out.println("Circle Perimeter:" + " " + circle.calculatePerimeter());
        System.out.println("Circle Area:" + " " + circle.calculateArea());
        System.out.println("Circle color:" + " " + circle.getColor());
        System.out.println("Circle borderColor:" + " " + circle.getBorderColor());

        System.out.println("Rectangle Perimeter:" + " " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area:" + " " + rectangle.calculateArea());
        System.out.println("Rectangle Color:" + " " + rectangle.getColor());
        System.out.println("Rectangle borderColor:" + " " + rectangle.getBorderColor());

        System.out.println("Triangle Perimeter:" + " " + triangle.calculatePerimeter());
        System.out.println("Triangle Area:" + " " + triangle.calculateArea());
        System.out.println("Triangle Color:" + " " + triangle.getColor());
        System.out.println("Triangle borderColor:" + " " + triangle.getBorderColor());
    }
}
