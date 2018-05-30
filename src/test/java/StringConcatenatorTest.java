import org.junit.Assert;
import org.junit.Test;

public class StringConcatenatorTest {

    @Test
    public void CconatTest() {
        Assert.assertEquals("Majom", StringConcatenator.concat("Ma","jom"));
    }

    public void concatNull() {

        Assert.assertEquals("null-majom",StringConcatenator.concat(null,"-najon"));
    }
}
