public class saran
{
 String studentName = "Saran";
 static String javaMentorName ="Vijay";
 final static String MentorName ="Vijay";
 
 public static void main(String[] args)
 {
  String welcomeMessage = "Welcome to Java Class";
  System.out.println(welcomeMessage);
  System.out.println(new saran ().studentName);

  MentorName = "New Mentor";
  System.out.println(MentorName);
 }
}