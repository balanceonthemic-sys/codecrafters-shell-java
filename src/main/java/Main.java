import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        // System.out.print("$ ");
        // Scanner in = new Scanner(System.in);
        // String command = in.nextLine();
        // System.out.println(command + ": command not found");
        while(true){

            System.out.print("$ ");
            String command = new Scanner(System.in).nextLine();
               if(command.equals("exit")){
                break;
            }
            else if(command.equals("echo")){
                System.out.println(command.substring(5));
               
            }
            else{
            System.out.println(command + ": command not found");
            }
        }
    }
}
