
import java.util.Scanner;


/**
 * Employee class
 */


public class Employee {
    
    //Establish attributes
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    
    /**
     * The Employee constructor accepts
     * arguments for all fields in the Employee class
     */
    
    public Employee()   {
        
    }
    
    public Employee(String n, int id, String d, String p)   {
        
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }
    
    /**
     * The setName method stores an argument
     * in the name field 
     */
    public void setName(String n)   {
        name = n;
    }
    
    /**
     * The setIDNumber method stores an argument
     * in the idNumber field
     */
    public void setIDNumber(int id) {
        idNumber = id;
    }
    
    /**
     * The setDepartment method stores an argument
     * in the department field
     */
    public void setDepartment(String d) {
        department = d;
    }
    
    /**
     * The setPosition method stores an argument
     * in the position field
     */
    public void setPosition(String p)   {
        position = p;
    }
    
    /**
     * The getName method returns the argument
     * stored in the name field
     */
    public String getName() {
        return name;
    }
    
    /**
     * The getIDNumber method returns the argument
     * stored in the idNumber field
     */
    public int getIDNumber()    {
        return idNumber;
    }
    
    /**
     * The getDepartment method returns the argument
     * stored in the department field
     */
    public String getDepartment()   {
        return department;
    }
    
    /**
     * The getPosition method returns the argument 
     * stored in the position field
     */
    public String getPosition() {
        return position;
    }

    void getName(Scanner keyboard) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
