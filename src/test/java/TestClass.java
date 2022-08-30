
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestClass {

    @Test
    public void testProps()
    {
        BankAccount a = new BankAccount(100, -1000);
        a.setOwner("Lisa");
        assertEquals(a.getOwner(), "Lisa");
    }

    @Test
    public void testConstructor()
    {
        BankAccount a = new BankAccount(100, -1000, "Bob");
        assertEquals(a.getOwner(), "Bob");
    }
    
    @Test
    public void testToString()
    {
        BankAccount a = new BankAccount(100, -1000, "Bob");
        String s = a.toString();
        boolean start = s.startsWith("Balance");
        boolean end = s.endsWith("100");
        boolean owner = s.indexOf("Bob") != -1;
        assertEquals(start && end && owner, true);
    }
}
