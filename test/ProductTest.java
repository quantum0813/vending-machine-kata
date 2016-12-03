import com.pillar.kata.vendatron.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {
    @Test
    public void whenProductNameNullThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product(null, 0.0f);
        });
    }
}
