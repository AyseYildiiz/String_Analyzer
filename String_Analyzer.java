//This program executes some related methods based on the user choice.
//Ayşe Yıldız 150122015
import java.util.Scanner;

public class Pro_150122015 {

	public static void main(String[] args) {
		//Shows options to the user
		System.out.print("Welcome to our String Analyzer Program"
				+ "1. Count number of chars\n"
				+ "2. Print the words in a sentence\n"
				+ "3. Delete substring\n"
				+ "4. Replace substring\n"
				+ "5. Sort characters\n"
				+ "6. Hash code of a string\n");
		String choice = "";
		
		// A loop in main method to ask user the choice and some inputs
		while (!(choice.equals("exit")||choice.equals("quit")) ) {
			System.out.println();
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter your menu choice: ");
			choice= input.nextLine();
			
			// Calculates the number of occurrences of the character in the given input string.
			if (choice.equals("1")) {
				
				System.out.print("Enter an input string: ");
				String str = input.next();
				System.out.print("Enter an input char: ");
				String ch_str = input.next();
				char ch = ch_str.charAt(0);
				System.out.println("The number of "+ch+ " in "+ str+ " is " +numOfChars(str, ch));
				
			}
			
			//Prints the words in a string.
			else if (choice.equals("2")) {
				
				System.out.print("Enter an input string: ");
				String str = input.nextLine();
				printWords(str);
			}
			
			//Deletes the first or all substrings within a string
			else if (choice.equals("3")) {
				
				System.out.print("Enter an input string: ");
				String str = input.nextLine();
				System.out.print("Enter a substring: ");
				String subStr = input.nextLine();
				System.out.print("Enter a type: ");
				int type = input.nextInt();
				input.nextLine();
				
				System.out.println(delete(str, subStr, type));

			}
			
			//Replaces a substring in the string with another substring
			else if (choice.equals("4")) {
				
				System.out.print("Enter an input string: ");
				String str = input.nextLine();
				System.out.print("Enter the first substring: ");
				String subStr1 = input.nextLine();
				System.out.print("Enter the second substring: ");
				String subStr2 = input.nextLine();
				
				System.out.print(replace(str, subStr1, subStr2));
			}
			
			//Sorts the string in a specific order
			else if(choice.equals("5")) {
				
				System.out.print("Enter an input string: ");
				String str = input.nextLine();
				System.out.print("Enter a type: ");
				int type = input.nextInt();
				input.nextLine();
				System.out.println(sortChars(str, type));
				
			}
			
			//Calculates hash code of a given string based on an integer value
			else if (choice.equals("6")) {
				
				System.out.print("Enter an input string: ");
				String str = input.nextLine();
				System.out.print("Enter a value for b: ");
				int b = input.nextInt();
				input.nextLine();
				System.out.println(hashCode(str, b));
				
			}
			
			
		}
		//Terminates the program if the loop is exited
		System.out.println("Program ends. Bye :)");
	}
	
	public static int numOfChars(String str, char ch) {
		
		int count = 0;
		//Checks whether the character is the same as the index on each iteration
		for (int i = 0 ; i < str.length() ;i++) {
			if (str.charAt(i) == ch)
				count++;
		
		}
		return count; // The number of the character in this string
		
	}
	
	//
	public static void printWords(String str) {
		int i = 0;
		// Creates a char array
		char [] ch = new char[str.length()];
		int first = -1;
		
		// Char array consists of characters in the string
		for ( ; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			
			
		}
		
		// Prints words except the last word.
		for (i=0;i<str.length();i++) {
			char k= ch[i];
			
			// Checks characters not included in the word.
			if (k == ','|k == '.'|k == '!'|k == '?'|k == '_'|k == '-'|k == '('|k == ')'|k == ' ') {
				if (first!=-1) {
					String word= str.substring(first,i);
					System.out.println(word);
					first=-1;
							
				}
				
			}
			else if(first==-1){
				first=i;
				
			}
				
		}
		// Prints the last word.
		if (first != -1) {
			String lastWord = str.substring(first);
			System.out.println(lastWord);
		}
	
		
	}
	
	public static String delete(String str, String subStr, int type) {
		//Deletes the first occurrence of the substring
		if(type == 0) {
			for(int i = 0; i <=(str.length()-subStr.length()); i++) {
				if (str.substring(i, i+subStr.length()).equals(subStr)) {
					str = str.substring(0,i) + str.substring(i+subStr.length());
					break;
				}
			
			}
		}
		//Deletes all occurrences of the substring
		if(type == 1) {
			while (str.contains(subStr)) {
				for(int i = 0; i <= (str.length()-subStr.length()); i++) {
					if (str.substring(i, i+subStr.length()).equals(subStr)) {
					str = str.substring(0,i) + str.substring(i+subStr.length());
						
					}
				}
				
			}
		}
			
		return str;
		
	}
	// Finds a substring and changes it with another
	public static String replace(String str, String subStr1, String subStr2) {
		
		while (str.contains(subStr1)) {
			for(int i = 0; i <= (str.length()-subStr1.length()); i++) {
				if (str.substring(i, i+subStr1.length()).equals(subStr1)) {
					str = str.substring(0,i)+ subStr2 + str.substring(i+subStr1.length());
						
					}
				}
				
			}
		return str;
		
		
	}
	
	
	public static String sortChars(String str, int type) {
		char []ch = new char [str.length()];
		
		// Sorts the characters of the string in order of ASCII value from low to high.
		if (type == 0) {	
			
			int i = 0;
			for ( ; i<str.length() ; i++) { //Creates a char array using given string.
				ch[i] = str.charAt(i);
			}
			for (i = 0 ;i<ch.length-1 ;i++ ) {
				for (int j = 0 ; j<ch.length -i -1; j++) {
					
					if(ch[j]> ch[j+1]) {
						char temp = ch[j];
						ch[j] = ch[j+1]; //swaps the elements
						ch[j+1] = temp;
						
					}
				}	
			}
			
			str="";
			for ( i = 0 ; i<ch.length ; i++) {
				str += ch [i] +"";  // Converts ordered array to string.
				}
			
		}
		
		//Sorts the characters of the string in special order
			if(type == 1) {
				str= result(str);
				
		}
		return str;

	
	}

	//Returns the final string version of the sequence
	public static String result(String str) {
		char []ch = new char [str.length()];
		int i = 0;
		for (  ;i<str.length() ; i++) {
			ch[i] = str.charAt(i);
			
		}
		order(ch);
		str="";
		for ( i=0; i<ch.length ; i++) {
			str += ch[i];
		}
		return str;
		
	}
	
	//Sorts the char array's elements
	public static void order(char[]ch) {
		
		for (int i = 0 ;i<ch.length-1 ;i++ ) {
			for (int j = 0 ; j<ch.length -i -1; j++) {
				
				if(compare(ch[j], ch[j+1])>0) {
					char temp = ch[j];
					ch[j] = ch[j+1]; //swaps the elements
					ch[j+1] = temp;
					
				}
			}
			 
		}
		
	}
	
	//Compares the types of characters
	public static int compare (char x, char y) {
		int xType = determineType(x);
		int yType = determineType(y);
		
		if (xType != yType) 
			return xType-yType;
		
		else
			return x-y;	
		
	}
	
	//Determines the types of characters
	public static int determineType(char a) {
		if(Character.isLowerCase(a))
			return 1;
		else if (Character.isUpperCase(a))
			return 2;
		else if (Character.isDigit(a))
			return 3;
		else
			return 4;
		
	}

	//Returns hash code
	public static int hashCode(String str, int b) {
		int hashCode=0;
		for (int i=0; i<str.length();i++) {
			char s= str.charAt(i);
			//Hash code formula
			hashCode+= s*Math.pow(b,str.length()-i-1);
			
		}
		return hashCode;
	}


	
}

