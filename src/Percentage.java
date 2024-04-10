import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixin
        System.out.print("Find percentage based on 5 subjects");

        Scanner sc = new Scanner(System.in);

        float hindi = sc.nextFloat();
        float english = sc.nextFloat();
        float math = sc.nextFloat();
        float science = sc.nextFloat();
        float art = sc.nextFloat();

        float result = hindi+english+math+science+art;
        System.out.println(result/5 +"%");

    }
}