import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by hjing on 12/9/16.
 */
public class OperationFactoryTest {
    @Test
    public void shouldReturnOperationMinutsObjest()
    {
        OperationFactory operationFactory = new OperationFactory();
        assertTrue(operationFactory.getSpecifyOperation('-').getClass().equals(OperationMinute.class));
    }
}
