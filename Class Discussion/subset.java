import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the size of first array");
	      int firstNum=sc.nextInt();
	      int firstArray[]=new int[firstNum];
	      
	      System.out.println("Enter the elements");
	      for(int i=0;i<firstNum;++i)
	      firstArray[i]=sc.nextInt();
	      
	      System.out.println("Enter the size of second array");
	      int secondNum=sc.nextInt();
	      int secondArray[]=new int[secondNum];
	      
	      System.out.println("Enter the elements");
	      for(int i=0;i<secondNum;++i)
	      secondArray[i]=sc.nextInt();
	      
	      subset(firstArray,secondArray);
	}
	
	public static void subset(int first[], int second[])
	{
	      int count=0;
	      if(first.length==0 || first.length>second.length)
	      System.out.println("Not a Subset");
	      else
	      {
	            for(int i=0;i<first.length;i++)
	            {
	                  boolean result=check(first[i],second);
	                  if(result==false)
	                  count++;        
	            }
	            if(count==0)
	            System.out.println("Array1 is a subset");
	            else
	            {
	                  System.out.println("Not a Subset");
	                  if(count==1)
	                  System.out.println("Yes it is possible to make array 1 subset");
	                  else
	                  System.out.println("No it is not possible to make array 1 subset");
	                  
	            }
	      }
	}
	public static boolean check(int num,int[] array)
	{
	      for(int i=0;i<array.length;i++)
	      {
	            if(array[i]!=-1 && array[i]==num)
	            {
	                  array[i]=-1;
	                  return true;
	            }
	      }
	      return false;
	}
}

