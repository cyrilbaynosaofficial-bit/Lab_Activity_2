public class truck extends vehicle{
   private int numberOfDoors;
   
   public truck(String brand, String model, int year, int numberOfDoors) {
   super (brand, model, year);
   this.numberOfDoors = numberOfDoors;
     
   }
   
   @Override
   public void displayInfo() {
      super.displayInfo();
      System.out.println("Doors: " + numberOfDoors);
   }
   
   @Override
   public void moveForward() {
      System.out.println("Truck is climbing");
   }
   @Override
   public void moveLeft() {
      System.out.println("Truck is turning left");
   }
   @Override
   public void moveBackward() {
      System.out.println("Truck using reverse gear");
   }
   @Override
   public void moveRight() {
      System.out.println("Truck is going to park at right side");
   } 

}