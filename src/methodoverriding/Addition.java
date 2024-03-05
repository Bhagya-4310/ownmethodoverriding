package methodoverriding;
public class Addition {
    public int a;
    public int b;

    @Override
    public String toString(){
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public int add(int a, int b){
        int c=a+b;
        return c;
    }
}
