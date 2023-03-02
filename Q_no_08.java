package alfaLab_Assesment;

//8. write a program to show difference between hashmap and linked hashmap

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q_no_08 {

	public static void main(String[] args) {
		linkedhashmap();
		 hashmap();

	}
	//hashmop no gaurantee of insertion order
	@SuppressWarnings("rawtypes")
	public static void hashmap() {
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();  
	       m.put(1,"Anita");    
	       m.put(2,"Sheetal");      
	       m.put(3,"Sam");    
	       m.put(3,"Sam");  //hashmap also not contain 
	       m.put(4,"Chetna");     
	       m.put(0,null);//null key and null value
	       m.put(5,null);//null value
	       System.out.println("Using  Hashmap...");    
	       for(Map.Entry me : m.entrySet()){      
	        System.out.println(me.getKey()+" "+me.getValue());
	}

}
	//Linkedhashmap  gaurantee of insertion order
	
	@SuppressWarnings("rawtypes")
	public static void linkedhashmap() {
		
		LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();  
	       m.put(1,"Anita");  //Adding elements in Map    
	       m.put(2,"Sheetal");      
	       m.put(3,"Sam");   
	       m.put(3,"Sam"); //cannot allow duplicate value
	       m.put(4,"chetna");      
	       m.put(0,null);//null key and null value
	       m.put(5,null);//null value
	       System.out.println("Using LinkedHashmap...");    
	       for(Map.Entry me : m.entrySet()){      
	        System.out.println(me.getKey()+" "+me.getValue());
	       }
	       
	}
	
}