package grade;

import java.util.Scanner;

public class TestDemo {    //Class definition

	public static void main(String[] args) {  // main method starts here
		
		Scanner sc =new Scanner(System.in);    // Taking new object of Scanner
		
		System.out.println("Enter the marks: ");    // Asking  user for marks
		int p=sc.nextInt();                         //Taking marks for p subject
		
		if(p==0)                                      
			System.out.println("You have entered zero"); // printing this if user entered zero
		if(p>0)
			System.out.println("You have entered positive value"); // printing this if user entered positive value
		if(p<0)
			System.out.println("You have entered negative value"); // printing this if user entered negative value
			
			
			
		
		int c=sc.nextInt();            //Taking marks for c subject
		
		if(c==0)
			System.out.println("You have entered zero");  // printing this if user entered zero
		if(c>0)
			System.out.println("You have entered positive value");  // printing this if user entered positive value
		if(c<0)
			System.out.println("You have entered negative value");  // printing this if user entered negative value
		
		
		int m=sc.nextInt();  // Taking marks for m subject
		
		if(m==0)
			System.out.println("You have entered zero");     // printing this if user entered zero
		
	    if(m>0)
	    	System.out.println("You have entered positive value");   // printing this if user entered positive value
	    if(m<0)
	    	System.out.println("You have entered negative value");    // printing this if user entered negative value
	    
	    
	    int sum=p+c+m;        //adding marks and storing in sum.
	     
	    double avg=sum/3;      //Taking average.
	    
	    System.out.println("The average is " +avg);  //printing average.
	    
	   if(avg>70)
		   System.out.println("The grade of student is 'A'."); // printing this if average 
	   
	   else if(avg>=61 && avg<=70)
		   System.out.println("The grade of student is 'B'."); //printing this if average is between 61 and 70.
	   
	   else 
		   System.out.println("The grade of student is 'C'."); //printing this if averaage is less than 61.
	   
		   
		 }

}
