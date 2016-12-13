import java.io.*;
import java.net.*;
public class URLDemo {
	   public static void main(String [] args)
	   {
	      try
	      {
	         URL url = new URL("http://www.w3cschool.cc");
	         URLConnection urlConnection = url.openConnection();
	         HttpURLConnection connection = null;
	         if(urlConnection instanceof HttpURLConnection)
	         {
	            connection = (HttpURLConnection) urlConnection;
	         }
	         else
	         {
	            System.out.println("Please enter an HTTP URL.");
	            return;
	         }
	         InputStreamReader isr = new InputStreamReader(connection.getInputStream(),"UTF-8");
	         BufferedReader in = new BufferedReader(isr);
	         String urlString = "";
	         String current;
	         while((current = in.readLine()) != null)
	         {
	        	 System.out.println("readLine result current:: " + current);
	        	 urlString += current;
	         }
	         System.out.println(urlString);
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	   }
}
