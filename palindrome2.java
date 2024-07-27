import java.io.*;
//using two pointer approach
public class palindrome2{
	public static boolean isPalindrome(String str){
		int i = 0, j = str.length()-1;
		while(i<j){
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String args[])
	{
		String str = "rugveda";
		//str = str.toLoweCase();
		if(isPalindrome(str))
			System.out.println("yess");
		else
			System.out.println("no");
	}
}