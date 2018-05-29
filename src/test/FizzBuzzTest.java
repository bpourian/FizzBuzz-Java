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


}