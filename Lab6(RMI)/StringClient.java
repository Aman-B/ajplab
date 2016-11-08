import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringClient {
    public static void main(String arg[]) {
        String serverURL="rmi://localhost/StringServer";
        int ch=0;
		Scanner s=new Scanner(System.in);
		String s1="",s2="";
		char c;
        try {
            StringIntf stringIntf=(StringIntf) Naming.lookup(serverURL);
			while(true) {
				System.out.print("String Functions\n1. Length\n2. Concat\n3. IndexOf\n4. toLowerCase\n5. toUpperCase\n6. Exit\nEnter choice:");
				ch=s.nextInt();
				if(ch==1) {
					System.out.print("Enter string:  ");
					s1=s.next();
					System.out.println("Length = "+stringIntf.len(s1));
				} 
				else if(ch==2) {
					System.out.print("Enter string1:  ");	s1=s.next();
					System.out.print("Enter string2:  ");	s2=s.next();
					System.out.println("Concatenated string = "+stringIntf.conc(s1,s2));
				}
				else if(ch==3) {
					System.out.print("Enter string:  ");	s1=s.next();
					System.out.print("Enter a character:  ");	c=s.next().charAt(0);
					System.out.println("indexOf("+c+") = "+stringIntf.index(s1,c));
				}
				else if(ch==4) {
					System.out.print("Enter string:  ");	s1=s.next();
					System.out.println("lowerCase = "+stringIntf.lower(s1));
				}
				else if(ch==5) {
					System.out.print("Enter string:  ");	s1=s.next();
					System.out.println("upperCase = "+stringIntf.upper(s1));
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
            Logger.getLogger(StringClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
