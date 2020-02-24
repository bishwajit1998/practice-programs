import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        
  
        Scanner sc new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int tar = sc.nextInt();
        int res[]=new int [2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]+arr[j]==tar)
                {
                    res[0]=arr[i];
                    res[1]=arr[j];
                }
            }
        }
        for(int i=0;i<2;i++)
        {
            
        
        System.out.println(res[i]);
        }
    }
}