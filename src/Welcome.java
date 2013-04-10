/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 10/04/13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
public class Welcome {
    public static void Welcome(){
        System.out.println("Welcome to the J!J!J! VM.");
        System.out.println("Usage is: JJJVM inputfile outputfile statefile(optional)");
    }
    public static void CheckArgs(String args[]){
        if(args.length == 0){
            System.out.println("No arguments were provided.");
            System.out.println("Usage is: JJJVM inputfile outputfile statefile(optional)");
            System.exit(1);
        }
        if (args.length < 2){
            System.out.println("Too few arguments were provided");
            System.out.println("Usage is: JJJVM inputfile outputfile statefile(optional)");
            System.exit(1);
        }
        if(args.length > 3){
            System.out.println("Too many arguments provided");
            System.out.println("Usage is: JJJVM inputfile outputfile statefile(optional)");
            System.exit(1);
        }
    }
}
