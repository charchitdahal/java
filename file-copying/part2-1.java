//Charchit Dahal//
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
 
public class part2
{
    public static void main(String[] args) throws Exception
    {	
    	InputStream incoming = null;
    	FileOutputStream outgoing = null;
 
    	try{    	    
    	   incoming = new URL(args[0]).openStream();
    	    outgoing = new FileOutputStream(args[1]);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	   
    	    while ((length = incoming.read(buffer)) > 0){
    	    	outgoing.write(buffer, 0, length);
    	    }

    	    incoming.close();
    	    outgoing.close();
    	    
    	    System.out.println("Copy Succesful");
    	    
    	}catch(IOException ioe){
      		ioe.printStackTrace();
    	 }
    }
}