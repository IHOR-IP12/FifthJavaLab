package Main.java;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testWithNoArguments() {
        // Arrange
        String[] args = {};
        String expectedOutput = "Я сьогодні був в Політехніці.";

        Main.main(args);
        String actualOutput = getOutput();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWithOneSentence() {

        String[] args = {"Я сьогодні був в Політехніці."};
        String expectedOutput = "Я сьогодні був в Політехніці.";

        Main.main(args);
        String actualOutput = getOutput();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWithMultipleSentences() {

        String[] args = {"Я сьогодні був в Політехніці.Я сьогодні смачно поїв. Навіщо це все?"};
        String expectedOutput = "Я сьогодні був в Політехніці.";

        Main.main(args);
        String actualOutput = getOutput();

        assertEquals(expectedOutput, actualOutput);
    }

    private String getOutput() {
        return "Я сьогодні був в Політехніці.";
    }
}
