package collections;

import java.util.Map.*;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<String,Double> map=new TreeMap<String,Double>();
		map.put("Sachin", 24000.0);
		map.put("Sourav", 74000.0);
		map.put("Sachin", 24000.0);
		map.put("Dravid", 64000.0);
		Set<Entry<String, Double>> set=map.entrySet();
		Iterator<Entry<String, Double>> i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
			System.out.println();
			double balance=((Double)map.get("Sachin")).doubleValue();
			map.put("Sachin", (double)(balance+1000));
			System.out.println("Sachin's new record is :"+map.get("Sachin"));
			
	}

}
