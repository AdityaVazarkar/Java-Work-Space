package collageassignment;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        int operation;

        do {
            System.out.println("\t");
            System.out.println("1: Volume of Cylinder");
            System.out.println("2: Factorial of Number");
            System.out.println("3: Armstrong Number");
            System.out.println("4: Exit");
            System.out.println("\t");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operation ");
            operation = sc.nextInt();


            switch (operation) {
                case 1:
                    System.out.println("Calculate the volume of Cylinder:-");
                    Scanner c = new Scanner(System.in);
                    System.out.println("Enter the radius and height");
                    int r = c.nextInt();
                    int h = c.nextInt();

                    double volume = (3.14 * r * r * h);
                    System.out.println("Volume of Cylinder is:-" + volume);
                    break;
                case 2:
                    System.out.println("Find the Factorial");
                    Scanner f = new Scanner(System.in);
                    System.out.println("Enter the Number");
                    int num = f.nextInt();
                    int i = 1;
                    int fact = 1;
                    while (i <= num) {
                        fact = fact * i;
                        i++;
                    }
                    System.out.println("Factorial of a number:-" + fact);
                    break;

                case 3:
                    System.out.println("Check the number is armstrong or not");
                    Scanner a = new Scanner(System.in);
                    System.out.println("Enter the number");
                    int no = a.nextInt(), re,sum = 0,temp;
                    temp=no;

                    while (no > 0) {
                        re = no % 10;
                        sum = sum + re * re * re;
                        no = no / 10;
                    }
                    no=temp;
                    System.out.println("sum of cube of digits in number:" + sum);
                    if (temp == sum)
                        System.out.println("the number is armstrong");
                    else
                        System.out.println("the number is not armstrong");
                    break;
                case 4:
                    System.out.println("Exit the program");
                    System.exit(0);
            }
        }while(operation<=4);
    }


}
