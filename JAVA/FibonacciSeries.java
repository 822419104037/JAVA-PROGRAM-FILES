public class FibonacciSeries
{
 public static void main(String []Args)
 {
  int count = 10;
  int n1 = 0;
  int n2 = 1;
  
  for(int i=0;i < count - 3;i++)
  {
   System.out.print(n1 +" ");
   int n3 = n1 + n2;
   n1 = n2;
   n2 = n3;
  }
 }
}