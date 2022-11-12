package sample20programs;

       ///////// 19. Detect Loop in a LinkedList///////////

public class DetectLoop {

	public static void main(String[] args) {
	
	
	int detectloop(struct node *list)   
	{  
	   struct node *S = list, *F=list;  
	   while(S && F && F->next)   
	{  
	    S=S->next;  
	  F=F->next->next;  
	if(F==S)  
	{  
	   printf("loop exists");  
	  return 1;  
	}  
	}  
	return 0;  
	}  

	}

}
