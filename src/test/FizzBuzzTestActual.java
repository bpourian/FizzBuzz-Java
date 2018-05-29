package test;

import com.company.fizzbuzz.FizzBuzzConverter;
import org.junit.Test;

public class FizzBuzzTestActual {

    @Test
    public void OutPutTesForFizzBuzz(){
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();

        for (int i = 1; i < 100; i++) {
            System.out.println(fizzbuzz.convert(i));
        }
    }
}
