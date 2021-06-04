public class Student {

    private String name;
    private int roll_no;
    private String phone;
    private String address;

    public Student() {
    }

    public Student(String name, int roll_no, String phone, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println("Roll Number: " + roll_no + " | Phone: " + phone + " | Address: " + address);
    }
}
