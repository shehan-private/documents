public class Demo6 {
    public static void main(String[] args) {
        
        float myFloat = 2.23f;
        myFloat = myFloat++; // Assigned 2.23 to the myFloat before increment

        System.out.println(myFloat);
        System.out.println(--myFloat);

        float myFloat2 = 5.23f;
        System.out.println(~myFloat2); //  * Cannot use bitwise opearators(tilda) with floating numbers


    }
}
