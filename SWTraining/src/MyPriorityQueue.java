import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPriorityQueue {
	
	public static void main(String[] args){
		ContactComparator cComparator = new ContactComparator();
		
		//PriorityQueue<Contact> myQueue = new PriorityQueue<Contact>(10, cComparator);
		PriorityQueue<Contact> myQueue = new PriorityQueue<Contact>(10);
		Contact one = new Contact();
		one.setName("bhj");
		one.setPhoneNumber("12345");
		Contact two = new Contact();
		two.setName("abc");
		two.setPhoneNumber("4321");
		myQueue.add(one);
		myQueue.add(two);
		
		Iterator<Contact> it = myQueue.iterator();
		while(it.hasNext()){
			Contact c = it.next();
			System.out.println("Name : "+ c.getName() + " Number : "+c.getPhoneNumber());
			
		}
		
	}
}
class Contact implements Comparable<Contact>{
	String name;
	String phoneNumber;
	
	String getName(){
		return name;
	}
	void setName(String name){
		this.name = name;
	}
	String getPhoneNumber(){
		return phoneNumber;
	}
	void setPhoneNumber(String number){
		this.phoneNumber = number;
	}

	@Override
	public int compareTo(Contact o) {
		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
	}
}
class ContactComparator implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {		
		return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
	}


	
}