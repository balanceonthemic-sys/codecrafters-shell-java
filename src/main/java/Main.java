import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        System.out.print("$ ");
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        System.out.println(command + ": command not found");
    }
}
