import java.util.Scanner;

class sum {
  
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("give the 2 number");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      float var4 = (float)var2 / (float)var3;
      System.out.println(var2 + var3);
      System.out.println(var2 * var3);
      System.out.println(var2 - var3);
      System.out.println(var4);
      var1.close();
   }
}