public class motorcycle extends vehicle {
   private String transmissionType;
   
   public motorcycle(String brand, String model, int year, String transmissionType) {
   super (brand, model, year);
   this.transmissionType = transmissionType;
     
   }
   
   @Override
   public void displayInfo() {
      super.displayInfo();
      System.out.println("Type: " + transmissionType);
   }
   
   @Override
   public void moveForward() {
      System.out.println("Motorcycle is overspeeding");
   }
   @Override
   public void moveLeft() {
      System.out.println("Motorcycle is trying to bangking left");
   }
   @Override
   public void moveBackward() {
      System.out.println("Motorcycle is going to park");
   }
   @Override
   public void moveRight() {
      System.out.println("Motorcycle is trying to bangking right");
   } 

}