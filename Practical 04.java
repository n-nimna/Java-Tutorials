/* Exercise 01: 
Create a class called “Employee” which has 3 private variables (empID, empName, empDesignation) and create getters and setters for each field. Please note that this has no main method since this is just  a blueprint  not a application. Now crate a test class to invoke the Employee class. Create two objects  for Mr.Bogdan and Ms.Bird and set required values using setters  and print them back on the console using getters. 
*/


package com.mycompany.quwe; 
public class Quwe { 
 
    public static void main(String[] args)  
    { 
       Employee e1 = new Employee(); 
       e1.setempID(123); 
       e1.setempName("Mr.Bogdan "); 
       e1.setempDesignation("Software Developer"); 
        
       Employee e2 = new Employee(); 
       e2.setempID(909); 
       e2.setempName("Ms.Bird "); 
       e2.setempDesignation("Manager"); 
        
       System.out.println("Employee ID:"+e1.getempID()); 
       System.out.println("Employee Name:"+e1.getempName()); 
       System.out.println("Employee Designation:"+e1.getempDesignation()); 
        
       System.out.println("Employee ID:"+e2.getempID()); 
       System.out.println("Employee Name:"+e2.getempName()); 
       System.out.println("Employee Designation:"+e2.getempDesignation()); 
        
    } 
} 





/*Exercise 02: 
Develop the following class execute and discuss the answer: Please note that each class stored in separate files. Write down the answer. 
class SuperB { 
    int x; 
    void setIt (int n) { x=n;} 
    void increase () { x=x+1;} 
    void triple () {x=x*3;}; 
    int returnIt () {return x;} 
} 
class SubC extends SuperB { 
    void triple () {x=x+3;} // override existing method 
    void quadruple () {x=x*4;} // new method 
} 
public class TestInheritance { 
    public static void main(String[] args) { 
        SuperB b = new SuperB(); 
        b.setIt(2); 
        b.increase(); 
        b.triple(); 
        System.out.println( b.returnIt() );  
        SubC c = new SubC(); 
        c.setIt(2); 
        c.increase(); 
        c.triple(); 
        System.out.println( c.returnIt() ); } 
}  */



package com.mycompany.superb; 
public class SuperrB 
{ 
    int x; 
 
public void setlt(int n) 
         
   {   x=n ;} 
 
public void increase() 
    
   { x=x+1;  } 
 
public void triple() 
         
   { x=x*3;  } 
  
public int returnlt() 
 
   { return x;} 
} 
 



package com.mycompany.superb; 
public class SuperrC extends SuperrB  
{ 
     public void triple() 
    { 
        x = x*3; 
    } 
    public void quadruple() 
    { 
        x = x*4; 
    } 
} 





package com.mycompany.testinheritance; 
public class TestInheritance  
{ 
   public static void main(String[] args) 
    { 
        SuperrB b =  new SuperrB(); 
        b.setlt(2); 
        b.increase(); 
        b.triple(); 
         
        System.out.println(b.return()); 
         
        SuperrC c = new SuperrC(); 
        c.setlt(2); 
        c.increase(); 
        c.triple(); 
         
        System.out.println(c.return()); 
         
    } } 






 
 
/*Exercise 03:  
Recall the following scenario discussed during the class. Develop a code base to represent the scenario. Add a test class to invoke Lecturer and Student class by creating atleast one object from each. 
Note: All the common attributes and behavior stored in the super class and only the specific fields and behavior stored in subclasses. 
  
Student 
  - name 
  - id 
  - course        
  +     
  setName()/getName()         
  +    setID()/getID()       
  +      
  setCourse()/getCourse() 


  Lecturer 
  - name 
  - id 
  - programme        
  +     
  setName()/getName()       
  +      setID()/getID()       
  +      setProg()/getProg() 





  Person 
  Identify field and attributes to be stored in this class   */




 package com.mycompany.test; 
public class TEST 
{ 
  public static void main(String[] args)  
    { 
        Student s1 = new Student(); 
        s1.setName("Anna"); 
        s1.setId(1234); 
        s1.setCourse("Software Engineering"); 
         

        Lecture L1 = new Lecture(); 
        L1.setName ("janne"); 
        L1.setId(3455); 
        L1.setCourse("Computer Science"); 
         
        System.out.println("Student Name:   "+s1.getName()); 
        System.out.println("Student Id:     "+s1.getId ()); 
        System.out.println("Student Course: "+s1.getCourse()); 
         
        System.out.println("Student Name:   "+L1.getName()); 
        System.out.println("Student Id:     "+L1.getId ()); 
        System.out.println("Student Course: "+L1.getCourse()); 
    } 
} 





package com.mycompany.superb; 
public class Person  
{ 
    protected String name; 
    protected int id; 
     
    public void setName(String n) 
    { 
          this.name = n; 
    } 
    public String getName() 
    { 
        return name; 
    } 
     
    public void setId(int id) 
    { 
        this.id = id; 
    } 
    public int getId() 
    { 
        return id;
    } }







package com.mycompany.superb; 
public class Student extends Person 
{ 
    private String course; 
    public void setCourse(String c) 
    { 
        this.course = c; 
    } 
     
    public String getCourse() 
    { 
        return course; 
    } 
} 
  





package com.mycompany.superb; 
public class Lecture extends Person 
{ 
    private String programme; 
     
    public void setProgramme(String p) 
    { 
        this.programme = p; 
    } 
     
    public String getProgramme() 
    { 
        return programme; 
    } 
} 




/*Exercise 04 
Develop the following class execute and discuss the answer: Please note that each public class stored in separate files. Write down the answer. 
public class Animal{} 
public class Mammal extends Animal{} 
public class Reptile extends Animal{} 
 
 
 
public class Dog extends Mammal{ 
  public static void main(String args[]){ 
      Animal a = new Animal(); 
      Mammal m = new Mammal(); 
      Dog d = new Dog(); 
      System.out.println(m instanceof Animal); 
      System.out.println(d instanceof Mammal); 
      System.out.println(d instanceof Animal); 
   } 
}  */




package com.mycompany.test2; 
public class TEST2 
{ 
 
    public static void main(String[] args) 
    { 
        Animal a = new Animal(); 
        Mammal m = new Mammal(); 
        Dog d = new Dog(); 
         
        System.out.println("m instance of Animal"); 
        System.out.println("d instance of Mammal"); 
        System.out.println("d instance of Animal"); 
         
    } 



package com.mycompany.test2; 
public class Animal 
{ 
     
} 





package com.mycompany.test2; 
public class Mammal extends Animal  
{ 
     
} 



package com.mycompany.test2; 
public class Reptile extends Animal  
{ 
     
} 




package com.mycompany.test2; 
public class Dog extends Mammal 
{ 
     
} 


































