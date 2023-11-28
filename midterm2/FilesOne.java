import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FilesOne{

	public static int numChars(String fileName){
		int output = 0;	
		String line = "";
		try{	
			File f = new File(fileName);	
               		Scanner scnr = new Scanner(f);
                	while(scnr.hasNextLine()){
                        	output += scnr.nextLine().length();
               		}
	
		}
		catch(FileNotFoundException e){
			System.out.println("error");
		}	
			return output;
	}	

	public static int numWords(String fileName){
		boolean isChar = false;;
		int output = 0;
		String line = "";
		try{
			File f= new File(fileName);
			Scanner scnr = new Scanner(f);
			while(scnr.hasNextLine()){
				line = scnr.nextLine();
				for(int i = 0; i < line.length(); i++){
					if(Character.isAlphabetic(line.charAt(i))){
						isChar = true;
					}
					else if(line.charAt(i) == ' '){
						if(isChar){
							output++;
						}
						isChar = false;
					}
				}
				if(isChar){
					output++;
				}
				isChar = false;
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}

		return output;
	}

	public static int longestWord(String fileName){
		boolean isChar = false;
		int length = 0;
		int output = 0;
		String line = "";
		int max = 0;
		try{
			File f= new File(fileName);
			Scanner scnr = new Scanner(f);
			while(scnr.hasNextLine()){
				line = scnr.nextLine();
				for(int i = 0; i < line.length(); i++){
					if(Character.isAlphabetic(line.charAt(i))){
						isChar = true;
						length++;
					}
					else if(line.charAt(i) == ' '){
						if(isChar){
							output++;
						}
						isChar = false;
						
						if(length > max){
							max = length;
						}
						length = 0;
					}
					
				}
				if(isChar){
					output++;
				}
				length = 0;
				isChar = false;
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}

		return max;
	}

	public static double highestAverage(String fileName){
		String[] words;
		String line = "";
		double sum = 0.0;
		double max = 0.0;
		try{
			File f = new File(fileName);
			Scanner scnr = new Scanner(f);

			while(scnr.hasNextLine()){
				line = scnr.nextLine();
				sum = 0.0;
				words = line.split(" ");
				for(int i = 1; i < words.length; i++){
					sum += Integer.parseInt(words[i]);
				}

				double average = sum / (words.length - 1);
				if(average > max){
					max = average;
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		return max;
	}

	public static int numBlanks(String fileName){
		String line = "";
		int output = 0;
		try{
			File f = new File(fileName);
			Scanner scnr = new Scanner(f);

			while(scnr.hasNextLine()){
				line = scnr.nextLine();

				if(line.equals("")){
					output++;
				}
				
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		return output;
	}
	
	public static void main(String[] args){
		
		System.out.println(numBlanks("grades.txt"));	
	}
}
