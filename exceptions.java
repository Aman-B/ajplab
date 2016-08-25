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
public class exceptions
{
  public void exception(){
 
    try {
      long data[] = new long[1000000000]; 
    }
    catch (Exception e) {
      System.out.println(e);
    }
 
    finally {
      System.out.println("finally block will execute always.");
    }
  }
}


