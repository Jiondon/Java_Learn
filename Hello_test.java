
import java.util.Date;
import java.util.regex.*;
public class Hello_test {
	   public Hello_test(String name){
		      // 这个构造器仅有一个参数：name
		      System.out.println("Passed Name is :" + name ); 
		   }
	 public void test_1(){
	 }
	 
	 public void test_2(double[] arrayData){
		 for(int i=0;i<arrayData.length;i++){
			 System.out.println(arrayData[i]);
			 
		 }
	 }
	 
	 public void test_3(){
	 }
	 
	 public void test_4(){
		 StringBuffer sBuffer = new  StringBuffer("taht");
		 sBuffer.append("string buff");
		 System.out.println(sBuffer);
	 }
	 
	 public void test_5(){
		  // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	 
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);
	 
	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	      } else {
	         System.out.println("NO MATCH");
	      }
	 }
	 public static void main(String []args) {
	 	
	        Hello_test hello = new Hello_test("heheh");
	        hello.test_1();
	        hello.test_3();
	        hello.test_4();

	        String str = new String("hello");
	        System.out.print(str);
	        
	        int size = 10;
	        double[] myList = new double[size];
	        myList[0]=1.2;
	        myList[1] = 4.5;
	        myList[2] = 3.3;
	        myList[3] = 13.2;
	        myList[4] = 4.0;
	        myList[5] = 34.33;
	        myList[6] = 34.0;
	        myList[7] = 45.45;
	        myList[8] = 99.993;
	        myList[9] = 11123;
	        hello.test_2(new double[] {1.7,3.1,9.8,3.8});

	        Date date = new Date();
	        System.out.println("system time is :: "+date.toString());
	        
	        hello.test_5();
	        
	  }
}
