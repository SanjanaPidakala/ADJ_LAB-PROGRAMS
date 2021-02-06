package lists;

import java.util.Hashtable;

public class HashTable{ 
    public static void main(String args[]) 
    { 
        
        Hashtable<Integer, String> ht1 = new Hashtable<>(); 
  
        
        Hashtable<Integer, String> ht2 
            = new Hashtable<Integer, String>(); 
  
        
        ht1.put(1, "one"); 
        ht1.put(2, "two"); 
        ht1.put(3, "three"); 
  
        
        
        System.out.println("Mappings of ht1 : " + ht1); 
       
    } 
}
