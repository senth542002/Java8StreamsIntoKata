package main;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Util {

	public static List<String> mapToUppercase(List<String> inputStringLst) {
		
		return inputStringLst.stream().map(String::toUpperCase).collect(Collectors.toList());
	}

	public static List<String> removeElementsWithMoreThanFourCharacters(List<String> input) {
		return input.stream().filter(x-> x.length()< 3).collect(Collectors.toList());
	}

	public static List<String> sortStrings(List<String> input) {
		return input.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	}

	public static List<Integer> sortIntegers(List<String> input) {
		return input.stream().map(Integer::valueOf).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	}

	public static List<Integer> sortIntegersDescending(List<String> input) {
		return input.stream().map(Integer::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	public static Integer sum(List<Integer> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> flattenToSingleCollection(List<List<String>> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String separateNamesByComma(List<Person> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String findNameOfOldestPerson(List<Person> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
		// TODO Auto-generated method stub
		return null;
	}

}
