import java.util.*;
class ArrayListToHashSet
{
	public static void main(String ar[])
	{	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(1);
		al.add(4);
		al.add(6);
	
		HashSet<Integer> hs = new HashSet<Integer>(al);
		
		System.out.println(hs);
	}
}