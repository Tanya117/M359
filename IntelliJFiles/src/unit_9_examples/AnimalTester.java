package unit_9_examples;


/**
 * Lesson 7-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 *
 * @author   Mrs. Denna
 */
public class AnimalTester
{
    public static void main(String [] args)
    {
        Animal[] barn = new Animal[6];
        // 1. What data type does this array hold?
        //animal objects,Strings

        barn[0] = new Animal("Murphy");
        barn[1] = new Cow("Daisy", "Dairy");
        barn[2] = new Pig("Wilbur", false);
        barn[3] = new Cow("Billy", "Beef");
        barn[4] = new Animal("Maggie");
        barn[5] = new Pig("Max", true);

        // 2. Did I ONLY store Animal objects in this array?  If not, why do you
        //    think this was allowed?
        //No, cow and pig objects too because they extend the animal class and are more specific

        for (Animal a: barn)
            a.speak();

        // 3. What method is getting called here?  The speak method of the Animal class?
        //speak method of each object from either class

        // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
        //6 animals are added to the 2d array barn and each have their own properties because some extend the animal class
        //making them more specific with diff variables/overriden methods
    }

}
