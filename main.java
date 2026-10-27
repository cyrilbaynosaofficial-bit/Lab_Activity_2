public class main {

   public static void printAll(vehicle vehicle) {
   vehicle.displayInfo();
   vehicle.calculateAge();
   vehicle.isVintage();
   }

   public static void main(String[] args) {
      
      System.out.println("**One Reference, Many Objects**\n");
      vehicle wow = new car("BMW", "BMW M4", 2014, 2);
      printAll(wow);
      System.out.println();
      
      wow = new motorcycle("Kawasaki", "Ninja ZX-10R", 2004, "Manual");
      printAll(wow);
      System.out.println();
      
      wow = new truck("Ford", "F-150", 2026, 4);
      printAll(wow);
      System.out.println();
      
      System.out.println("**One Method, Different Types**\n");
      car luxury = new car("Lamborghini", "Countach", 1974, 2);
      printAll(luxury);
      System.out.println();
      motorcycle dirt = new motorcycle("Honda", "CRF450R", 2023, "Manual");
      printAll(dirt);
      System.out.println();
      truck wheels = new truck("Toyota", "Hilux Conquest", 2024, 4);
      printAll(wheels);
      System.out.println();
      
      System.out.println("**Mixed Array**\n");
      vehicle[] collection = {
         
         new car("Porsche", "911 GT3 (991)", 2013, 2),
         new motorcycle("Ducati", "Panigale V4", 2024, "Manual"),
         new truck("Ford", "F-150 Raptor", 2023, 4)
      };
      
      for (vehicle coll : collection) {
            printAll(coll);
            System.out.println();
        }   
      
   }
}  