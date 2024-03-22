package Account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleAccountTest {

    SimpleAccount account = new SimpleAccount();
    SimpleAccount account1 = new SimpleAccount();

    @Test
    void add() {
        Assertions.assertTrue(account.add(1000));
        Assertions.assertEquals(account.getBalance(), account1.getBalance());

    }

    @ParameterizedTest
    @ValueSource(ints = {5647, 456, -56, 0, 67})
    public void testWithParameter(int argument) {
        Assertions.assertTrue(account.add(argument));
    }

    @Test
    void pay() {
        account.add(1000);
        Assertions.assertTrue(account.pay(1000));
        Assertions.assertEquals(account.getBalance(), account1.getBalance());
    }
}