package CollectionsAndBasics;

public class tEX {

	public static void main(String[] args) {
		 /* try  
	        {  
	        int data=50/0; 
	        }  
	               
	        catch(Exception e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  */
		
		  try  
	        {  
	        int arr[]= {1,3,5,7};  
	        System.out.println(arr[10]); //may throw exception   
	        }  
	            // handling the array exception  
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  

	}

