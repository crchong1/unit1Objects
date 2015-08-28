public class ConcatDemo
{
    public static void main( String[] args)
    {
    String animal1 = "quick brown fox ";
    String animal2 = "lazy dog.";
    String article = "The ";
    String action = "jumps over ";
    String allstrings1 = action.concat(animal2);   
    String allstrings2 = article.concat(animal1);      
    String allstrings3 = allstrings2.concat(allstrings1);
    
    System.out.println(allstrings3);
    }
}