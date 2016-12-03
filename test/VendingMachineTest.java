import com.pillar.kata.vendatron.VendingMachine;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VendingMachineTest {
    private static VendingMachine vm;

    @BeforeAll
    public static void setup() {
        vm = new VendingMachine();
    }

    @Test
    public void assertVendingMachineInstanceNotNull() {
        assertNotNull(vm);
    }
}