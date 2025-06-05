package org.cisu.exceptions;

import javax.security.auth.login.AccountException;
import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException {
        // defencive programming
        if (value <= 0) {
            throw new IOException("Value must be greater than zero");
        }
    }
}
