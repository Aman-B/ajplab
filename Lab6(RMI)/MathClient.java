//package MathFunctions;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MathClient {
    static Scanner s=new Scanner(System.in);
    public static void main(String arg[]) {
        String serverURL="rmi://localhost/MathServer";
        int ch=0;
        double d=0.0;
        try {
            MathIntf mathIntf=(MathIntf) Naming.lookup(serverURL);
			while(true) {
				System.out.print("Math Functions\n1. Absolute\n2. cos\n3. sin\n4. tan\n5. Log(10)\n6. Exit\nEnter choice:");
				ch=s.nextInt();
				if(ch==1) {
					System.out.println("Absolute = "+mathIntf.absolute(input()));
				} 
				else if(ch==2) {
					System.out.println("cos = "+mathIntf.cosine(input()));
				}
				else if(ch==3) {
					System.out.println("sin = "+mathIntf.sine(input()));		
				}
				else if(ch==4) {
					System.out.println("tan = "+mathIntf.tangent(input()));
				}
				else if(ch==5) {
					System.out.println("log(base10) = "+mathIntf.logValue(input()));	
				}
				else if(ch==6) {
					System.out.println("Exiting client...");
					break;
				}
				else {
					System.out.println("Enter a valid option");	
				}				
			}
		
            
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(MathClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static double input() {
        System.out.println("Enter number: ");
        return s.nextDouble();
    }
}
