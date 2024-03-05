package Studentmethodoverriding;
public class Info {
    public String mobileno;
    public Student student;
    @Override
    public String toString() {
        return "Info{" +
                "mobileno='" + mobileno + '\'' +
                ", student=" + student +
                '}';
    }
    public String extrainfo(String mobileno) {
        String info = (mobileno);
        return info;
    }
}