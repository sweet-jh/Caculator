import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by hjing on 12/9/16.
 */
public class OperationAddTest {
    @Test
    public void shouldReturn5When2Add3()
    {
        OperationAdd operationAdd = new OperationAdd();
        operationAdd.setNumberA(2);
        operationAdd.setNumberB(3);
//        assertEquals(5.0,operationAdd.caculate());
        assertTrue(operationAdd.caculate() == 5.0);
    }
}
