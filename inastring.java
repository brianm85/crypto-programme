import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class inastring {
	public static void main(String[] args){
		
		
		
		int count=0;
		String binaryString ="";
		String word="ö4q^µ^KVÚ4¦Ú=Ú¼Ú4ÕÚ4=^DÁÕK,ò 4³Vò¼^É/=,,òòÚ4=Úµù^Á^Ú=áKK^^Á^4É,ÕÁ^Ú4KV,4Õ¼¼^òòÚV4ë,,òÚV4¼VÚòòÚ\4Á,¼V4¦ÚÚV4^Dò4KV,4É^¼VòÁV4Ú4K,VÁÚ4KV^µV4¸,,ùÚòÁÚ 4¸Ú4KV4=áò^¼V4µ^V¼Á4,,ÁÚ¼ÚVòVòÁÚ4òVVÁ4^¼ÚòÁ,^^òÁÚ4Õ,=ÕòÁÚ4Õ=Ú4ÉÚ=^,ù^òÁÚ4Ú¼Ú^^Ú4Õ¼V4¼^¼¼4Ú4¸^D,òÚ¼^KVòÁÚ 4¸Ú4µ^4òÚÕVÉÚÁ4KV,¼¼^74S¸ÕÁ=Ú4ÉÚ=^,ù^òÁÚ4Ú¼Ú^VÚ4ÕÉÚÁ4¼^¼¼4òVV4KÚÚ=,ÚòòÚ4^4ÕÉÚÁ4ò,,D^òòÚ4=,D,,ù^òòÚ4Ú4µÉVòÁá=ò^4Ú¼ÚVòVÚí4Ú4¸^D,òÚ¼^KV4K,,DV4Õ4D^ÉVÁÁá4KÚÚµÚ4Ú4ò^4ÕDÁVÁ4ÕÉÚÁ4Á,¼^¼¼Ú4Õ¼Á^Á,ÁS 4ÑK4=,,¼Á,ÚV4KV4VòÁ,V4KÕÁÚ4VÉ4VÁ=V^4Ú4K,D^µÁV^4Ú4KV4ÚÚòÁÕòV4Ú4D,=ÕV¼V4ÁÚVÉÚÚ4¸,KÚ¼Ú4^ù^òò A4eV4òÚÕV74SQV4¦^DDÚ4ÁÚVÉÚÚ4¸,KÚ¼Ú4òV4ò,,DV4Ú4^¼ÁÁÉ4¸,KÚ¼Ú4Õ=Ú4VùÁ4¼VVÁÕ4Ú4òV¼áÁÁ4¼Ú,^,ù^4VV¼¼^4ÕÁ=Ú4òV,Ú4DÚ=ÚòÁÚÉÚÁ4Ú4Õ,ùÚÁÁÚÉÚÁ4òV,4=ò=áòVd4Õ¼=ÕÕ4òV,4=ÕDÉÚòV4ÁÚD==ÚÚÉÚV^4Ú4òV¼KòV4ÚÉÕV4=,,¼¼Ú=ò^òV4Ú¼É^¼VÚòV4D,=Õ,=ò^Á4ÕVÁÚ4KV4áÁ4VÉÁ4Ú4áÁ4D,=ÕV¼^4òV,4^ù^òòòV4Ú¼É^¼VÚVòV4VòDÚ^¼V¼ÚVòÁ^4,Õ¼^òÁÚ4Á,,òÁÚ^4VòDÚ^¼V¼ÚVòÁ^4òáVÁ4ÕÁ=Ú4K^4Õ¼^KK^4Á^µ^^Á4òV,Ú4ÉÚòÁÚÚí4òV¼¼4KV=V4Ú4KV,4^Dµ^=,ÁÚV4Õ¼^KK^4òáÁV4Á^µ^^Á÷Å4e^4Õ¼^KK^4ÚµÕV4Á^µ^^Á4òV,Ú4ÉÚòÁÚÚí4^KK^4Õ¼^4Õ,ùÚÁÁÚ^^Á4=ò=á4òù=òV4Ú4ÕV=^,=òVÚ4ÕÁ=Ú4òV4ÚÕVÁ4Ú¼É^¼VÚ¼¼^òV4eÕÕò^=ò^¼¼^ ²4e,VòÁÚ4òÚÚ4Õ=Ú4òV4ÚÕVÁ4Ú¼É^¼VÚ¼¼^òV4eÕÕò^=ò^¼¼^4òÚÕ^74I¸Õò4Á^4Á,¼^ÁÁ^4,ò=ÕÁÁÕKV=òV4VV4KV4µÚÕÁÚ4Á^VùÁ4=ÚòÕ^4ò^=ÚÚí>4K,ÁÁÚ4Õò4Á^4Ú¼ÚÚÁÁ^4KV,4Áá=V4Õ,ùÚÁÚÁÁ^4KV,4=ò=áV4Ú4ò^,DÚÚÁÁ^4VVÁ4VV4ÉÚV==Ú4Á^Vù4=ÚD=ÕVÁ^ÁÁ,^4Õ¼VòVÉÚÁ4ÁÚVÉÚÚ4D^òò4KV4µ^VùÁ4òV^¼Á=V4=Õ=ÕÚ4Ú4Á,Õ4µ^VùÁ4òVVµ^4ÚV==ÚÚ4Õ=Ú4KV4Õ¼^4ÉÚ¼V,Á4VK^V4Úò,VòVÚ=òVI ö(4QÉÚÁµÚ4µ^4òV,4Ú¼É^¼VÚòV4Ú4òV,4=ÚòÚòV4ÕÁ=Ú4òV4ÉÚÚµùVÁ4ò,,D^¼¼Ú4ÉÕVKÚ¼¼ÚòV4Ú4É=^É¼¼4=ù^¼¼òV öö4QV4¦^DDÚ4ÁÚD=ÚÁ=ÕÕ4òV,4=ÕDÉÚòV4Ú¼É^¼VÚòV4D,=Õ,òÁÚ4Ú4VVù^4Ú¼É^¼VÚVòV4D,=Õ,òÁÚ4ÕÁ=Ú4ÁÚµÁÕÉÚÁ4^¼Á4òV,4VK^òV÷4ÝÚ4Á4VÉ4Ú¼É^¼VÚòV4µÚ==^^4K^^òÁá4Ú4ò,Õ4µ^4òÚÚùÚ4ÚDKÕ4ò^4KV^µ^4^ù^òò S4eV4Õ¼V4^Á4=,V=ÚÚ4,ÕKÚ¼Úò=VÚ 4";
		
		FileIO reader = new FileIO();
		String[] myarray1 = reader.load("C:/Users/Sony/Desktop/texts/finish.txt");
		String[] myarray3 = reader.load("C:/Users/Sony/Desktop/texts/fincnt.txt");
		String[] myarray2 = new String[myarray1.length];
		
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
			
			
		}
		int[] array = new int[256];
		for(int i=0; i < word.length(); i++)
		{ 
			array[(int)word.charAt(i)]++; //increment the appropriate frequencies
		}
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>0)
			{ 
				double num = (array[i]/(double)count)*100;
				num=(double)(Math.round(num*100))/100;
				//print out non-zero frequencies - cast to a char
				System.out.println("'"+(char)i+"' appeared "+array[i]+" times "+num);
				
				
			}
		}
		System.out.println(count);
		
		for(int i =0; i<=myarray1.length; i++)
		{
			
			myarray2[i] = myarray1[i].trim();
			//myarray1[i] = myarray1[i].replace("[^\\d.]", "");
			System.out.println(myarray2[i]);
		}
		/*
		if(((int)(array1[i]*10))==((int)(array2[i]*10)))//example 3.15 times 100 = 31.5.    31.5 cast as int be 31 
		{
			
		}
		*/
	} 
}
