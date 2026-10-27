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


}