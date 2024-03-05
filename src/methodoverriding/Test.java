package methodoverriding;

public class Test {
        public static void main(String[] args) {
            Addition addition = new Addition();
            addition.a = 10;
            addition.b = 20;
            int additionResult= addition.add(10,20);
            System.out.println(additionResult);
            Division division = new Division();
            division.d = 5;
            division.addition = addition;
            int divisionResult = division.division();
            System.out.println("Division result: " + divisionResult);
        }
    }