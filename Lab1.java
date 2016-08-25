/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
   static String baseDir="C:\\Users\\student\\Documents\\NetBeansProjects\\Lab1\\src\\lab1\\";
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("---------- Lab 1 questions ---------------"+"\n");
        
        
        System.out.println(" List of programs: ");
        System.out.println
        (
                " 1. Mutliple inheritance and method overloading.\n"
        +
                " 2. Multithreading.\n"
        +
                " 3. File Operations. (Read, write, copy.)\n"
        +
                " 4. Employee question.\n"
        +       " 5. Exceptions . \n"
        +       " 6. Quit . \n");
        
        int choice;
        do
        {
            System.out.println(" Enter your choice: ");
            Scanner sc = new Scanner (System.in);
            choice  = sc.nextInt();
            switch(choice)
            {
                case 1:
                    MultipleIn mi = new MultipleIn();
                    mi.printHello();

                    MOExample  mo = new MOExample();
                    mo.callDiffArgs();
                    mo.callDiffNoOfArgs();
                    mo.callDiffSeqOfArgs("aman", 1);

                    break;
             
                case 2:
                     //multithreading
                    RunnableDemo R1 = new RunnableDemo( "Thread-1");
                    R1.start();

                    RunnableDemo R2 = new RunnableDemo( "Thread-2");
                    R2.start();
                     System.out.println(" Enter your choice: ");
    
                    break;
                
                case 3:
                    FileOps fops= new FileOps();
                    
                    fops.writeToFile(baseDir+"input.txt");
                    fops.readFile(baseDir+"input.txt");
                    fops.copyToFile(baseDir+"input.txt", baseDir+"output.txt");
                    break;
                
                case 4:
                    System.out.println(" Enter name of employee :");
                    String name= sc.next();
                
                    System.out.println(" Enter salary : ");
                    int salary= sc.nextInt();
                    Employee e = new Employee(name,salary);
                    empOps(e);
//                e.getInfo();
//                e.SalaryChange("inc", 1000);
//                e.getInfo();
//                e.quit();
        
                    break;
                case 5:
                    exceptions ex = new exceptions();
                    ex.exception();
                    break;
                case 6:
                    System.out.println(" Quitting...");
                    System.out.println(" Goodbye!");
                    break;
                default:
                    System.out.println(" Enter a valid choice please. ");
                    break;
            }
        }while(choice!=6);
        
        
        
        
        
        
    }

    private static void empOps(Employee e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println(" Following operations are avaiable "+"\n");
        
        System.out.println("1. Get employee info. \n"
        +       "2. Increment or decrement salary. \n"
        +       "3. Quit \n");
        int choice;
         //Employee e =null; ;
        do{
            System.out.println(" Enter choice : ");
            
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
       
            switch(choice)
            {

                case 1:
                    System.out.println(" Getting employee info... ");
                    e.getInfo();
                    break;
                case 2:
                        Scanner sc1;
                    System.out.println(" Increment (inc) or decrement salary (dec) : ");
                   sc1=new Scanner(System.in);
                   String ch =sc1.nextLine();
                    System.out.println(" Enter the amount : ");
                    int change = sc1.nextInt();
                    e.SalaryChange(ch, change);
                    e.getInfo();
                    break;
                case 3:
                    System.out.println(" Quitting....");
                    e.quit();
                    break;
               default:
                    System.out.println(" Please enter a valid choice ");
                    break;
            }

        }while(choice!=3);
    
    
    }

    
    
}

            