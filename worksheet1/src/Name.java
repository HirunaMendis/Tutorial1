import java.util.Scanner;

public class Name {
    public static void main(String[] args){

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your full name(first,middle,last) : ");

        String fullName = name.nextLine();

        int firstNameNo = fullName.indexOf(' ');
        int lastNameNO = fullName.lastIndexOf(' ');

        String firstName = fullName.substring(0, firstNameNo);
        String middleName = fullName.substring(firstNameNo+1 , lastNameNO);
        String lastName = fullName.substring(lastNameNO+1);

        System.out.println(lastName+ ","+ firstName+" "+ middleName.charAt(0)+".");

    }
}
