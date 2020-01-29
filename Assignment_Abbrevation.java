package assignment_CP4112;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_Abbrevation {

	public static void main(String[] args) throws IOException {
		
		File infile=null;
		
		infile=getFile();
		readFile(infile);

	}
	
	private static void readFile(File infile) throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader(infile));
		
		String output;
		
		while((output =br.readLine())!=null) {
			
			
			String arr[]=output.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				
				if(arr[i].length() >= 4) {
					
					System.out.println("Word: " + arr[i]);
					
					if(arr[i].contains("'") || arr[i].contains("?") || arr[i].contains(",") || arr[i].contains(".") || arr[i].contains("!")) {
						
						String[] arr1 = arr[i].split("'"); 
						
						for(int j = 0; j < arr1.length; j++)
							System.out.println("Word with Special Character: " + arr1[j]);
						
					} 
						
				for(int j = 1; j < arr[i].length() - 1; j++) {
									
					
            System.out.println("Everything except first and last character: " + arr[i].charAt(j));
							
						}
						
			
					
					
					
					
				}
				
			}
			}
		
		
	}

	private static File getFile() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file to be read: ");
		File infile = new File(scan.nextLine());
		
		if(!infile.exists())
			throw new FileNotFoundException();
		
		return infile;
		
		}
	}


