package Src;

import java.util.ArrayList;
import java.util.Collections;

public class Object {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(43);
		a1.add("java");
		a1.add('r');
		a1.add(14.4);
		a1.add("Core");
		for(int i=0;i<a1.size();i++)
		{
			Collections.shuffle(a1);
		}
			}

}
