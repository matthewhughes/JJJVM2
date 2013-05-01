import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 11/04/13
 * Time: 16:28
 * To change this template use File | Settings | File Templates.
 */
public class LogClass {
    public static void CallRegister(String FileName){
        for(int i = 0; i < 25; i++){
            WriteFile(FileName, "Register" + i + Integer.toString(Registers.GetReg(i)));
        }
        WriteFile(FileName, "Program Counter"  + Integer.toString(Registers.GetPC()));
        WriteFile(FileName, "Accumulator"  + Integer.toString(Registers.GetAcc()));

    }

    public static void STDOUTWrite(String FileName){
        WriteFile(FileName, Integer.toString(Registers.GetReg(24)));
    }

    private static void WriteFile(String FileName, String Line){
            try{
                BufferedWriter dout = new BufferedWriter(new FileWriter(FileName, true));
                dout.write(Line);
                dout.newLine();
                dout.close();
            }   catch (Exception e){
                e.printStackTrace();
                System.out.println(e);
            }

        }
    }
