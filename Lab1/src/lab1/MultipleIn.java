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

interface COne{
    void printHello();
}
interface CTwo{
    void printHello();
}

class MultipleIn implements COne,CTwo{
     
    @Override
    public void printHello() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hello!");
    }

    
}
