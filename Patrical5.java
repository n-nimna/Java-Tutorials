/*Exercise 01:  
Declare an interface called “MyFirstInterface”. Decalre integer type variable called “x”.  Declare an abstract method called “display()”. */



package com.mycompany.mavenproject4; 
public interface MyFirstInterface 
{ 
int x = 10; //integer type variable 
void display(); //abstract method declaration 
} 





//1. Try to declare the variable with/without public static final keywords.  
 package com.mycompany.mavenproject4; 
 public interface MyFirstInterface 
 { 
     int n = 20; 
 } 




• ) Declaring the variable with public static final keywords: 
           public interface MyFirstInterface 
         {  
            public static final int n = 10; 
          }  
There is no practical difference between these two approaches. In both cases, the variable "n" will be     treated as a constant value that is accessible to implementing classes, and its value cannot be changed once it is assigned 




  /*2. Declare the abstract method with/without abstract keyword. Is there any difference between these two approaches? Why? */



public interface MyFirstInterface  {  void display();  } 
 
public interface MyFirstInterface  {  abstract void display();  } 
 
There is no practical difference between these two approaches. In both cases, the method display() will be treated as an abstract method, which means that any class implementing the interface must provide an implementation for this method. 
 
 




/*3. Implement this into a class called “IntefaceImplemented” . Override all the abstract methods. Try to change the value of x inside this method and print the value of x. Is it possible for you to change x? why? */
 
 

public interface MyFirstInterface {  
 
int x = 10; // Integer type variable  void display(); // Abstract method declaration  
 
} 
 
 


public class InterfaceImplemented implements MyFirstInterface 
  {  @Override  public void display() 
   {  // Attempt to change the value of x 
     // x = 20; // This will cause a compilation error  
     // Print the value of x  System.out.println(x); 
   } 
  } 

  

/*Exercise 02: 
 
Main package com.mycompany.main4;

public class Main4
  { 
    public static void main(String[] args
    {  Politician p1=new Politician(); 
       p1.speak(); Priest p2=new Priest();  
       p2.speak();  
       Lecturer L1=new Lecturer();  
       L1.speak();  
    } 
     } 





• package com.mycompany.main4; 
 public interface Speaker  
{  
public void speak(); 
 } 



• package com.mycompany.main4; 
 public class Politician implements Speaker  
{  
@Override 
 public void speak()  
{  
System.out.println("I am politician");  
} 
} 



• package com.mycompany.main4;  
public class Priest implements Speaker  
{  
@Override 
 public void speak()  
{  
System.out.println("I am Priest"); 
 }  
} 
 
 
• package com.mycompany.main4;  
 public class Lecturer implements Speaker 
 { 
 @Override  
public void speak() 
 {  
System.out.println("I am lecturer"); 
 } 
 } 
 

                                                                                  









/*Exercise-03  
Try following code. What is the outcome? Why? 
 Class 01:  
final class Student  
{  
final int marks = 100;  
final void display();  
}  
Class 02:  
class Undergraduate extends Student{} */





Correct code 
 package com.mycompany.main1; 
 public class Main1 
 {  
public static void main(String[] args)  
{ Student student = new Student(); 
 student.display(); 
 Undergraduate undergraduate = new Undergraduate();  
undergraduate.display();  
}  
} 






• package com.mycompany.main1; 
 final class Student  
{ 
 final int marks = 100; 
 final void display()  
{  
System.out.println("Marks is"+marks); 
 }  
} 
 
 
• package com.mycompany.main1;  
class Undergraduate extends Student 
 { 
 } 
 
 





//Exercise-04: 

• Main classpackage com.mycompany.findarea;  
public class Findarea  
{ 
   public static void main(String[] args)  
{ 
 Circle c1=new Circle(2);  
c1.display();  
Rectangle r1=new Rectangle(5,4); 
 r1.display();  
}  
} 
 
 
• Shape class(parent class) package com.mycompany.findarea;  
public abstract class Shape  
{  
public abstract double calculateArea(); 
 public void display()  
{ 
 System.out.println("Area:"+calculateArea()); 
 }  
} 
 
 
 
• Circle class(child class) package com.mycompany.findarea;  
public class Circle extends Shape 
 {  
private double rad;  
public Circle(double rad) 
 { 
 this.rad=rad;  
}  
@Override  
public double calculateArea() 
 { 
 return Math.PI*rad*rad;  
} 
 } 
 
 
• Rectangle class(child class) package com.mycompany.findarea;  
public class Rectangle extends Shape  
{  
private double width,height; 
 public Rectangle(double width,double height)  
{  
this.width=width;  
this.height=height;  
} @Override 
 public double calculateArea() 
 { 
 return width*height;  
}
} 
 
























