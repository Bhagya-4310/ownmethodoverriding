package Address;
public class Student {
    String name;
    int number;
    int id;
    public String studentt(String name, String number) {
        return "bhagi";
    }
    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", id=" + id +
                '}';
    }
    public String studentt(String name, int number, int id) {
        String studentbhagi =(name+" "+number +" "+id);
    return studentbhagi;
    }
}