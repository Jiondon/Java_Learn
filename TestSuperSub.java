//ππ‘Ï∆˜≤ªºÃ≥–  ≤‚ ‘
import java.util.*;
class SuperClas {
  private int n;
  SuperClas(){
    System.out.println("SuperClass()");
  }
  SuperClas(int n) {
    System.out.println("SuperClass(int n)");
    this.n = n;
  }
}
class SubClas extends SuperClas{
  private int n;
  
  SubClas(){
    super(300);
    System.out.println("SuperClass");
  }  
  
  public SubClas(int n){
    System.out.println("SubClass(int n):"+n);
    this.n = n;
  }
}
public class TestSuperSub{
  public static void main (String args[]){
    //SubClass sc = new SubClass();
    SubClas sc2 = new SubClas(200); 
    List<?> list;
  }
}
