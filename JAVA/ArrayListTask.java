import java.util.*;

public class ArrayListTask
{
 public static void main (String []Args)
 {
  ArrayList<Integer> task = new ArrayList<Integer>();
  //Create ArrayList
  task.add(87);
  task.add(65);
  task.add(24);
  task.add(13);
  task.add(45);
  task.add(90);
  task.add(36);
  task.add(42);
  System.out.println(task);
  
  //Remove the element
  task.remove(5);
  System.out.println(task);

 //Finding max and min
  int min = task.get(0);
  int max = task.get(0);

  //length of the arraylist
  int n = task.size();

  //loop for minimum from arraylist
  for(int i = 1;i < n; i++)
  {
   if(task.get(i) < min )
   {
    min = task.get(i);
   }
  }
 
  //loop for maximum from arraylist
  for(int i = 1;i < n; i++)
  {
   if(task.get(i) > max )
   {
    min = task.get(i);
   }
  }
  System.out.println("Maximum is : "+max);
  System.out.println("Minimum is : "+min); 
 }
}
