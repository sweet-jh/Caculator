import javax.management.OperationsException;

/**
 * Created by hjing on 12/8/16.
 */
public class OperationFactory {
    private Operation oper;

    public Operation getSpecifyOperation(char operation) {
        switch (operation)
        {
            case '+':
                oper = new OperationAdd();
                break;
            case '-':
                oper = new OperationMinute();
                break;
            case '*':
                oper = new OperationMutiple();
                break;
            case '/':
                oper = new OperationDivide();
                break;
            default:
                break;
        }
        return oper;
    }
}
