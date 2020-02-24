import java.util.Scanner;

public class proj{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ,age and taxable income");

        String name = sc.nextLine();
        int age = sc.nextInt();
        double income = sc.nextInt();
        double tax;
     
         if(age>60)
         {
             System.out.println("wrong category");

         }
         else{
        
             if(income<=250000)
             {
                 tax=0;
                //System.out.println(tax);
             }
             else if(income>250000&&income<=500000)
             {
                 tax=(income-160000) * 0.1;
             }

             else if (income > 500000 && income <= 1000000) {
                tax = (income - 500000) * 0.2 + 34000;

            } 
            else  {
                tax = (income - 1000000) * 0.3 + 94000;
            }
            System.out.println( " name = " +name + " taxable income is "+tax);

        
    }
    }

}