/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 10/04/13
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class Registers {


    private static int[] register = new int[24];

    private static int ProgramCounter;
    private static int Accumulator;

    public static int GetReg(int index){
        return register[index];
    }

    public void SetReg( int value, int index){
        register[index] = value;
    }

    public static int GetPC(){
        return ProgramCounter;
    }

    public static void IncPC(){
        ProgramCounter = ProgramCounter + 1;
    }

    public static int GetAcc(){
        return Accumulator;
    }

    public void SetAcc(int Value){
        Accumulator = Value;
    }

}
