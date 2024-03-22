package org.example;

import Account.CreditAccount;
import Account.SimpleAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    SimpleAccount account = new SimpleAccount();
    CreditAccount account1 = new CreditAccount();


    @Test
    void main() {

    }

    @ParameterizedTest
    @ValueSource(ints = {5647, 456, -56, 0, 67})
    public void testWithParameter(int argument) {
        account.add(100000);
        account1.add(8000);
        Assertions.assertTrue(account.transfer(account1, argument));

    }
}