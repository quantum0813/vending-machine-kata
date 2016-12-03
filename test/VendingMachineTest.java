import com.pillar.kata.vendatron.Product;
import com.pillar.kata.vendatron.VendingMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VendingMachineTest {
    @Test
    public void whenProductNameNullThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product(null, 0.0f);
        });
    }
}
