package src.Home_work;

public class Chocolate extends Product{
  private double calories;

  public double getCalories() {
      return calories;
  }

  public void setCalories(double calories) {
      this.calories = calories;
  }

  public Chocolate(String brand, String name, double price, double calories) {
      super(brand, name, price);
      if (calories >= 0){
          this.calories = calories;
      }
      else{
          this.calories = 100;
      }
  }

  @Override
  public String displayInfo() {
      return String.format("Name: %s, Calories: %.2f, Price: %.2f\nBrand: %s",
      name, calories, price, brand);
  }
}
