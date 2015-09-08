import java.util.TreeMap;
public class Wordfrequencychecker2 {
  
public static void main(String[] args) {
    Wordfrequencychecker2 yes = new Wordfrequencychecker2();
    Wordfrequencychecker f = new Wordfrequencychecker();
    TreeMap <String, String> hash = f.printer(args[0]);
    System.out.println(hash.get(args[1].toLowerCase()));
}
}