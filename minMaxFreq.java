import java.io.*;

public class minMaxFreq{
	public static void main(String args[]){
		String str = "Hi there icecream, cat, cucumbr";
		int freq[] = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i,j,min,max;

		char str1[] = str.toCharArray();
		for(i=0; i< str1.length; i++){    //count each word and store in array freq
			freq[i] = 1;
			for(j = i+1; j<str1.length; j++){
				if(str1[i] == str1[j] && str1[i] != ' ' && str1[i] != '0') {    
                  			freq[i]++;    
                      
               				//Set string[j] to 0 to avoid printing visited character    
                  			str1[j] = '0';    
              			}    
			}
		}
	

	min = max = freq[0];
	for(i=0; i<freq.length; i++){
		if(min > freq[i] && freq[i]!=0){
			min = freq[i];
			minChar = str1[i];
		}

		if(max < freq[i]){
			max = freq[i];
			maxChar = str1[i];
		}
	}

	System.out.println("min "+minChar+ "max"+ maxChar);
}
}