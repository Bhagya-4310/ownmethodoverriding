package Studentmethodoverriding;
public class Student{
    public String name;
    public String address;
    public int rollnumber;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollnumber=" + rollnumber +
                '}';
    }
    public String info(String name, String address, int rollnumber){
        String stdinfo=(name+" "+address +rollnumber);
        return stdinfo;
    }
}
