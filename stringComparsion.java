public class stringComparsion {
    public static void main(String[] args) {
        String a  = "Kunal";
        String b = "Kunal";

        System.out.println(a==b); // returns true, it checks if reference variable is pointing to same object

        // to create different object, use new keyword

        String name = new String("Helo");
        String name1 = new String("Helo");

        System.out.println(name==name1); // returns false as new obejct is created 

        System.out.println(name.equals(name1)); //returns true as value is same 


    }
}
