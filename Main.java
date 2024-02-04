public class Main
{
 Main ()
 {
  VOTING_AGE =18;
 }
 Main(Main m)
 {
  System.out.println(m.VOTING_AGE);
 }
 public static void main (String Args[])
 {
  Main m= new Main();
  new Main(m);
 }
}