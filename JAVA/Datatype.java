class Datatype
 {
  public static void main(String [] args)
  {
   int x = -1;
   byte b = 5;// incompatible types: possible lossy conversion from int to byte(-128 to 127)
   short s =767;
   long l =20l;
   float f = 0.5f;
   double d = 100.5d;
   boolean bool = true;
   char c='s';
   String str ="Saranya";
   System.out.println(str);
   System.out.println(s);
   System.out.println(d);
   System.out.println(bool);
   System.out.println(c);
   System.out.println(x);
   System.out.println(l);
   System.out.println(b);
   System.out.println(f);
  }
}