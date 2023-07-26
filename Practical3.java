/*We have already discussed a about encapsulation while discussing OOPs concepts. 
The whole idea behind encapsulation is to hide the implementation details from users. If a data member is private it means it can only be accessed within the same class. No outside class can access private data member (variable) of other class. However if we setup public getter and setter methods to update (for e.g. void setSSN(int ssn))and read (for e.g.  int getSSN()) the private data fields then the outside class can access those private data fields via public methods. This way data can only be accessed by public methods,  thus making the private fields and their implementation hidden for outside classes. That’s why encapsulation is known as data hiding.
public class EncapsulationDemo{
    private String empName;

    //Getter and Setter methods

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         System.out.println("Employee Name: " + obj.getEmpName());
    } 
} 
Exercise 3-1: Develop a code for the following scenario. 
“An encapsulated class contains three variables to store Name, Age and Salary of the employee. Evelop getters and setters to set and get values . Develop a test class to test your code.”
Now modify the same code by  trying to replace the setters using  a constructor. 
*/


public class Employee  
{ 
    //data 
    private String empName; 
    private int empAge; 
    private float salary; 
 
     //methods 
     public void setName(String empName) 
    {   this.empName = empName;  } 
    public String getName() 
    {   return empName;   } 
    public void setAge(int empAge) 
    {   this.empAge = empAge;  } 
    public int getAge() 
    {   return empAge;  } 
    public void setsalary(float salary) 
    {  this.salary = salary;   } 
    public float getsalary() 
    {   return salary;   } 
} 



 //Main Method: 
 
        public class Company1 
        { 
        public static void main(String[] args)  
    { 
      Employee e1 = new Employee(); 
      e1.setName("nimeshi"); 
      e1.setAge(21); 
      e1.setsalary(200000.00f); 
      System.out.println("Name is: "+e1.getName()); 
      System.out.println("Age is: "+e1.getAge()); 
      System.out.println("Salary is: "+e1.getsalary()); 
    } 
} 



public class Employee  
{ 
    //data 
    private String empName; 
    private int empAge; 
    private float salary; 
     
    //method 
    public Employee(String empName,int empAge,float salary) 
    { 
        this.empName = empName; 
        this.empAge = empAge; 
        this.salary = salary; 
    } 
    public String getName() 
    { 
        return empName; 
    } 
    public int getAge() 
    { 
        return empAge; 
    } 
    public float getSalary() 
    { 
        return salary; 
    } 
} 



//Main Method: 
 
public class Company1 
{ 
 
    public static void main(String[] args)  
    { 
      Employee e1 = new Employee("nimeshi",21,200000.00f); 
      System.out.println("Employee Name is: "+e1.getName()); 
      System.out.println("Employee Age is: "+e1.getAge()); 
      System.out.println("Employee Salary is: "+e1.getSalary()); 
  } 
} 



/*Exercise 3-2: Code for the last example that we have discussed during the class. We need the following Output. (Use Netbeans code generation option where necessary) 
Employee Name: xxxxx (Use setter to set and getter to retrieve) 
Basic Salary: xxxx (Use setter to set and getter to retrieve) 
Bonus: xxxx (You may use the constructor to pass this value) */


public class Employee  
{ 
    //data 
    private String empName; 
    private float bsalary,bonus; 
     
    //method 
    public void setName(String empName) 
    { this.empName = empName;  } 
    public String getName() 
    {   return empName;   } 
    public void setBsalary(float bsalary) 
    {   this.bsalary = bsalary;   } 
    public float getBsalary() 
    { 
        return bsalary; 
    } 
    public void setBonus(float bonus) 
    {  this.bonus = bonus;   } 
    public float getBonus() 
    { 
        return bonus; 
    } 
    public void DisplayNewSalary() 
    { 
        float newSalary =  bsalary + bonus; 
        System.out.println("New Salary is: "+newSalary); 
    } }





//Main Method: 
 
public class Company1 
{ 
 public static void main(String[] args)  
    { 
      Employee e1 = new Employee(); 
      e1.setName("Nimeshi"); 
      e1.setBsalary(200000.00f); 
      e1.setBonus(2000.00f); 
      System.out.println("Employee Name: "+e1.getName()); 
      System.out.println("Employee bacic salary: "+e1.getBsalary()); 
      System.out.println("Bonus: "+e1.getBonus()); 
       
      e1.DisplayNewSalary(); 
 } 
} 







 
 















