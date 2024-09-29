import java.util.Scanner;

public class Length {
    public static void main(String[] args){

        Scanner lengthCm = new Scanner(System.in);
        System.out.println("Enter the length in centimeters: ");

        double centi = lengthCm.nextFloat();
        double inch = centi / 2.54;

        int feet = (int) (inch/12);
        double remainder = inch%12;

        System.out.printf("The length is %d feet and %f inches",feet,remainder);


    }
}
