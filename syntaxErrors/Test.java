import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL ("http://bullseye-prod.aggrego.org/wp-ag/wp-content/mercury/uploads/sites/68/2014/10/GTNSTATE-HSC-102414-322_49738349.jpg?o=eyJ3aWR0aCI6OTk5LCJoZWlnaHQiOjYxNywieCI6MC41LCJ5IjowLjV9&s=vrPxHZDG%2BRdgXlU4nujBlbvXTKs%3D");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
