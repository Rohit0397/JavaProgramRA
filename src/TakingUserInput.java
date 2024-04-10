import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Taking User Input");

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String result = a+ " " + b;

        System.out.println(result);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}