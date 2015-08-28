public class TrimIt
{
    public static void main(String[] args)
    {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
      
      String ts1 = sentence1.trim();
      String ts2 = sentence2.trim();
      String ts3 = sentence3.trim();
      
       
      String message = ts1+ts2+ts3;

      System.out.println(message);
   }
}
