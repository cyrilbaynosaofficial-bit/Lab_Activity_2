class Main {
   public static void main(String[] args) {
   
      Vehicle v1 = new Vehicle("BMW", "BMW M4", 2014);
      v1.displayInfo();
      v1.calculateAge();
      v1.isVintage();
      
      System.out.println();
      
      Vehicle v2 = new Vehicle("Lamborghini", "Countach", 1974);
      v2.displayInfo();
      v2.calculateAge();
      v2.isVintage();  
      
      System.out.println();
      
      Vehicle v3 = new Vehicle("Porsche", "911 GT3 (991)", 2013);
      v3.displayInfo();
      v3.calculateAge();
      v3.isVintage();
   }
}  