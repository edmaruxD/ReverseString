import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = scanner.nextLine();
        char[] ch = str.toCharArray();
        System.out.println("Reverse of a String is :");
        int j = ch.length;
        for (int i = j; i > 0; i--){
            System.out.print(ch[i-1]);
        }
    }
}
