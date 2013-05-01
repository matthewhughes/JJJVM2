import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 11/04/13
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
public class ParseInputFile {
    public static void OpenAndParse(String File, String LogArg, String Filename){
        System.out.println("Opening file now.");
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(File));
            while ((line = br.readLine()) != null) {
                String Command = line.substring(0, Math.min(line.length(), 3));
                String Value = line.substring(3, Math.min(line.length(), 5));
                int CommandI = Integer.parseInt(Command);
                int ValueI = Integer.parseInt(Value);
                switch(CommandI){
                    case 0: OpCodeActions.Stop(); // 000
                    case 1: OpCodeActions.StoreDirect(ValueI); // 001
                    case 2: OpCodeActions.LoadDirect(ValueI); // 002
                    case 3: OpCodeActions.LoadImmediate(ValueI); // 003
                    case 4: OpCodeActions.Add(ValueI); // 004
                    case 5: OpCodeActions.Sub(ValueI); // 005
                    case 6: OpCodeActions.Mul(ValueI); // 006
                    case 7: OpCodeActions.Sqr(ValueI); // 007
                }
                Registers.IncPC();
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        if(LogArg != null){
            LogClass.CallRegister(Filename);
        }
    }
}
