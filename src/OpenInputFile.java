import org.omg.CORBA.StringHolder;
import sun.rmi.runtime.Log;

import javax.smartcardio.CommandAPDU;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 10/04/13
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
public class OpenInputFile {

    private int Register1;
    private int Register2;
    private int Register3;
    private int Register4;
    private int Register5;
    private int Register6;
    private int Register7;
    private int Register8;
    private int Register9;
    private int Register10;
    private int Register11;
    private int Register12;
    private int Register13;
    private int Register14;
    private int Register15;
    private int Register16;
    private int Register17;
    private int Register18;
    private int Register19;
    private int Register20;
    private int Register21;
    private int Register22;
    private int Register23;
    private int Register24;

    private int ProgramCounter;
    private int Accumulator;

    public void OpenAndIterate(String FileName){

        List ArrayLines = new ArrayList<String>();
        try {
            for (String line : Files.readAllLines(new File(FileName).toPath(), Charset.forName("UTF-8"))) {
                ArrayLines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Things went a bit Pete Tong:  " + e.getMessage());
        }

        int i;
        for(i = 0; i < ArrayLines.size(); i++){
            ProgramCounter = ProgramCounter + 1;
            String StringLine = ArrayLines.get(i).toString();
            String BytCom = StringLine.substring(0, Math.min(StringLine.length(), 3));
            String BytVal = StringLine.substring(3, Math.min(StringLine.length(), 6));

        }
    }

    public static String ReturnLogHeader(){
        return "Registers - | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 | 23 | 24 | Accumulator | Program Counter |";
    }
    public String ReturnValues(int register1, int register2, int register3, int register4, int register5, int register6, int register7, int register8, int register9, int register10, int register11, int register12, int register13, int register14, int register15, int register16, int register17, int register18, int register19, int register20, int register21, int register22, int register23, int register24, int ProgramCounter, int Accumulator){
        return(" | " + register1 +" | " + register2 +" | " + register3 +" | " + register4 +" | " + register5 +" | " + register6 +" | " + register7 +" | " + register8 +" | " + register9 +" | " + register10 +" | " + register11 +" | " + register12 +" | " + register13 +" | " + register14 +" | " + register15 +" | " + register16 +" | " + register17 +" | " + register18 +" | " + register19 +" | " + register20 +" | " + register21 +" | " + register22 +" | " + register23 + " | " + register24 + " | " + ProgramCounter + " | " + Accumulator);
    }
    public void LogFileActions(String OutputFile, String Line){
        try{
            BufferedWriter dout = new BufferedWriter(new FileWriter(OutputFile, true));
            dout.write(Line);
            dout.newLine();
            dout.close();
        }   catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public static void CheckFileExists(String OutputName){
        String Directory = System.getProperty("user.dir");
        File f = new File(Directory + File.separator + OutputName);
        if(f.exists()){
            System.out.println("File already exists. Choose a different name");
            System.exit(1);
        }
    }
    public static void CreateOutputFile(String OutputName){
        try{
            PrintWriter CompiledCode = new PrintWriter(OutputName + ".JJJ");
            System.out.println("File produced.");
            System.out.println("File located at: " + System.getProperty("user.dir") + "/" + OutputName + ".JJJ");
        } catch (Exception e){
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.out.println("Unable to create JJJ file");
            System.out.println("Check your file permissions and try again?");
            System.out.println("Exiting Now");
            System.exit(1);
        }
    }

}
