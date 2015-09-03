for(int i=0; i < contents.length; i++){ 
			//go through the sentence
			int decimalValue = (int)contents.length; 
			//convert to decimal
			String binaryValue = Integer.toBinaryString(decimalValue); 
			//convert to binary
			for(int j=7;j>binaryValue.length();j--){
				binaryString +="0"; 
				//this loop adds in those pesky leading zeroes
			}
			binaryString += binaryValue+" "; 
			//add to the string of binary
		}
		System.out.println(binaryString); //print out the binary


		int[] array = new int[256]; 
		//an array to store all the frequencies

		for(int i=0; i < contents.length; i++){ 
			//go through the sentence
			array[(int)contents.charAt(i)]++; //increment the appropriate frequencies

		}
		for(int i=0; i<array.length; i++){
			if(array[i]>0){ 
				//print out non-zero frequencies - cast to a char
				System.out.println("'"+(char)i+"' appeared "+array[i]+" times");
			}
		}

	} 
}