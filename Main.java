/*
	Christopher Pena
	March 2, 2025
	Purpose: A Human Resources Project
	Sources: https://www.geeksforgeeks.org/overriding-equals-method-in-java/
*/

// Human Resources

/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
Composition.

Q2: Color and Red are related
by which, Inheritance or Composition?
Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
Composition

*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{		
		System.out.println();
		
		Person test = new Person("Jesus Christ", 155, 90); // creates Jesus Christ
		System.out.println("Test: " + test); // test print
		
		PersonOrderedSet orderedSet = new PersonOrderedSet(); // creates ordered set
		PersonImperialSet impSet = new PersonImperialSet(); // creates imperial set
		
		orderedSet.add(test); // sets Jesus Christ, but in order
		impSet.add(test) // sets Jesus Christ, but from the empire
		
		try
		{
			File doc = new File("hr.txt");
			Scanner fileReader = new Scanner(doc); // looks for hr.txt
			
			if (fileReader.hasNextLine()) // skips header
			{
				fileReader.nextLine();
			}
			
			while (fileReader.hasNext())
			{
				String name = fileReader.next(); // defines variables
				int height = fileReader.nextInt();
				int weight = fileReader.nextInt();
				
				Person person = new Person(name, height, weight); // creates person based off text
				personSet.add(person);
			}
			fileReader.close();
		}
		catch (IOException f)
		{
			f.printStackTrace();
			System.out.println(f);
			System.exit(1);
		}
		
		System.out.println("\nData from PersonSet: "); // prints dataset
		System.out.println(personSet);
	}
}
