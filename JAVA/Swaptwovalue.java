public class Swaptwovalue
{
 public static void main(String []Args)
 {
  int A = 5;
  int B = 10;
  System.out.println("Before Swapping");
  System.out.println(A);
  System.out.println(B);
  
  A = A + B;
  B = A - B;
  A = A - B;

  System.out.println("After Swapping");
  System.out.println(A);
  System.out.println(B);
 }
}

  
  
