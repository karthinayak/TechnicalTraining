package controlstructures;

public class VoelOrNot {

	public static void main(String[] args) throws java.io.IOException {
		char ch=(char)System.in.read();
	//	ch=Character.toLowerCase(ch);
	//	if("aeiouAEIOU".contains(""+ch))
	//		System.out.println("vowels");
	//	else
	//		System.out.println("not vowel");
		System.out.println("aaeiouAEIOU".contains(""+ch)?"vowel":"not vowel");
	}

}
