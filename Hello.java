package reference;
/**
 * Hello
 */
public class Hello {
    static String from;
    public static void main(String[] args) {
        // add spaces for better output
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
        
        System.out.println("Hello World");
        //String from = "Sarah";
        from = "Tom";
        sayHello();

        // spool up car objectxs
        Car myCar = new Car();
        myCar.tireCount = 4;
        myCar.display();

        // add spaces for better output
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }

        CarBlackBox myBlackBoxCar = new CarBlackBox();
        myBlackBoxCar.display();

        // add spaces for better output
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
    }

     static void sayHello() {
        System.out.println("Hello World from " + from);
    }
}
