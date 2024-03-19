public class Armstrong
{
 public static void main(String[]Args)
 {
  int Num = 153;
  int e = Num;
  int sum = 0;
  while(0 < Num)
  {
   int a = Num % 10;
   sum = sum + a * a * a;
   Num = Num / 10;
  }
  if(sum == e)
  {
   System.out.println("This Num is Armstrong");
  }
  else
  {
   System.out.println("This Num is Not Armstrong");
  }
 }
}
   