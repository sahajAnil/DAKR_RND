package Collections;

           //////*You cannot store duplicate keys in HashMap. 
           ////// However, if you try to store duplicate key with another value,//////
           ///// it will replace the value./////////


import java.util.*;  
public class HashMap2{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(1,"Grapes"); //trying duplicate key  
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  

