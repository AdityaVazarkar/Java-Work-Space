package collageassignment;

import java.util.Scanner;

abstract class Staff {
    protected String name ;
    protected int id;

    Staff(){

    }
    Staff(String name , int id){
        this.name=name;
        this.id=id;

    }
}

 class OfficeStaff extends Staff{
    String department;
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:\n name:\n department");

        id=sc.nextInt();
        name=sc.next();
        department=sc.next();
    }
    public void display(){
        System.out.println("ID:-"+id);
        System.out.println("Name:-"+name);
        System.out.println("Department:-"+department);
        System.out.println("----------------------------");
    }

     public static void main(String[] args) {
         OfficeStaff officeStaff = new OfficeStaff();
         officeStaff.accept();
         officeStaff.display();
     }
}
