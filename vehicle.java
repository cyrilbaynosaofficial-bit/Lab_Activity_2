public class vehicle {

   private String brand;
   private String model;
   private int year;
   
   public vehicle(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year= year;
   }
   
   public void displayInfo() {
      System.out.println("Brand: " + brand + ", Model: " + model);
   }
      
   public void calculateAge() {
      int currentYear = 2026;
      int age = currentYear - year;
      System.out.println("Car is " + age + " years old.");
   }
   
   public void isVintage() {
      int currentYear = 2026;
      int age = currentYear - year;
         if (age >= 25) {
          System.out.println("Its vintage.");
       } else {
            System.out.println("Its not a vintage.");
         }
         
   }
}
