
public class helloWord {
	
	   public helloWord(String name){
		      // �������������һ��������name
		      System.out.println("Passed Name is :" + name ); 
		   }
    public void test_1(){
        int a = 5;//����һ��������
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("���������ǰ׺�����a="+a+",x="+x);
        System.out.println("�����������׺�����b="+b+",y="+y);
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
           // �鿴  d++ �� ++d �Ĳ�ͬ
           System.out.println("d++   = " +  (d++) );
           System.out.println("++d   = " +  (++d) );

           
           int a1 = 3;//����һ��������
           int b1 = ++a1;//��������
           int c1 = 3;
           int d1 = --c1;//�Լ�����
           System.out.println("��������������ֵ����"+b1);
           System.out.println("�����Լ�������ֵ����"+d1);
//           helloWork hello = new helloWorld("heheh");
//           hello.test_1();
     }
}
