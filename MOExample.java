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

class DiffArgs
{
    public void display(String h)
    {
        System.out.println("String : "+h);
    }
   public void display(int i)
    {
        System.out.println("Integer : "+i);
    }
}

class DiffNoOfArgs
{
    public void display(String h)
    {
        System.out.println("String : "+h);
    }
    public void display(String s, int i)
    {
        System.out.println("String : "+s +" & "+"Integer : "+i);
    }
}

class DiffSeqOfArgs
{
    public void display (String s, int i)
    {
        System.out.println("String : "+s +" & " +" Int : "+i);
    };
    public void display (int i,String s)
    {
        System.out.println("Int : "+ i+" & "+" String : "+s);
    };
    
    
}

public class MOExample 
{
    public void callDiffArgs()
    {
        DiffArgs da=new DiffArgs();
        da.display("hello");
        da.display(1);
    }
    public void callDiffNoOfArgs()
    {
        DiffNoOfArgs dna = new DiffNoOfArgs();
        dna.display("hello");
        dna.display("hello", 1);
    }
    public void callDiffSeqOfArgs(String s , int i)
    {
        DiffSeqOfArgs dfsa = new DiffSeqOfArgs();
        dfsa.display(s, i);
        dfsa.display(i,s);
    }
}
