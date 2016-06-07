package source;

import java.util.ArrayList;

public class JavaCollections {

	public static void main(String[] args) {
		//create ArrayList
		ArrayList mylist = new ArrayList();
		
		//insert elements into list
		mylist.add(10);
		mylist.add("Java");
		mylist.add(4.5);
		mylist.add('#');
		mylist.add(true);
		
		System.out.println(mylist.toString());
		
		/* Create a type safe ArrayList */
		ArrayList<String> wordsList = new ArrayList<String>();
		wordsList.add("Hello");
		wordsList.add("java");
		wordsList.add("remote");
		wordsList.add("program");
		wordsList.add("111");
		
		System.out.println(wordsList.toString());
		
		wordsList.add(0,"computer");
		System.out.println(wordsList.toString());
		
		System.out.println("List size: " + wordsList.size());
		wordsList.add(wordsList.size(), "room"); //we do not use .length for array list. we use .size
		System.out.println(wordsList.toString());		
		
		for(int count=0; count<wordsList.size(); count++){
			System.out.println(wordsList.get(count));
			
		}
		
		System.out.println(wordsList.toString());
		wordsList.remove(1); //delete element at position 1
		System.out.println(wordsList.toString());
		
		wordsList.clear(); //delete all elements in the list
		if(wordsList.isEmpty()==true){
			System.out.println("List is empty. Operations cannot be performed");
		}else{
			System.out.println("-- Begin Operations --");
		}
		
		
		String myword = "Computer";
		String anotherWord = "Computer";
		
		if(myword.equals(anotherWord)){
			System.out.println("Same");
		}else{
			System.out.println("Diff");
		}
		
		anotherWord = "Programming";
		System.out.println("Length of myword: " + myword.length());
		System.out.println("Length of another: " + anotherWord.length());
		
		// creates the string into upper case
		System.out.println(myword.toUpperCase());
		
		// Tells the character at a certain position
		System.out.println("myword - Character at pos 3: " + myword.charAt(3));
		System.out.println("anotherWord - Character at pos 3: " + anotherWord.charAt(3));
		
	}

}
