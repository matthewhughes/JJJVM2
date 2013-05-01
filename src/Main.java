public class Main {

    public static void main(String[] args) {
	Welcome Wel = new Welcome();
    Wel.Welcome();
    Wel.CheckArgs(args);
    CreateOutputFiles COF = new CreateOutputFiles();
    // Create Stack Trace File if required
    if(args[2] != null){
        COF.CheckOutputFileExists(args[2]);
        COF.CreateOutputFile(args[2], ".log", "log");
    }
    COF.CheckOutputFileExists(args[1]);
    COF.CreateOutputFile(args[1], ".out", "log");
    COF.SetSTDOUT(args[1]);
    ParseInputFile.OpenAndParse(args[0], args[1], args[2]);

    }
}
