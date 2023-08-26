package Src;
import java.util.HashSet;

public class RemoveAllElementsHashSet {
	
    HashSet<String> mySet = new HashSet<>();

   
    mySet.add("Apple");
    mySet.add("Banana");
    mySet.add("Orange");

    System.out.println("HashSet before removing elements: "+ mySet);

    mySet.clear();

    System.out.println("HashSet after removing elements: " + mySet);
}


