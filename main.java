class Main {
   public static void main(String[] args) {
   
      Vehicle v1 = new Vehicle("BMW", "BMW M4", 2014);      
      Vehicle v2 = new Vehicle("Lamborghini", "Countach", 1974);      
      Vehicle v3 = new Vehicle("Porsche", "911 GT3 (991)", 2013);
      
       v1.displayInfo();
        System.out.println("Age:" + v1.calculateAge());
        System.out.println("Vintage:" + v1.isVintage()); 
        System.out.println();

       v2.displayInfo();
        System.out.println("Age:" + v2.calculateAge());
        System.out.println("Vintage:" + v2.isVintage()); 
        System.out.println();
        
       v3.displayInfo();
        System.out.println("Age:" + v3.calculateAge());
        System.out.println("Vintage:" + v3.isVintage());
       
       System.out.println("\n-Test years-\n");
        
       v1.setYear(2000);
       v1.displayInfo();
        System.out.println(v1.setYear(2000));
        System.out.println("Age:" + v1.calculateAge());
        System.out.println("Vintage:" + v1.isVintage());
        System.out.println();
        
       v1.setYear(2000);
       v1.displayInfo();
        System.out.println(v1.setYear(1885));
        System.out.println("Age:" + v1.calculateAge());
        System.out.println(); 
      
       v1.setYear(2000);
       v1.displayInfo();
        System.out.println(v1.setYear(2027));
        System.out.println("Age:" + v1.calculateAge());
        System.out.println();
        
   }
}  

