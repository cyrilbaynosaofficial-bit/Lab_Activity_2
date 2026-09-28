class vehicle {

   String brand;
   String model;
   int year;
   
   void displayInfo() {
      System.out.println(brand);
   }
      
   void calculateAge() {
      int currentYear = 2026;
      int age = currentYear - year;
      System.out.println("Car is " + age + " years old.");
   }
   
   void isVintage() {
      int currentYear = 2026;
      int age = currentYear - year;
         if (age >= 25) {
          System.out.println("Its vintage.");
       } else {
            System.out.println("Its not a vintage.");
         }
         
   }
}
