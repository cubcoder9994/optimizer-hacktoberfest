/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
		    if(hm.containsKey(i))
		    hm.put(i,hm.get(i)+1);
		    else
		    hm.put(i,1);
		}
		for(int i:hm.keySet())
		{
		    if(hm.get(i)==1)
		    {
		        System.out.println(i);
		        break;
		    }
		}
	}
}
