public class WordCount{
	public static void main(String args[]){
		String msg = "My name is Rugveda";
		int total = 1;
		int i = 0;
		while(i<msg.length()){
			if((msg.charAt(i)==' ') && msg.charAt(i+1)!=' '){
				total++;
			}
			i++;
		}
		System.out.println("no of words are:"+total);
	}
}