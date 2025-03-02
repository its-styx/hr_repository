import java.util.ArrayList;

class PersonSet implements PersonList // Set implements List
{
	protected ArrayList<Person> people =  new ArrayList<>(); // creates a protected person array "people"
	
	// override add defined in PersonList
	@Override
	public void add(Person p)
	{
		if (!people.contains(p))
		{
			people.add(p);
		}
	}
	
	// override person constructor
	@Override
	public Person get(int index)
	{
		if (index >=0 && index < people.size())
		{
			return people.get(index);
		}
		return null;
	}
	
	// override toString
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		for (Person p : people)
		{
			builder.append(p.toString()).append("\n");
		}
		return builder.toString();
	}
}