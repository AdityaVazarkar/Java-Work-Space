package practical;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int l,b,perimeter,area;
        Scanner sc=new Scanner(System.in);

        //Area of Rectangle
        System.out.println("Enter the length");
        l=sc.nextInt();
        System.out.println("Enter the breath");
        b=sc.nextInt();
        area = l*b;
        System.out.println("Area of Rectangle:-"+area);

        //perimeter of rectangle
        perimeter= 2*(l+b);
        System.out.println("Perimeter of Rectangle:-"+perimeter);

    }
}
