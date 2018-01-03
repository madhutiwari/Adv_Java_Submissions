import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class insert_vector
{

	// public static void printvec(Vector v)
	// {
	// 	for(int i = 0 ; i< v.capacity() ; i++)
	// 		System.out.print(v[i]);
	//     System.out.println();
	// }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Vector<String> vec = new Vector<String>();
		vec.add("t");
		vec.add("e");
		vec.add("k");
		vec.add("a");
		vec.add("r");
		vec.add("c");
		vec.add("h");

		System.out.println("Vector is " + vec);

		System.out.println("Insert Z at 3rd position");

		for(int i = 0 ; i< n;i++)
		{
			vec.add(3+i,"Z");
		}

		System.out.println("Vector is " + vec);

		System.out.println("Delete n char from 6th position");

		for(int i = 0 ; i< n; i++)
		{

			vec.remove(6);
		}

		System.out.println("Vector is " + vec);

	}

}