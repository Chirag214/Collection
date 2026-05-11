import java.util.*;
class CountWord
{
	public static void main(String ar[])
	{
		String st = "My java program java My is is";
		String str[] = st.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String i : str)
		{
			map.put(i,map.getOrDefault(i,0)+1);
		}
		System.out.println(map);
	}	
}