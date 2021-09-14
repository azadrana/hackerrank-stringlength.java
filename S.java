// hackerrak: lenght of string 
import java.util.*;
import java.io.*;
class S
{
     public static void main(String[] args)
	 { 
	 
	      Scanner sc=new Scanner(System.in);
		  String str1=sc.nextLine();
		  String str2=sc.nextLine();
		  int sum=str1.length()+str2.length();
		  int i=str1.compareTo(str2);
		         System.out.println(sum);
		  if(i>0)
		  {
			  System.out.println("Yes");
		  }
		  else
		  {
			  System.out.println("No");
		  }
		  String atemp=str1.substring(0,1).toUpperCase()+str1.substring(1);
		  String btemp=str2.substring(0,1).toUpperCase()+str2.substring(1);
		  System.out.println(atemp+" "+btemp);
		  
	 }
}