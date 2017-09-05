package pa.t10;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void reflexive(){
        User pit=new User("1","1");
        assertEquals(pit,pit);
    }
    @Test
    public void symetric(){
        User pit1=new User("1","1");
        User pit2=new User("1","1");
        assertEquals(pit1,pit2);
        assertEquals(pit2,pit1);
    }
    @Test
    public void transitive(){
        User pit1=new User("1","1");
        User pit2=new User("1","1");
        User pit3=new User("1","1");
        assertEquals(pit1,pit2);
        assertEquals(pit2,pit3);
        assertEquals(pit1,pit3);
    }
    @Test
    public void consistens() {
        User pit1 = new User("1", "1");
        User pit2 = new User("1", "1");
        for (int i = 0; i < 11; i++) {
            assertEquals(pit1, pit2);
        }
    }
}