package taskOne;

public class Cat extends Animals {
   public static int countCat = 0;
   private final String name;
   private final int catNeedEat;

   private boolean fullness;

    public static int getCountCat() {
        return countCat;
    }

   public Cat(String name, int catNeedEat) {
       super();
       countCat++;
       this.name = name;
       this.fullness = false;
       this.catNeedEat = catNeedEat;
   }

   @Override
   public void running(int length) {
       if  (length > 200) {
           System.out.println( name + " " +  "не может бежать больше 200 м ");
           } else {
           System.out.println(name + " " +  "пробежал" + " " +  length + " " +  "м");
       }
   }

   @Override
   public void swimming(int length) {
           System.out.println("Кот не умеет плавать");
   }

   public void eatFromBowl(Bowl bowl) {
       String result = bowl.feedByBowl(this.catNeedEat);

       if (result == "Котик покушал") {
            this.fullness = true;
            System.out.println(name + " " + " наелся" + " " + "fullness:"  + " " +  fullness );
       } else {
            System.out.println(name + " " + "не кушал,еды в миске мало" + " " + " fullness:" + " " + fullness );
       }
    }
}
