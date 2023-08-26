package Src;

public class User1 {
	public static void main(String[] args)
	{
		String s1="QSPIDERS";
		String s2="qspiders";
		String s3="hi how are you all";
		System.out.println("length of s1"+s1.length());
		System.out.println("all character of string s1 is");
		 for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		} 
		System.out.println("Convert string into an char array");
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("index of s1"+s1.indexOf('p'));
		System.out.println("last index of char in s1"+s1.lastIndexOf('S'));
		System.out.println("substring of s1"+s1.substring(1));
		System.out.println("substring of s1"+s1.substring(1,7));
		System.out.println("does s1 contains SPIDERS"+s1.contains("spider"));
		System.out.println("concat s1 with s2"+s1.concat(s2));
		System.out.println("convert s1 into lower case"+s1.toLowerCase());
		System.out.println("convert s2 into upper case"+s2.toUpperCase());
		System.out.println(s2.compareTo(s1));
		System.out.println("To replace s2 'q' with 'j'"+s2.replace('q', 'j'));
		System.out.println("To split s3 with spaces");
		String[] str=s1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(s1.startsWith("R"));
				
	}

}
