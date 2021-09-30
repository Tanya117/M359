public class IceCreamTester {
    public static void main(String[] args) {
        IceCream bob = new IceCream("Rocky Road", 3, true);
        IceCream sha = new IceCream("Mint Chip", 2, false);
        IceCream aubrey = new IceCream("Mint Chip", 2, false);
        IceCream riley = bob;

        // How many variable references have I made?
        // we created 4 reference variables bob,sha,aubrey,riley
        // How many objects have I instantiated?
        // we created/instantiated 3 ice cream objects
        // Write in comments what you think the output would be THEN run
        // the code to see if you are correct
        //.equals compares contents
        //== compares references (connected to same object ex.bob/riley)
        System.out.println(bob.equals(sha));        //false
        System.out.println(aubrey.equals(sha));     //true
        System.out.println(bob.equals(riley));      //true
        System.out.println(aubrey == sha);          //false
        System.out.println(riley == bob);           //true

        System.out.println(bob.compareTo(sha));     //1 (positive)
        System.out.println(aubrey.compareTo(bob));  //-1 (negative)
        System.out.println(aubrey.compareTo(sha));  //0
    }
}
