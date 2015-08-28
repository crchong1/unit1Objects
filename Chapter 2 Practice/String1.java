
public class String1
{
    public static void main( String[] args)
    {
        String greeting = "Hello, World!";
        int n = greeting.length();
        
        System.out.println(n);
        String river = " Mississippi";
        String bigRiver = river.toUpperCase();
        
        
        
        String newRiver = river.concat(bigRiver);
        System.out.println(newRiver);
        
    } 
}
