import java.util.Scanner;
import java.lang.Math;

public class Cylinder{
    public static void cylinderCalculator(Scanner s){
        System.out.println("-------------------------------------------------------------------------------\nJAVA PROGRAM TO FIND VOLUME & SURFACE AREA OF A CYLINDER\n-------------------------------------------------------------------------------");
        boolean accurateInput = false;
        int radius=0;
        int height=0;
        while(!accurateInput){
            System.out.print("Please enter the radius: ");
            radius = Integer.parseInt(s.nextLine());
            System.out.print("Please enter the height: ");
            height = Integer.parseInt(s.nextLine());
            System.out.println();
            if(radius*height>0) accurateInput=true;
        }
        
        float volume = volume(radius,height);
        float surfaceArea = surfaceArea(radius,height);
        float lateralSurfaceArea = lateralSurfaceArea(radius,height);
        float topSurfaceArea = topSurfaceArea(radius,height);
        System.out.printf("The Volume of a Cylinder = %.2f\nThe Surface area of a Cylinder = %.2f\nLateral Surface Area of a Cylinder = %.2f\nTop OR Bottom Surface Area of a Cylinder = %.2f\n\n",volume,surfaceArea,lateralSurfaceArea,topSurfaceArea);
    }
    public static float volume(int radius, int height){
        float returnValue = (float)Math.PI*radius*radius*height;
        return returnValue;
    }
    public static float surfaceArea(int radius, int height){
        float returnValue = lateralSurfaceArea(radius,height)+(topSurfaceArea(radius,height)*2);
        return returnValue;
    }
    public static float lateralSurfaceArea(int radius, int height){
        float returnValue = (float)Math.PI*2*radius*height;
        return returnValue;
    }
    public static float topSurfaceArea(int radius,int height){
        float returnValue = (float)Math.PI*radius*radius;
        return returnValue;
    }
}