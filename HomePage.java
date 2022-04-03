package Project;
import java.util.*;
import java.io.*;
public class HomePage {
	public static void main(String[] args) {
		int option=0;
		
		File file = new File("C:\\Users\\Hari\\Desktop\\Project\\Companylockers1");
		File[] listoffiles = file.listFiles();
		List<File> arrayoffiles = Arrays.asList(listoffiles);
		do
			{
			System.out.println("Company Lockers Ltd");
			System.out.println("Select an option from the menu\n\t1. Display all files\n\t2. Business level operations\n\t3. Exit");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
switch (option) {
			//Option 1 to view files
				case 1: {
					
					Collections.sort(arrayoffiles);
					for (int i = 0; i < listoffiles.length; i++) 
						{
					  		if (listoffiles[i].isFile()) 
					  		{
					  			System.out.println("File " + listoffiles[i].getName());
					  		} 
						}
						break;
					}
