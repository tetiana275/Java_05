import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive testing happy Path
    // if (start <= end)
    //return array;

    //start < end
    @Test
    public void testStartLessThanEnd_HappyPath() {
        ///AAA
        //1. arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //2. act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //3. assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    // start == end
    @Test
    public void testStartEqualsEnd_HappyPath() {
        ///AAA
        //1. arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //2. act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //3. assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //start < end

    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
        ///AAA
        //1. arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11", "Buzz",
                "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1" };

        //2. act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //3. assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //2. Negative testing
    // if (start > end)
    //return new String[0];
    @Test
    public void testStartGreaterThanEnd_Negative() {
        ///AAA
        //1. arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //2. act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //3. assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}