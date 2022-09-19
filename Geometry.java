import java.util.Scanner;

public class Geometry{
    public static void main(String[]args){
        boolean exitValue = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Java Geometry Program!");
        while(!exitValue){
            System.out.println("Select from these options:\n\n1. Cylinder\n2. Future Option\n3. Future Option\n0. Quit\n");
            int input = Integer.parseInt(s.nextLine());
            switch(input){
                case 1: Cylinder.cylinderCalculator(s);
                        break;
                case 0: exitValue = true;
                        break;
                default: continue;
            }
        }
    }
}