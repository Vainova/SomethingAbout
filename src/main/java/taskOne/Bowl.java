package taskOne;

public class Bowl {
   private int foodAmount;

   public int getFood() {
       return this.foodAmount;
   }

   public void addFood(int amount) {
       this.foodAmount = this.foodAmount + amount;
   }

   public Bowl(int firstFood) {
       this.foodAmount = firstFood;
   }

   public String feedByBowl(int feedFood) {
       if (foodAmount < feedFood) {
           return "Кот не может скушать больше чем есть в миске";
       } else {
           this.foodAmount = this.foodAmount - feedFood;

           return "Котик покушал";
       }
   }
}
