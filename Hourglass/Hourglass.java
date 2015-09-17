
/**
 * This program will print an hourglass using method calls and nested loops.
 * 
 * @author Ryan Pun
 * @version 09/17/15
 */
public class Hourglass
{
    public static void main(String[] args) {
        ends();
        cone();
        middle();
        cone();
        ends();
    }
    public static void ends() {
        System.out.print("|");
        for (int i=1;i<=10;i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }
    public static void cone() {
        int l=1;
        for (int j=1;j<=4;j++) {
            for (int k=1;k<=l;k++) {
                System.out.print(" ");
                l++;
            }
        }
    }
    public static void middle() {
        System.out.println("||");
    }
}
