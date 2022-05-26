class Abstarct {

    public static void main(String[] args) {
  
      // create a variable of string type
      String name = "Programiz";
      
      // checks if name is instance of String
      boolean result1 = name instanceof String;
      System.out.println("name is an instance of String: " + result1);
  
      // create an object of Abstarct
      Abstarct obj = new Abstarct();
  
      // checks if obj is an instance of Abstarct
      boolean result2 = obj instanceof Abstarct;
      System.out.println("obj is an instance of Abstarct: " + result2);
    }
  }