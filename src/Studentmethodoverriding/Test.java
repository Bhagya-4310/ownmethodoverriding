package Studentmethodoverriding;
public class Test {
    public static void main(String[] args) {
    Student student=new Student();
       student.name="bhagi";
       student.address="kphb";
       student.rollnumber=4310;
        System.out.println(student);
        Info info=new Info();
        info.mobileno="1234";
        System.out.println(info);
    }
}
