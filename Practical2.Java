//PART – 01: 
 
/*1. Create a new class called ‘Item’ with two protected instance variables (private variables), an integer 
variable called ‘location’, and a String variable called ‘description’. */

public class Item 
{ 
  //data 
    Private  int  location; 
    private  String  description; 
} 



/*2. Add a constructor method for the Item class that takes an integer and a String as arguments (in that 
order). */

public class Item 
{ 
  //data 
    Private  int  location; 
    private  String  description; 
 
//method 
    public void setData(int location,String  description )   
} 



/*3. The constructor should assign the value of these parameters to the corresponding instance variables. */


public class Item 
{ 
    //data 
    private int location; 
    private String description; 
     
    //method 
    public void setData(int location,String  description ) 
    { 
        this.location = location; 
        this.description = description; 
    } 
} 




/*4. Add getter and setter methods for the location and description variables.*/


public class Item 
{ 
    //data 
    private int location; 
    private String description; 
     
    //setter location 
    public void setLocation(int location ) 
    {  this.location = location  } 
 
    //getter location 
    public int getLocation() 
    {   return location;  } 
     
    //setter description 
    public void setDescription(String description) 
    {   this.description = description  } 
 
    //getter description 
    public void getDescription() 
    {    return description;  } 
} 



/*5. Add another class called Monster and make the Monster class a sub-class of the Item class.*/


package com.mycompany.item; 
public class Monster extends Item 
{ 
     
} 



/*6. Add a constructor method to the Monster class that takes an integer and a String argument just like 
the Item class constructor. */


public class Monster extends Item 
{ 
    //data 
    private int location1,location2; 
    private String name; 
    //method 
    public void setData(int l1,int l2,String name) 
} 



/*7. Use these arguments to call the Item super class constructor from within the Monster class constructor 
so that the instance variables in the superclass are instantiated correctly. */


public class Monster extends Item 
{ 
    //data 
    private int location1,location2; 
    private String name; 
    //method 
    public void setData(int l1,int l2,String name) 
    { 
        this.location1 = l1; 
        this.location2 = l2; 
        this.name  = name; 
    } 
    public void display() 
    { 
       int Area = (location1 + location2); 
        System.out.println("Total location Area: "+Area); 
        System.out.println("name is: "+name); 
    } 
     
} 



//PART 2: 
 
//1. Which of these keywords is used to refer to member of base class from a sub class?  
a) upper b) super c) this  d) None of the mentioned    //super
 
//2. The modifier which specifies that the member can only be accessed in its own class is  
a) public  b) private c) protected  d) none     //private
 
//3. Which of these is a mechanism for naming and visibility control of a class and its content? 
a) Object   b) Packages    c) Interfaces    d) None of the Mentioned.        //packages
 
//4. Which of the following is correct way of importing an entire package ‘pkg’? 
a) import pkg.    b) Import pkg. c) import pkg.*   d) Import pkg.*         //import pkg
 
 
//5. Which of these method of class String is used to extract a single character from a String object?
a) CHARAT() b) charat()   c) charAt() d) CharAt()         //charAt()
 
 
//6. Which of these method of class String is used to obtain length of String object? 
  a) get() b) Sizeof() c) lengthof() d) length()        //length()
