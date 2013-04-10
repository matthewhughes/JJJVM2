/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 10/04/13
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class Registers {


    private int[] register = new int[24];

    private int ProgramCounter;
    private int Accumulator;

    public int GetReg(int index){
        return register[index];
    }

    public void SetReg1( int value, int index){
        register[index] = value;
    }

    public int GetPC(){
        return ProgramCounter;
    }

    public void SetPC(int value){
        ProgramCounter = value;
    }

    public int GetAcc(){
        return Accumulator;
    }

    public void SetAcc(int Value){
        Accumulator = Value;
    }

}
