package exception;

import java.util.Scanner;

 class MyDate {
     int dd, mm, yy;
     int flag = 0;

     MyDate() {
         dd = 0;
         mm = 0;
         yy = 0;
     }

     void Accept() {
         int d, m, y;
        Scanner sc = new Scanner(System.in);
         System.out.println("\n enter date in date,month,year format");
         d= sc.nextInt();
         m=sc.nextInt();
         y=sc.nextInt();
         try{
             if(m>12)
                 throw  new InvaliedDataException("month can't be greater than 12");
             else
             {
                 if(m==1 || m==3 || m==5 || m==7 || m==8 ||m==10||m==12){
                     if(d>31)
                         throw new InvaliedDataException("date can not be greater than 31");
                 }
                 else if(m==2){
                     if(y%4==0){
                         if(d>29)
                             throw new InvaliedDataException("date can not be greater than 29");
                     }
                     else{
                         if(d>28)
                             throw new InvaliedDataException("date can not be greater than 28");
                     }
                 }
                 else{
                     if(d>30)
                         throw new InvaliedDataException("date can not be greater than 30"+m+"month");
                 }
             }
             if(flag==0){
                 dd=d;
                 mm=m;
                 yy=y;
             }
         }catch (InvaliedDataException e){
             flag=1;
             System.out.println(e);
         }
     }
     void Display(){
         if(flag==0)
             System.out.println("date is:"+dd+"/"+mm+"/"+yy);
         else
             System.out.println("date is invalid");
     }

     public static void main(String[] args) {
         MyDate myDate = new MyDate();
         myDate.Accept();
         myDate.Display();
     }
 }

