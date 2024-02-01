import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest {

    @Test
    public void testPrepend() {
        LinkedList test1 = new LinkedList();
        test1.prepend(4);
        test1.prepend(5);
        test1.prepend(1);

        assertEquals(1,test1.root.next.value);
        assertEquals(5,test1.root.next.next.value);
        assertEquals(4,test1.root.next.next.next.value);

    }

     @Test
    public void testAppend() {
        LinkedList test1 = new LinkedList();
        test1.append(4);
        test1.append(5);
        test1.append(1);

        assertEquals(4,test1.root.next.value);
        assertEquals(5,test1.root.next.next.value);
        assertEquals(1,test1.root.next.next.next.value);

    }

}