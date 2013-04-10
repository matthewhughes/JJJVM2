public class Main {

    public static void main(String[] args) {
	Welcome Wel = new Welcome();
    Wel.Welcome();
    Wel.CheckArgs(args);
    CreateOutputFiles COF = new CreateOutputFiles();
    // Create Stack Trace File if required
    if(args[3] != null){
        COF.CheckOutputFileExists(args[2]);
        COF.CreateOutputFile(args[2], ".log", "log");
    }
    COF.CheckOutputFileExists(args[1]);
    COF.CreateOutputFile(args[1], ".out", "log");

    }
}
