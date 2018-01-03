import java.util.*;
import java.util.TreeMap;

class Student
{
	String name;
	int marks;
	int reg;

	Student(String a, int b, int c)
	{
		this.name = a;
		this.marks = b;
		this.reg = c;
	}
}

class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return b.marks - a.marks;
    }
}

public class ranks{

	public static void main(String[] args) {
		
		ArrayList<Student> ar = new ArrayList<Student>();
		Student a = new Student("Amit",100,1);
		Student b = new Student("Ravi",101,2);
		Student c = new Student("Rahul",102,3);
		Student d = new Student("Rohit",103,4);
		Student e = new Student("Ajay",99,5);
		ar.add(a);
		ar.add(b);
		ar.add(c);
		ar.add(d);
		ar.add(e);


		System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
        {
        	Student x = ar.get(i);
            System.out.println(x.name);
        }
 
        Collections.sort(ar, new Sortbyroll());
 
        System.out.println("\nSorted by Marks");
        for (int i=0; i<3; i++)
        {
        	Student x = ar.get(i);
            System.out.println(i+1+" rank - "+x.name);
        }

		
	}

}
