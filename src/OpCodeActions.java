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
        TestRegBounds(RegAdd);
        Registers Reg = new Registers(); // from The Bill
        int Accumulator = Reg.GetAcc();
        Reg.SetReg(Accumulator, RegAdd);
        if(RegAdd == 24){
            System.out.println(Registers.GetReg(24));
            LogClass.STDOUTWrite(CreateOutputFiles.ReturnSTDOUT());
        }
    }
    public static void  LoadDirect(int RegAdd){
       TestRegBounds(RegAdd);
       Registers Reg = new Registers();
       int Value = Reg.GetReg(RegAdd);
       Reg.SetAcc(Value);
    }
    public static void LoadImmediate(int Value){
        Registers Reg = new Registers();
        Reg.SetAcc(Value);
    }

    public static void Stop(){
        System.out.println("Stopping now");
        System.exit(1);
    }

    public static void Add(int RegAdd){
        TestRegBounds(RegAdd);
        Registers Reg = new Registers();
        int RegValue = Reg.GetReg(RegAdd);
        int Total = Reg.GetAcc() + RegValue;
        Reg.SetAcc(Total);
    }
    public static void Sub(int RegAdd){
        TestRegBounds(RegAdd);
        Registers Reg = new Registers();
        int RegValue = Reg.GetReg(RegAdd);
        int Total = Reg.GetAcc() - RegValue;
        Reg.SetAcc(Total);
    }
    public static void Mul(int RegAdd){
        TestRegBounds(RegAdd);
        Registers Reg = new Registers();
        int RegValue = Reg.GetReg(RegAdd);
        int Total = Reg.GetAcc() * RegValue;
        Reg.SetAcc(Total);
    }

    public static void Sqr(int RegAdd){
        TestRegBounds(RegAdd);
        Registers Reg = new Registers();
        int RegValue = Reg.GetReg(RegAdd);
        int Total = Reg.GetAcc() * Reg.GetAcc();
        Reg.SetAcc(Total);
    }
    public static void TestRegBounds(int RegAdd){
        if(RegAdd > 24){
            System.out.println("Register Address Out Of Bounds");
            System.out.println("Catastrophic failure");
            System.exit(1);
        }
    }
}
