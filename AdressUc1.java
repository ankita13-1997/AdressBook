import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;



class Book
{
	Scanner sc= new Scanner(System.in);
	
	int id;
	String fsname="";
	String lname="";
	String city="";
	String state="";
	String zip_code="";
	String phone_no="";
	String email="";
	public Book( int id, String fsname, String lname, String city, String state, String zip_code,
			String phone_no, String email) {
		super();
		//this.sc = sc;
		this.id = id;
		this.fsname = fsname;
		this.lname = lname;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.phone_no = phone_no;
		this.email = email;
	}
	
	
}

public class AdressUc1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> store=new Hashtable<Integer,Book>();
		Book b11=new Book(1,"krishna","kumari","dknl","odisha","75433","98989898","dg@we");
		Book b12=new Book(2,"krishna11","kumari11","dknl11","odisha11","7543311","9898989811","dg@we11");
        store.put(1, b11);
        store.put(2,b12 );
        for(Map.Entry<Integer, Book> e1:store.entrySet())
        {
        	int key=e1.getKey();
        	Book b=e1.getValue();
        	System.out.println(key+ " contact details are:");
        	System.out.println(b.id+ " " +b.fsname+ " " +b.lname+ " " +b.city+ " " +b.state+ " " +b.zip_code+ " " +b.phone_no+ " " +b.email+ " " );
        	
        	
        	
        	
        	
        }
          
	}

}
