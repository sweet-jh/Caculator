/**
 * Created by hjing on 12/8/16.
 */
public class CaculateMain {

    public static void main(String args[])
    {
        double result;

        OperationFactory operationFactory = new OperationFactory();

        Operation oper = operationFactory.getSpecifyOperation('+');
        oper.setNumberA(5);
        oper.setNumberB(3.2);
        result = oper.caculate();
        System.out.println(result);

        oper = operationFactory.getSpecifyOperation('-');
        oper.setNumberA(5);
        oper.setNumberB(3.2);
        result = oper.caculate();
        System.out.println(result);

        oper = operationFactory.getSpecifyOperation('*');
        oper.setNumberA(5);
        oper.setNumberB(3.2);
        result = oper.caculate();
        System.out.println(result);

        oper = operationFactory.getSpecifyOperation('/');
        oper.setNumberA(5);
        oper.setNumberB(3.2);
        result = oper.caculate();
        System.out.println(result);
    }

}
