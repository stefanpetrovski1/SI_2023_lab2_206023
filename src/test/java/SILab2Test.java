import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SILab2Test {

    // Multiple condition tests
    @Test
    public void userIsNullTest() {
        RuntimeException ex;
        User user = null;
        List<User> users = null;

        // user is null, others are anything
        ex = Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, users);
        });
        Assertions.assertEquals("Mandatory information missing!", ex.getMessage());

    }

    @Test
    public void passwordIsNullTest() {
        RuntimeException ex;
        User user = new User("stefan206023finki", null, "email");
        List<User> users = null;

        // user is not null, password is null, email is anything
        ex = Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, users);
        });
        Assertions.assertEquals("Mandatory information missing!", ex.getMessage());
    }

    @Test
    public void emailIsNullTest() {
        RuntimeException ex;
        User user = new User("stefan206023finki", "password", null);
        List<User> users = null;

        // user is not null, password is not null, email is null
        ex = Assertions.assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, users);
        });
        Assertions.assertEquals("Mandatory information missing!", ex.getMessage());
    }

    @Test
    public void noExceptionTest() {

        User user = new User("stefan206023finki", "password", "email");
        List<User> users = null;

        // user is not null, password is null, email is not null
        Assertions.assertDoesNotThrow(() -> SILab2.function(user, users));
    }


}
