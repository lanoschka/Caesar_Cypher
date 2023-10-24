import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write sentence!");

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        System.out.println("Your sentence is: ");
        System.out.println(sentence + "\n");

        System.out.println("Write key: ");

        int key = scanner.nextInt();

        System.out.println("key: " + key);

        char [] tab = sentence.toCharArray();

        System.out.println("Encypted sentence is: ");

        for(char c : tab ){
            c += key;
            System.out.print(c);

        }
        scanner.close();
    }
}