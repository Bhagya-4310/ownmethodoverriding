package methodoverriding;
public class Division {
    public int d;
    public Addition addition;

    @Override
    public String toString() {
        return "Division{" +
                "d=" + d +
                ", addition=" + addition +
                '}';
    }
    public int division(){
        int e =(addition.a+ addition.b)/d;
        return e;
    }
}