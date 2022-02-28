package collageassignment;

import java.util.Scanner;

public class Continent {
    String con;
    Scanner sc = new Scanner(System.in);
    void cinput(){
        System.out.println("Enter Continent Name");
        con= sc.next();
    }
}
class country extends Continent{
    String cou;
    void couinput(){
        System.out.println("Enter Country Name");
        cou = sc.next();
    }
}
class state extends country{
    String sta;
    void stainput(){
        System.out.println("Enter State Name");
        sta = sc.next();
    }
}
class place extends  state
{
    String pla;
    void pinput(){
        System.out.println("Enter Place Name ");
        pla = sc.next();
    }

    public static void main(String[] args) {
        place s= new place();
        s.cinput();
        s.couinput();
        s.stainput();
        s.pinput();
        System.out.println("Place:"+s.pla);
        System.out.println("State:"+s.sta);
        System.out.println("Country:"+s.cou);
        System.out.println("Continent:"+s.con);
    }
}
