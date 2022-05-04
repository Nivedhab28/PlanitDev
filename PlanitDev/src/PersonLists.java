import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class person{
	String name;
	String  date;
	String nationality;
	
	person(String n, String d, String nat){
		this.name= n;
		this.date=d;
		this.nationality=nat;
	}
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("DOB:"+this.date);
		System.out.println("Nationality:"+this.nationality);

	}
}
public class PersonLists {

	public static void main(String[] args) {
List<person> List = new ArrayList<person>();

String[] nam= {"pooja","karthi","nive","karthi"};
String[] dob = {"10/5/96","5/5/96","5/6/96","8/5/96"};
String[] nation = {"London","Japan","Australia","Itly"};
 
for(int i=0;i<4;i++)
{
	person p=new person(nam[i],dob[i],nation[i]);
	List.add(p);
	List.get(i).display();  

}
//duplicate list
Set<String> s = new HashSet<>();
for(String name: nam) {
	if(s.add(name)==false)
		System.out.println("Duplicated name :"+name);
}
//removed duplicates and altered origianl list

}
	
}
