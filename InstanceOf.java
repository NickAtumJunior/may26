 class InstanceOf {
}
    

    class Child extends InstanceOf {
    }

   
    class GFG {

       
        public static void main(String[] args) {

           
            Child cobj = new Child();

            if (cobj instanceof Child)
                System.out.println("cobj is instance of Child");
            else
                System.out.println(
                        "cobj is NOT instance of Child");

            if (cobj instanceof InstanceOf)
                System.out.println(
                        "cobj is instance of Parent");
            else
                System.out.println(
                        "cobj is NOT instance of Parent");

          
            if (cobj instanceof Object)
                System.out.println(
                        "cobj is instance of Object");
            else
                System.out.println(
                        "cobj is NOT instance of Object");
        }
    }

