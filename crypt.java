import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class crypt{
	public static void main(String[] args){
		
	
		FileIO reader = new FileIO();
		String[] myarray = reader.load("C:/Users/Sony/Desktop/texts/cypher.txt");
		
		int count=0;
		String binaryString ="";
		String word=(myarray.toString());
		//System.out.println(Arrays.toString(myarray));
		
		for(int i=0; i < word.length(); i++)
		{ 
		    count++;
			int decimalValue = (int)word.length();
			String binaryValue = Integer.toBinaryString(decimalValue);
			for(int j=7;j>binaryValue.length();j--)
			{
				binaryString +="0"; 
			}
			binaryString += binaryValue+" ";
			//System.out.println(word);
			
		}
		int[] array = new int[900];
		for(int i=0; i < word.length(); i++)
		{ 
			array[(int)word.charAt(i)]++; //increment the appropriate frequencies
		}
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>0)
			{ 
				//print out non-zero frequencies - cast to a char
				System.out.println("'"+(char)i+"' appeared "+array[i]+" times");
			}
		}
		System.out.println(count);
	} 
}
for(int i=0; i<=myarray1.length+1; i++)
{
	myarray2[i] = myarray2[i].replace("[^\\d.]", "");
	System.out.println(myarray2[i]);
}