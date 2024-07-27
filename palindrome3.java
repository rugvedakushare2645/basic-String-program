import java.io.*;

//using StringBuilder

public class palindrome3{
	public static void main(String args[]){
		String str="abba";
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();

		if(str.equals(str1.toString()))
			System.out.println("yess");
		else 
			System.out.println("no");
	}
}