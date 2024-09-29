import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("Enter a word with odd number of characters : ");

        String oddWord = word.nextLine();

        if (oddWord.length() % 2 ==0 ){
            System.out.println("The word you entered is not an odd number of characters");
        }
        else {
            int middleWord = oddWord.length() / 2;

            System.out.println("The middle character is: " + oddWord.charAt(middleWord));
        }
    }
}