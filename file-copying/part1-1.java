//Charchit Dahal//
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class part1
{
    public static void main(String[] args[]) throws Exception
    {	
    	FileInputStream incoming = null;
    	FileOutputStream outgoing = null;
 
    	try{
    	    incoming = new FileInputStream(args[0]);
    	    outgoing = new FileOutputStream(args[1]);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    
    	    while ((length = incoming.read(buffer)) > 0){
    	    	outgoing.write(buffer, 0, length);
    	    }

    	    incoming.close();
    	    outgoing.close();
    	    
    	    System.out.println("Copy Succesful");

    	      	    
    	}
    	  catch(IOException ioe){
      		ioe.printStackTrace();
    		
    	}
    	}
    }
