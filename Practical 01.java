*//Write you first java programme to display “Hello World” on the screen//

public class Red 
 { 
           public static void main(String[] args)  
       { 
                        System.out.println("Hello World!"); 
       } 
        } 

/*Write a programme to display your name on the first line and to display your degree programme on the second line on the screen. Please use command line (cmd) to execute your code. */

package com.mycompany.namedegree;
public class NameDegree {

    public static void main(String[] args) 
    {
         
        System.out.println("My name is Awanthi.");
        System.out.println(" My Degree program is Software  Engineering");
    
    }
}


/*3. Write down a programme to get the following output using a for loop. Repeat the same example by using a while loop.  
 
Executing Loop  0                  
Executing Loop  1        
Executing Loop  2                  
Executing Loop  3                  
Executing Loop  4  */


public class Loop  
{ 
   public static void main(String[] args)  
    { 
        for(int i=0;i<5;i++) 
        { 
            System.out.println("Executing loop"+i); 
        } 
    } 
} 
 
 

public class Loop  
{  public static void main(String[] args)  
    { 
       int i=0; 
       while(i<5) 
        {      System.out.println("Executing loop"+i); 
            i++; 
         } 
    } 




 /* 4.	Write a class and insert the following code block into the appropriate place. Execute the code and get the result.
“
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print(“I’m  out of the Loop now");		 “

Results: 

Repeat the same code using “continue” instead of “break”. Write down the output.

Results:  */

 
break out put: 
 
10 
20 
I’m  out of the Loop now



Continue: 
 
public class Loop  
{ 
    public static void main(String[] args)  
    { 
      int [] numbers = {10, 20, 30, 40, 50}; 
      for(int x : numbers ) 
      { 
         if( x == 30 ) 
         { continue; } 
         System.out.print( x ); 
         System.out.print("\n"); 
      } 
          System.out.println("I’m  out of the Loop now"); 
    } 
} 


Out put: 
 
10 
20 
40 
50 
I’m  out of the Loop now 




/*5.	Write a class and insert the following code block into the appropriate place. Execute the code and get the result.
1.	char grade =‘A’;
2.	 switch(grade)
3.	{
4.	case 'A' :
5.	System.out.println("Excellent!"); 
6.	break;
7.	case 'D' :
8.	System.out.println("You passed");
9.	case 'F' :
10.	System.out.println("Better try again");
11.	break;
12.	default :
13.	System.out.println("Invalid grade");
14.	}
15.	System.out.println("Your grade is " + grade);

Results: 

Repeat the same removing “break” command at line number 6. Write down the output.

Repeat the same scenario by using if-else-if statement instead of switch case. 
*/



//OUT PUT: 
 
Excellent! 
Your grade is A



  

 //removing“Break” line 6: 
 
public class Grade 
{ 
    public static void main(String[] args)  
    { 
      char grade = 'A'; 
      switch(grade) 
 { 
 case 'A' : 
 System.out.println("Excellent!");  
 case 'D' : 
 System.out.println("You passed"); 
 case 'F' : 
 System.out.println("Better try again"); 
 break; 
 default : 
 System.out.println("Invalid grade"); 
 } 
 System.out.println("Your grade is " + grade);   
} 
} 

//OUTPUT:

Excellent! 
You passed 
Better try again 
Your grade is A 




//Using If-else-if: 
 
public class Grade  
{ 
    public static void main(String[] args)  
    { 
      char grade = 'A'; 
              if(grade=='A') 
              { 
                  System.out.println("Excellent!"); 
              } else if(grade=='D') 
              { 
                  System.out.println("You passed"); 
              } else if(grade=='F') 
              { 
                  System.out.println("Better try again"); 
              } else 
              { 
                   System.out.println("Invalid grade"); 
              } 
              System.out.println("You grade is "+grade); 
      } 
} 

//OUTPUT: 
 
 Excellent! 
You grade is A 
  




/*6.	As of java 5 the enhanced for loop was introduced. This is mainly used for Arrays. Below code contains few mistakes. First execute the code. Then identify the errors printed on the console. Rectify all the errors and execute to get the output:
	class TestEnhanceForLoop {
   	public static void mains(String args[]){
     	 int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers ){
        			 System.out.print( x );
         			System.out.print(",")
      		}
	 System.out.print("\n");
      	String [] names ={“James”, "Larry", "Tom", "Lacy"}
      		for( String name : names ) {
        		 	System.out.print( name );
         			System.out.print(",");
     	   	Output: */

  


   //Correct Code: 
 
public class TestEnhanceForLoop  
{ 
    public static void main(String[] args)  
    { 
      int [] numbers = {10, 20, 30, 40, 50}; 
        for(int x : numbers ) 
                { 
             System.out.print( x ); 
              System.out.print(","); 
        } 
  System.out.print("\n"); 
        String [] names ={"James", "Larry", "Tom", "Lacy"}; 
        for( String name : names ) 
                { 
             System.out.print( name ); 
              System.out.print(","); 
                } 
    } 
} 

//OUT PUT: 
 
10,20,30,40,50, 
James,Larry,Tom,Lacy, 

