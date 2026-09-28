class main {
   public static void main(String[] args) {
   
      vehicle v1 = new vehicle();
      v1.brand = "BMW";
      v1.model = "BMW M4";
      v1.year = 2014;
      v1.displayInfo();
      v1.calculateAge();
      v1.isVintage();
      
      System.out.println();
      
      vehicle v2 = new vehicle();
      v2.brand = "Lamborghini";
      v2.model = "Countach";
      v2.year = 1974;
      v2.displayInfo();
      v2.calculateAge();
      v2.isVintage();  
      
      System.out.println();
      
      vehicle v3 = new vehicle();
      v3.brand = "Porsche";
      v3.model = "911 GT3 (991)";
      v3.year = 2013;
      v3.displayInfo();
      v3.calculateAge();
      v3.isVintage();
   }
}  