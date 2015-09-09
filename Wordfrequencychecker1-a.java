//import

//package javax.annotation.processing;
import edu.princeton.cs.algs4.StdIn;
import java.util.HashMap;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class Wordfrequencychecker {
    
    public static TreeMap printer (String args) {
        // arg2 = Boolean.parseBoolean(args[1]);
     HashMap <String, String> hash = new HashMap<String,String>();
         try (BufferedReader br = new BufferedReader(new FileReader(args)))
  {

   String line;
   int linenumber=0;

   while ((line = br.readLine()) != null) {
       
       line = line.toLowerCase(); // process the line.
       if (line == null) {break;}
       line = line.trim();
       String[] delims = line.split(" ");
       
       for ( int i =0 ; i <delims.length; i ++) {
           String value = hash.get(delims[i]);
          // System.out.println(delims[i]);
            if (delims[i].endsWith(".") ){
             
               delims[i]= delims[i].substring(0, delims[i].length() - 1);
             
           }
          if(!delims[i].matches("^[0-9]*\\.?[0-9]*$")){
             if (value == null) value = Integer.toString(linenumber);
             else  value = value.concat("," + Integer.toString(linenumber));
           hash.put(delims[i], value); 
           }
         
           
       }
       linenumber = linenumber + 1;
   }        
   }
   catch (IOException e) {
   e.printStackTrace();
  }   
   
   TreeMap <String, String> map = new TreeMap <String, String>(hash);
   return map;
    }
  
public static void main(String[] args) {
     
     Wordfrequencychecker f = new Wordfrequencychecker();
     
    
     
     System.out.println(printer(args[0]));
     
     
    
    }
 
}

