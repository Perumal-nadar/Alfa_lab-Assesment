package alfaLab_Assesment;

public class Q_no_07 {

  public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();  
	    
		m.put(1,"Chris");//add an elements
	    m.put(2,"Morris");      
	    m.put(3,"Sam");    
	    m.put(3,"Sam");//hashmap also not contain 
	    m.put(4,"Cruise");     
	    m.put(6,"Sandeep"); 
	    m.put(7,"Amar"); 
	    m.put(0,null);//null key and null value
	    m.put(5,null);//null value
	    m.put(5, "perumal");//editing using key value pair
	    m.remove(2);//removing use key
	    m.remove(7,"Amar");//removing using key value pair
	    System.out.println("Using Hashmap...");
	    
	    for(Map.Entry me : m.entrySet()){
	    	
	     System.out.println(me.getKey()+" "+me.getValue());
	    
	    }

	}
  
}
