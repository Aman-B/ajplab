/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author student
 */
public class Employee {
    String name;
    int salary;
    public Employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
        
         System.out.println("Emp name : "+ name+" & Salary : "+salary);
        
    }
    public void SalaryChange(String choice, int amt)
    {
        if(choice.equals("inc"))
        {
            salary=salary+amt;
            System.out.println("Salary : "+salary);
        }
        else
        {
            salary=salary-amt;
            System.out.println("Salary : "+salary);
            
        }
        
    }
    public void quit()
    {
        salary=0;
        System.out.println("Salary : "+salary);
        
    }
    public void getInfo()
    {
        System.out.println("Emp name : "+ name+" & Salary : "+salary);
    }
    
}
