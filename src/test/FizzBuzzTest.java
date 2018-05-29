import com.company.fizzbuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void FizzBuzzConverterLeavesNormalNumbersAlone(){
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();

        Assert.assertEquals("1", fizzbuzz.convert(1));
        Assert.assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    public void FizzBuzzConverterMultiplesOfThree(){
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzbuzz.convert(3));
    }

    @Test
    public void FizzBuzzConverterMultiplesOfFive(){
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();

        Assert.assertEquals("Buzz", fizzbuzz.convert(5));
    }

    @Test
    public void FizzBuzzConverterMultipleOfThreeAndFive(){
        FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzbuzz.convert(15));
    }


}