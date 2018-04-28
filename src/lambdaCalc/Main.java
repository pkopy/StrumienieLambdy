package lambdaCalc;

public class Main {
    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        IntegerMath add = (a, b) -> a + b;
        IntegerMath sub = (a, b) -> a - b;
        System.out.println(myApp.operatorBinary(40, 2, add));
        System.out.println(myApp.operatorBinary(25, 6, sub));
    }
}
