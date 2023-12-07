package LineComparison_PP;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to the line comparison program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 as number");
        float x1 = sc.nextFloat();
        System.out.println("Enter x2 as number");
        float x2 = sc.nextFloat();
        System.out.println("Enter y1 as number");
        float y1 = sc.nextFloat();
        System.out.println("Enter y2 as number");
        float y2 = sc.nextFloat();

        float lineLength = (float) Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
        System.out.println("Length of line : " + lineLength);
    }
}
