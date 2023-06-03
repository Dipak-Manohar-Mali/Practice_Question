
import java.util.*;
import java.io.*;

public class RotateArrayBy90
{
    public static void rotate(int arr[][])
    {
        int A[][]=new int[arr.length][arr[0].length];
        System.out.println("Transpose Matrix A^T:\n");
        //Transpose MatrixLogic 
        for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[0].length;j++)
		    {
		        A[i][j]=arr[j][i];
		    }
		}
		
		//Print Transpose Matrix
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[0].length;j++)
		    {
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
		//Matrix Rotation for 90 degree Logic
	
		for(int i=0;i<A.length;i++)
		{
		int li=0;
		int ri=arr.length-1;
	    while(li<ri)
		{   
		       int temp=A[i][li];
		       A[i][li]=A[i][ri];
		       A[i][ri]=temp;
		       li++;
		       ri--;   
		}
		}
		System.out.println("\nHere is Your Matrix Rotation about 90 degree:\n");
		//Print Expected Output(Rotate matrix bu 80 degree)
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[0].length;j++)
		    {
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Array That You Have:\n");
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[0].length;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		System.out.println("\nThis is Array That You have Enter:\n");
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[0].length;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		//Call Rotate Function For Rotare the Array By 90 degree.
		rotate(arr);
		/*
		Time Complexity-->O(rows*column)
		
		Space Complexity-->O(rows*column) we use here Exatra Array(One)
		*/
		//End Of The Program nHere
		
	}
}
