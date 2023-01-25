public class PrimitiveVariable {

    public static void main(String[] args) {
        String name = "Itay Hauptman";
        int myNum = 15;
        float myFloatNum = 15.99f;
        char myLetter = 'D';
        boolean myBool = false;

        // Widening Casting int to double
        int myInt = 20;
        double myDouble = myInt;

        //Narrowing Casting double to int
        double myDoublee = 11.87d;
        int myyInt = (int) myDoublee;

        // illegal type casting
        // double illegalDoublee = 11.87d;
        // int illegalInt = illegalDoublee;


        System.out.println(name);
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);

        System.out.println(myInt);
        System.out.println(myDouble);

        System.out.println(myDoublee);
        System.out.println(myyInt);

    }



}
