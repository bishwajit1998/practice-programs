import java.io.*;
import java.util.*;

class Main{


	public static void main(String[] args) throws IOException
	{
		 
		try{
		 Scanner sc = new Scanner(System.in);
           
           int t = sc.nextInt();
           
           int res[]=new int[t];
		 for(int i=0;i<t;i++)
		 {
		     int s=sc.nextInt();
		 	int a[] = new int[3];
		 	for(int j=0;j<3 ;j++ ) {
		 		a[j]=sc.nextInt();
            }
            int sum=0;
            for (int j=0;j<3;j++) 
            {
            	 sum = sum+a[j];


            }
             //System.out.println(sum);
             
            if (sum%s==0) {
            	res[i] = sum/s;

            	
            }
            else if (sum%s!=0) {

            	res[i] = sum/s+1;
            }
           
		 }
		 for(int i=0;i<t;i++)
            System.out.print(res[i]);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
		
          
	}
