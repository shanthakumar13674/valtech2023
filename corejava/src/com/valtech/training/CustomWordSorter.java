package com.valtech.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomWordSorter {

	private static class Word implements Comparable<Word> {
		private String actualWord;
		private int vowelCount;
		private int ratio;

		public Word(String word) {
			actualWord = word;
			for (int i = 0; i < word.length(); i++) {
				if (isVowel(i)) {
					vowelCount++;
				}
			}
			ratio = vowelCount * 1000 / word.length();
		}

		private boolean isVowel(int i) {
			return "aeiouAEIOU".contains("" + actualWord.charAt(i));
		}

		@Override
		public int compareTo(Word other) {
//			compare ratio...
			if (ratio != other.ratio) {
				return (other.ratio - ratio);
			}
//			ratio is same... Compare the index
//			if (actualWorld.length() != other.actualWorld.length())
//				return actualWorld.length() - other.actualWorld.length();
			int length = actualWord.length() > other.actualWord.length() ? other.actualWord.length()
					: actualWord.length();
			for (int i = 0; i < length; i++) {
				if (isVowel(i)) {
					return -1;
				}
				if (other.isVowel(i)) {
					return 1;
				}
			}
			return 0;
		}
	}

	public List<String> breakAndSort(String str) {
//		Split the Word
		List<String> segments = Arrays.asList(str.split(" "));
//		Count Vowels
//		Sort
		List<Word> words = segments.stream()
				.map(s -> new Word(s)).collect(Collectors.toList());
		Collections.sort(words);
		return words.stream().map(w -> w.actualWord).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		CustomWordSorter sorter = new CustomWordSorter();
		System.out.println(sorter.breakAndSort("Hello How are you doing"));
		System.out.println(sorter.breakAndSort("Hello How are you doing i am doing good"));
	}

}
