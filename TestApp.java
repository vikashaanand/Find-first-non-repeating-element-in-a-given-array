package com.interview.prep.q01;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TestApp {
	public static void main(String[] args) {

		firstNonRepetiveElementInArray();

	}

	private static void firstNonRepetiveElementInArray() {

		int[] numbers = {-1, 2, -1, 3, 0};

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int i : numbers) {

			if (set.contains(i)) {
				set.remove(i);
			}else {
				set.add(i);
			}
		}
		
		System.out.println(set.toArray()[0]);

//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//		for (int i : numbers) {
//			if (map.containsKey(i))
//				map.put(i, map.get(i) + 1);
//			else
//				map.put(i, 1);
//		}
//		
//		for (int i : numbers) {
//			if(map.get(i) == 1) {
//				System.out.println(i);
//				break;
//			}
//		}

	}
}
