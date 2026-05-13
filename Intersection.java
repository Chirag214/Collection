import java.util.*;
class Intersection
{
	public static void main(String ar [])
	{
	    ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(3);
		al2.add(4);
		al2.add(5);
		al2.add(6);
		
		ArrayList<Integer> neww = new ArrayList<Integer>();
		for(int i : al)
		{
			if(al2.contains(i))
			{
				neww.add(i);
			}
		}
		for(int i : neww)
		{
		System.out.println(i);
			
		}
    }
}