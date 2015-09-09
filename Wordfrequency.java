//import
import edu.princeton.cs.algs4.StdIn;
import java.util.HashMap;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class Wordfrequency {
    //public final Comparator<Integer> VALUE_COMPARE = new VALUE_COMPARE();
    
    public static TreeMap<String, Integer> SortByValue (HashMap<String, Integer> map) {
 System.out.println( "This is map");
 ValueComparator vc =  new ValueComparator(map);
  TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(vc);
  System.out.println( "This is map" + map);
  System.out.println( "This is sortedmap" + sortedMap);
  sortedMap.putAll(map);
  return sortedMap;
 }
    
    
   public static class ValueComparator implements Comparator<String> {
 
    Map<String, Integer> map;
 
    public ValueComparator(Map<String, Integer> base) {
        this.map = base;
    }
 
    public int compare(String a, String b) {
        if (map.get(a) >= map.get(b)) {
            return -1;
        } else {
            return 1;
        } 
    }
   } 
public static void main(String[] args) {
     
     Wordfrequency f = new Wordfrequency();
     
     boolean arg2;
     arg2 = Boolean.parseBoolean(args[0]);
    // arg2 = Boolean.parseBoolean(args[1]);
     HashMap <String, Integer> hash = new HashMap<String,Integer>();
     
    while(!StdIn.isEmpty()){
         
      String s = StdIn.readString();
    
       s = s.toLowerCase();
      boolean isObjectKeyInHashMap = hash.containsKey(s);
       if (isObjectKeyInHashMap == true){
           int value = hash.get(s);
           System.out.println("yes");
           value = value +1;
           hash.put(s, value);
          
       }
       else {
           
           hash.put(s, 1);
             
       }   
    }
        
     
     // sort the hashmap alphabetically or numerically and then use comparator 
     // for printing
     if (arg2 == false) {
         TreeMap<String, Integer> map = SortByValue(hash);
     
         System.out.println(map);
     }
     else if (arg2 == true) {
         TreeMap<String, Integer> map = new TreeMap<String,Integer>(hash);
         System.out.println(map);
     }
      /*  for(String key:map.keySet()){
            int val = map.get(key);
            System.out.println(key + "yes "+ val);
            System.out.println();
    }
    */
}
}