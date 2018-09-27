/**
 * Dylan Klingensmith
 * CH3PC1 - Employee Class
 * AP Computer Science 
 * Date
 */

import java.util.Scanner;

public class EmployeeClass {

    public static void main(String[] args) {
        
        //Establish employee objects and scanner object with input variables
        Employee e1 = new Employee("Susan Meyers", 47899, "Accounting",
            "Vice President");
        Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing",
            "Engineer");
        Employee e4 = new Employee();
        
        Scanner keyboard = new Scanner(System.in);
        String stringInput;
        int numInput;
        
        //Get employee information from user
        System.out.println("Input the employee's name.");
        stringInput = keyboard.nextLine();
        e4.setName(stringInput);
        
        System.out.println("Input the employee's ID number.");
        numInput = keyboard.nextInt();
        e4.setIDNumber(numInput);
        
        System.out.println("Input the employee's department.");
        stringInput = keyboard.next();
        e4.setDepartment(stringInput);
        
        System.out.println("Input the employee's position.");
        stringInput = keyboard.next();
        e4.setPosition(stringInput);
        
        //Print table using accessor methods
        System.out.println(e1.getName() + "\t" + e1.getIDNumber() + "\t" 
            + e1.getDepartment() + "\t" + e1.getPosition());
        
        System.out.println(e2.getName() + "\t" + e2.getIDNumber() + "\t" 
            + e2.getDepartment() + "\t\t" + e2.getPosition());
        
        System.out.println(e3.getName() + "\t" + e3.getIDNumber() + "\t" 
            + e3.getDepartment() + "\t" + e3.getPosition());
        
        System.out.println(e4.getName() + "\t" + e4.getIDNumber() + "\t" 
            + e4.getDepartment() + "\t\t" + e4.getPosition());

       
        
        
    }

}
