import java.io.*;
import java.util.*;
public class NameReversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse1;
		Scanner kingKLey= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name1=kingKLey.nextLine();
		String name = name1.toLowerCase(); 
		int f= name.length();
		
		/*Scanner kingKLeyy= new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String name2=kingKLeyy.nextLine();
		String lastname= name2.toLowerCase();
		int l= lastname.length();*/
		
		for (int z=0;z<f;z++){
			reverse1=name.substring(f-z-1, f-z);
			System.out.print(reverse1);
		}
		}
	
		
		
	}


