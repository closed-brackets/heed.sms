import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void printHelloWorld(){
        Assert.assertEquals(HelloWorld.print(),"Hello");
    }
}
