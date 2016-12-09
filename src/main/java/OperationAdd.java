/**
 * Created by hjing on 12/8/16.
 */
public class OperationAdd extends Operation {
    @Override
    public double caculate()
    {
        return this.getNumberA()+this.getNumberB();
    }
}
