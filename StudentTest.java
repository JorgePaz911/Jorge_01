


public class StudentTest {

    public static void main(String[] args) {

        pointOne();
        pointTwo();

    }

    /**
     * Create student object with name 'John' and roll number '2'.
     */
    private static void pointOne(){
        Student student1 = new Student();
        student1.setName("John");
        student1.setRoll_no(2);
    }

    /**
     * Create 'Sam' and 'John'.
     * Assign and print roll number, phone number, and address.
     */
    private static void pointTwo(){
        Student student1 = new Student("Sam", 3, "333-3333", "242 Sam Ave.");
        Student student2 = new Student("John", 4, "444-4444", "1028 John Ave.");
        student1.print();
        student2.print();
    }

}
