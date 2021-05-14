package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
   private String name;
   private Dought dough;
   private List<Topping> topping;

   public Pizza(String name, int numberOfToppings) {
      this.setName(name);
      this.setTopping(numberOfToppings);
   }

   public String getName() {
      return name;
   }

   private void setName(String name) {
      if(name.trim().isEmpty() || name.length() > 15){
         throw new IllegalArgumentException
                 ("Pizza name should be between 1 and 15 symbols.");
      }
      this.name = name;
   }

   public Dought getDough() {
      return dough;
   }

   public void setDough(Dought dough) {
      this.dough = dough;
   }

   public List<Topping> getTopping() {
      return topping;
   }

   private void setTopping(int numberOfToppings) {
      if (numberOfToppings <= 0 || numberOfToppings > 10) {
         throw new IllegalArgumentException
                 ("Number of toppings should be in range [0..10].");
      }
      this.topping = new ArrayList<Topping>();
   }
   public void addTopping(Topping topping){
      this.getTopping().add(topping);
   }
   public double getOverallCalories(){
      return this.getDough().calculateCalories() + this.getTopping()
              .stream()
              .mapToDouble(Topping::calculateCalories)
              .sum();
   }

}

