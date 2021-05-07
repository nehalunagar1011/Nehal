import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetter {

	static void printFirst(String s)
    {
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(s);
  
        while (m.find())
            System.out.print(m.group());
  
        System.out.println();
    }
	
	public static void main(String[] args)
    {
        String s1 = "Nehal Dineshbhai Unagar";
        printFirst(s1);
    }
}
