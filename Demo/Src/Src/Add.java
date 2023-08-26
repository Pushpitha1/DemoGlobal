package Src;

public class Add {
	int a=10;
	System.out.println("primitive int type "+a);
	Integer b =a;
	System.out.println("Non primitive integer object"+b);
	char ch='$';
	System.out.println("primitive char type"+ch);
	Character ch1=Character.valueOf(ch);
	System.out.println("Non primitive char object is"+ch1);
	int c=b;
	System.out.println("primitive int type after unboxing"+c);
	char ch3=ch1.charValue();
	System.out.println("primitive char type after unboxing"+ch3);
		}

