package com.learnjava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringReplicationRemove {

	public static void main(String[] args) {

		System.out.println("Enter your string below");
		try (Scanner input = new Scanner(System.in)) {
			removeAndPrintReplicatedChars(input.nextLine());
		}

	}

	public static void removeAndPrintReplicatedChars(String input) {
		// Map to store character frequencies
		Map<Character, Integer> charFreqMap = new LinkedHashMap<>();

		// Count the frequency of each character
		for (char c : input.toCharArray()) {
			charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("After removal of replicating characters");
		charFreqMap.entrySet().stream().filter(e -> e.getValue() == 1).forEach(e -> System.out.print(e.getKey()));
	}

}
