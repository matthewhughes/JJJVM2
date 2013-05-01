import java.io.File;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 10/04/13
 * Time: 17:16
 * To change this template use File | Settings | File Templates.
 */
public class CreateOutputFiles {

    private static String Logfile;

    public static void SetSTDOUT(String FileName){
        Logfile = FileName;
    }

    public static String ReturnSTDOUT(){
        return Logfile;
    }


    public static void CheckOutputFileExists(String OutputName){
        String Directory = System.getProperty("user.dir");
        File f = new File(Directory + File.separator + OutputName);
        if(f.exists()){
            System.out.println("File already exists. Choose a different name");
            System.exit(1);
        }
    }

    public static void CreateOutputFile(String OutputName, String FileEnding, String FileType){
        try{
            PrintWriter CompiledCode = new PrintWriter(OutputName + ".JJJ");
            System.out.println("File produced.");
            System.out.println("File located at: " + System.getProperty("user.dir") + "/" + OutputName + FileEnding);
        } catch (Exception e){
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.out.println("Unable to create" + FileType +" file");
            System.out.println("Check your file permissions and try again?");
            System.out.println("Exiting Now");
            System.exit(1);
        }
    }
}
