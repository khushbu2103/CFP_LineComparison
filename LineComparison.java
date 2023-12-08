package LineComparison_PP;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to the line comparison program");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter co-ordinates of line 1st");
        System.out.println("Enter x1 as number");
        float Ax1 = sc.nextFloat();
        System.out.println("Enter x2 as number");
        float Ax2 = sc.nextFloat();
        System.out.println("Enter y1 as number");
        float Ay1 = sc.nextFloat();
        System.out.println("Enter y2 as number");
        float Ay2 = sc.nextFloat();

        System.out.println("please enter co-ordinates of line 2nd");
        System.out.println("Enter x1 as number");
        float Bx1 = sc.nextFloat();
        System.out.println("Enter x2 as number");
        float Bx2 = sc.nextFloat();
        System.out.println("Enter y1 as number");
        float By1 = sc.nextFloat();
        System.out.println("Enter y2 as number");
        float By2 = sc.nextFloat();

        float lineLength1 = (float) Math.sqrt(Math.pow(Ax1-Ax2, 2)+ Math.pow(Ay1-Ay2, 2));
        System.out.println("Length of line1 : " + lineLength1);

        float lineLength2 = (float) Math.sqrt(Math.pow(Bx1-Bx2, 2)+ Math.pow(By1-By2, 2));
        System.out.println("Length of line2 : " + lineLength2);

        if (lineLength1 == lineLength2)
            System.out.println("Line1 is equals to line2");
        else
            System.out.println("Line1 is not equals to line2");

    }
}
