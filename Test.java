public class Test {
    public static void main(String[] args) {
      show(new Cat1());  // �� Cat ������� show ����
      show(new Dog1());  // �� Dog ������� show ����
                
      Animal1 a = new Cat1();  // ����ת��  
      a.eat();               // ���õ��� Cat �� eat
      Cat1 c = (Cat1)a;        // ����ת��  
      c.work();        // ���õ��� Cat �� catchMouse
  }  
            
    public static void show(Animal1 a)  {
      a.eat();
        // �����ж�
      if(a.getClass() == Dog1.class){
    	  System.out.println("dog");
      }else if(a.getClass() == Cat1.class){
    	  System.out.println("cat");
      }
        if (a instanceof Cat1)  {  // è�������� 
      
            Cat1 c = (Cat1)a;  
            c.work();  
        } else if (a instanceof Dog1) { // ���������� 
            Dog1 c = (Dog1)a;  
            c.work();  
        }  
    }  
}
 
abstract class Animal1 {  
    abstract void eat();  
}  
  
class Cat1 extends Animal1 {  
    public void eat() {  
        System.out.println("����");  
    }  
    public void work() {  
        System.out.println("ץ����");  
    }  
}  
  
class Dog1 extends Animal1 {  
    public void eat() {  
        System.out.println("�Թ�ͷ");  
    }  
    public void work() {  
        System.out.println("����");  
    }  
}