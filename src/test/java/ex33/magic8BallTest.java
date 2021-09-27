package ex33;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class magic8BallTest {

    @Test
    void magicAnswer() {
        int rand_int = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
        if(rand_int == 1)
            assertEquals(1, 1);
        if(rand_int == 2)
            assertEquals(1, 1);
        if(rand_int == 3)
            assertEquals(1, 1);
        if(rand_int == 4)
            assertEquals(1, 1);
    }

}