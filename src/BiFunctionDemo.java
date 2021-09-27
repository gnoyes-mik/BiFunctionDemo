import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {
        String str1 = "hi,";
        String str2 = "Gnoyes";

        /** func1 = String concat **/
        BiFunction<String, String, String> func1 = (s1, s2) -> s1 + s2;
        String result = func1.apply(str1, str2);
        System.out.println("result = " + result);


        /** func2 = wrap "result = " format **/
        Function<String, String> func2 = (s1) -> "result = " + s1;
        System.out.println(func1.andThen(func2).apply(str1, str2));


        /** BiFunction Example Using Number Class **/
        Number number = new Number(12);

        Number additionNumber = number.calculate(NumberOperator.ADDITION, new Number(8));
        System.out.println("additionNumber = " + additionNumber);

        Number minusNumber = number.calculate(NumberOperator.MINUS, new Number(8));
        System.out.println("minusNumber = " + minusNumber);

        Number multiplicationNumber = number.calculate(NumberOperator.MULTIPLICATION, new Number(8));
        System.out.println("multiplicationNumber = " + multiplicationNumber);

        Number divisionNumber = number.calculate(NumberOperator.DIVISION, new Number(4));
        System.out.println("divisionNumber = " + divisionNumber);

        Number zeroDivision = number.calculate(NumberOperator.DIVISION, new Number(0));
    }
}
