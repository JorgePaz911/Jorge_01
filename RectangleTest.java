public class RectangleTest {


    public static void main(String[] args) {

        pointFive();

    }

    /**
     * Create 2 rectangles with sides (4,5) and (5,8).
     * Print Area of each rectangle.
     * Pass length and width through the constructor.
     */
    private static void pointFive(){
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,8);
        System.out.println("Area: " + rectangle1.area());
        System.out.println("Area: " + rectangle2.area());
    }
}
