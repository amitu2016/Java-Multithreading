package Thread_Join;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        ComplexCalculation cal = new ComplexCalculation();
       BigInteger result = cal.calculateResult(new BigInteger("20"),new BigInteger("100"),new BigInteger("30"),new BigInteger("100"));
       System.out.println(result);
    }
}
