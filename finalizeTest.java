import java.io.*;
public class finalizeTest {
	  public static void hello(String args[]) throws IOException
	  {
	    char c;
	    // ʹ�� System.in ���� BufferedReader 
	    BufferedReader br = new BufferedReader(new 
	                       InputStreamReader(System.in));
	    System.out.println("�����ַ�, ���� 'q' ���˳���");
	    // ��ȡ�ַ�
	    do {
	       c = (char) br.read();
	       System.out.println(c);
	    } while(c != 'q');
	  }
	  
	  public static void main(String args[]) throws IOException
	  {
		  char c;
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.println("�����ַ�������Q�˳�");
		  
		  do{
			  c = (char) br.read();
			  System.out.println(c);
		  }while(c != 'q' || c != 'Q');
	  }
}
