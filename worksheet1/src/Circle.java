import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        double r;

        Scanner radius = new Scanner(System.in);
        double ri;
        double ro;

        System.out.println("Enter the inner circle radius: ");
        ri = radius.nextDouble();

        System.out.println("Enter the outer circle Radius: ");
        ro = radius.nextDouble();

        if(ri>ro){
            System.out.println("The inner circle radius is bigger than the outer circle.");
        }

        computeArea(ro, ri);
        computeCircumference(ro, ri);

    }


    public static void computeArea(double ro, double ri){

        double outerArea = 2*3.14* ro * ro;
        double innerArea = 2*3.14* ri * ri;

        double coloredArea = outerArea - innerArea;

        System.out.printf("\n Outer area: %f , Inner area : %f ,  coloured area: %f ",outerArea,innerArea,coloredArea);


    }
    public static void computeCircumference(double ro, double ri){

        double outerCir = 2*3.14*ro;
        double innerCir = 2*3.14*ri;

        System.out.println("\nOuter Circumference: "+outerCir + "Inner Circumference: "+innerCir);


    }

}
