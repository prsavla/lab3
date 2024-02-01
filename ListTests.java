import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> testList= new ArrayList<>();
        testList.add("hellooooooooo");
        testList.add("world");
        testList.add("!");
        StringChecker a = new Tester();
        

        
        List<String> expected  = new ArrayList<>();
        expected.add("world");
        expected.add("!");

        assertEquals(expected,ListExamples.filter(testList,a));

    }
    @Test
    public void testMerge() {
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");

        List<String> testList1 = new ArrayList<>();
        testList1.add("c");
        testList1.add("d");

        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("a");
        expectedOutput.add("b");
        expectedOutput.add("c");
        expectedOutput.add("d");

        List<String> gottenOutput = ListExamples.merge(testList,testList1);
        
        assertEquals(expectedOutput,gottenOutput);

    }
}