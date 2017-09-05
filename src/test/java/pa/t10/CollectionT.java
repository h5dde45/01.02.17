package pa.t10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class CollectionT {

    @Test
    public void arrayConteins() {
        List<User> users=new ArrayList<>();
        users.add(new User("1","first"));
        users.add(new User("2","second"));

        assertTrue(users.contains(new User("1","first")));
    }

    @Test
    public void setAdd() {
        Set<User> users=new HashSet<>();
        users.add(new User("1","first"));
        users.add(new User("2","second"));

        assertEquals(2,users.size());
    }

}
