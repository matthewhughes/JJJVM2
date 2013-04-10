/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 10/04/13
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
public class OpCodeActions {

    Registers Reg = new Registers(); // from The Bill
    public static void StoreDirect(int RegAdd){
        if(RegAdd > 24){
            System.out.println("Register Address Out Of Bounds");
            System.out.println("Catastrophic failure");
            System.exit(1);
        }
        Registers Reg = new Registers(); // from The Bill
        int Accumulator = Reg.GetAcc();
        Reg.SetReg(Accumulator, RegAdd);
    }

}
