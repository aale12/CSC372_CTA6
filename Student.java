package CSC273.CSC372_CTA6;

public class Student {

    private int rollno;
    private String name;
    private String address;

    //constructor
    public Student(String address, String name, int rollno) {
        this.address = address;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("rollno=").append(rollno);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
