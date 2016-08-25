/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class FileOps {
    FileInputStream in = null;
      FileOutputStream out = null;
      
    public void readFile(String filename)
    {
         BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader(filename));
            System.out.println("Printing file contents : ");
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: "+filename);
        } catch (IOException e) {
            System.err.println("Unable to read the file: "+filename);
        }
    }
        public void writeToFile(String filename)
        {
            PrintWriter writer;
            StringBuffer sbf = new StringBuffer();
            
            Scanner sc;
            String in=null;
            
            
        try {
            System.out.println("Enter the contents ( Enter 0 to exit) : "+"\n");    
                do
                {
                  sc= new Scanner(System.in);
                  
                  in=sc.nextLine();
                  if(!(in.equalsIgnoreCase("0")))
                  {
                  sbf.append(in);
                  }  
                 }while(!(in.equalsIgnoreCase("0")));
            writer = new PrintWriter(filename, "UTF-8");
             writer.println(sbf.toString());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOps.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileOps.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
        }
        
       public void copyToFile(String inputfile, String outputfile)
       {
        FileInputStream instream = null;
	FileOutputStream outstream = null;
 
    	try{
    	    File infile =new File(inputfile);
    	    File outfile =new File(outputfile);
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
            readFile(outputfile);
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
           
       }
    

}
