package QuestionsNine;

import java.util.ArrayList;
import java.util.List;



public class MyListManager  {
	 List<MyList> startWithC = new ArrayList<>(); 
	
	 public void MyListManager(){
	  }
	 public void Print() {

			for(MyList newMyList:startWithC) {//print metodu
		    	  System.out.println(newMyList.getName());
		      }
			
		     
	 }
	 
	 
		public void Add() {
			
		 for(MyList newMyList:startWithC) {
					if(newMyList.getName().startsWith("C")) {
			    	  System.out.println(newMyList.getName());
			      
	    }
	}
  }
}
		

	

