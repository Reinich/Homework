package Talk_1_Calc;

public class CalcMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Number multiply = calculator.multiply(5, 5);
        System.out.println(multiply.intValue());

        Number sum = calculator.sum(5, 1.5);
        System.out.println(sum.floatValue());

        Number sum1 = calculator.sum(5, 1);
        System.out.println(sum1.intValue());

        Number divide1 = calculator.divide(5, 3);
        System.out.println(divide1.floatValue());

        Number divide = calculator.divide(5, 0);
        System.out.println(divide.floatValue());

    }
}