import java.util.*;
public class Demo{
   public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("profession:");
    String profession=sc.nextLine();
    System.out.println("salary:");
    int salarys=sc.nextInt();
    if(profession.equals("developer")){
        double salary=salarys+salarys*0.1;
        System.out.println(salary);
    }
    else if(profession.equals("manager")){
        double salary=salarys+salarys*0.2;
        System.out.println(salary);
    }
   } 
}