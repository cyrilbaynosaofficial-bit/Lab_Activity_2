public class car extends vehicle {
   private int numberOfDoors;
   
   public car(String brand, String model, int year, int numberOfDoors) {
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
      System.out.println("Car is Running");
   }
   @Override
   public void moveLeft() {
      System.out.println("Car is turning left");
   }
   @Override
   public void moveBackward() {
      System.out.println("Car is doing reverse gear");
   }
   @Override
   public void moveRight() {
      System.out.println("Car turning right");
   }       

}