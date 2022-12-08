package QuestionsNine;

import java.util.ArrayList;
import java.util.List;

import QuestionsNine.MyList;

public class MyListMain {

	public static void main(String[] args) {

		MyListManager myListManager = new MyListManager();

		MyList myList = new MyList();
		myList.setName("Merve");

		MyList myList1 = new MyList();
		myList1.setName("Ayşe");

		MyList myList2 = new MyList();
		myList2.setName("Cem");

		MyList myList3 = new MyList();
		myList3.setName("Ceren");

		myListManager.startWithC.add(myList1);
		myListManager.startWithC.add(myList);
		myListManager.startWithC.add(myList2);
		myListManager.startWithC.add(myList3);

		System.out.println("Add metodu");
		myListManager.Add();
		System.out.println("Print metodu");
		myListManager.Print();

	}

}