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
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultipleIn mi = new MultipleIn();
        mi.printHello();
        
        MOExample  mo = new MOExample();
        mo.callDiffArgs();
        mo.callDiffNoOfArgs();
        mo.callDiffSeqOfArgs("aman", 1);
        
        //multithreading
         RunnableDemo R1 = new RunnableDemo( "Thread-1");
            R1.start();

            RunnableDemo R2 = new RunnableDemo( "Thread-2");
            R2.start();
        
    }
    
}
