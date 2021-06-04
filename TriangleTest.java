public class TriangleTest {


    public static void main(String[] args) {

        pointThree();
        pointFour();

    }

    /**
     * Print area and perimeter of triangle with sides 3, 4, 5.
     * No parameters in constructor
     */
    private static void pointThree(){
        Triangle tri = new Triangle();
        tri.setSide1(3);
        tri.setSide2(4);
        tri.setSide3(5);
        System.out.println("Area: " + tri.area() + " | Perimeter: " + tri.perimeter());
    }

    /**
     * Print area and perimeter of triangle with sides 3, 4, 5.
     * With parameters in constructor
     */
    private static void pointFour(){
        Triangle tri = new Triangle(3,4,5);
        System.out.println("Area: " + tri.area() + " | Perimeter: " + tri.perimeter());
    }


}
