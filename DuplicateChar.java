public class DuplicateChar{
	public static void main(String[] args){
		String str="aabbcdde";
		int count;

		char str1[] = str.toCharArray();
		System.out.println("the duplicate characters in the given string are: ");

		for(int i = 0;i<str1.length;i++){
			count = 1;
			for(int j = i+1;j<str1.length;j++){
				if(str1[i]==str1[j] && str1[i]!=' '){
					count++;
					str1[j]='0';
				}
			}
		if(count>1 && str1[i]!='0')
			System.out.print("\t"+str1[i]);
		}
	}
}