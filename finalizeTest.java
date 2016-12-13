import java.io.*;
public class finalizeTest {
	  public static void hello(String args[]) throws IOException
	  {
	    char c;
	    // 使用 System.in 创建 BufferedReader 
	    BufferedReader br = new BufferedReader(new 
	                       InputStreamReader(System.in));
	    System.out.println("输入字符, 按下 'q' 键退出。");
	    // 读取字符
	    do {
	       c = (char) br.read();
	       System.out.println(c);
	    } while(c != 'q');
	  }
	  
	  public static void main(String args[]) throws IOException
	  {
		  char c;
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.println("输入字符，按下Q退出");
		  
		  do{
			  c = (char) br.read();
			  System.out.println(c);
		  }while(c != 'q' || c != 'Q');
	  }
}
