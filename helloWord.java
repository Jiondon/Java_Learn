
public class helloWord {
	
	   public helloWord(String name){
		      // 这个构造器仅有一个参数：name
		      System.out.println("Passed Name is :" + name ); 
		   }
    public void test_1(){
        int a = 5;//定义一个变量；
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
    
    
    public static void main(String []args) {
    	
        System.out.println("Hello World");
           int a = 10;
           int b = 20;
           int c = 25;
           int d = 25;
           System.out.println("a + b = " + (a + b) );
           System.out.println("a - b = " + (a - b) );
           System.out.println("a * b = " + (a * b) );
           System.out.println("b / a = " + (b / a) );
           System.out.println("b % a = " + (b % a) );
           System.out.println("c % a = " + (c % a) );
           System.out.println("a++   = " +  (a++) );
           System.out.println("a--   = " +  (a--) );
           // 查看  d++ 与 ++d 的不同
           System.out.println("d++   = " +  (d++) );
           System.out.println("++d   = " +  (++d) );

           
           int a1 = 3;//定义一个变量；
           int b1 = ++a1;//自增运算
           int c1 = 3;
           int d1 = --c1;//自减运算
           System.out.println("进行自增运算后的值等于"+b1);
           System.out.println("进行自减运算后的值等于"+d1);
//           helloWork hello = new helloWorld("heheh");
//           hello.test_1();
     }
}
