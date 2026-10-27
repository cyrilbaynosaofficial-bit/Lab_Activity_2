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

}