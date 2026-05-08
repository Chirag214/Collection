import java.util.*;
class CountNumber
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
		
		int max = al.get(0);
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int num : al)
		{
			if(hmap.containsKey(num))
			{
				int count = hmap.get(num);
				hmap.put(num,count+1);
			}
			else
			{
				hmap.put(num,1);
			}
		}
		System.out.println(hmap);
		
	}
}