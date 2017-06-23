package main;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.print.attribute.standard.JobOriginatingUserName;

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
		
		//return input.stream().reduce(0, Integer::sum);
		return input.stream().mapToInt(Integer::intValue).sum();
	}

	public static List<String> flattenToSingleCollection(List<List<String>> input) {
		
		return input.stream().flatMap(List::stream).collect(Collectors.toList());
	}

	public static String separateNamesByComma(List<Person> input) {
		return input.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
	}

	public static String findNameOfOldestPerson(List<Person> input) {
		
		return input.stream().max(Comparator.comparingInt(Person::getAge)).map(Person::getName).get();
	}

	public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
		return input.stream().filter(person -> person.getAge() < 18).map(Person::getName).collect(Collectors.toList());
	}

	public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
		return input.stream().mapToInt(Person::getAge).summaryStatistics();
	}

	public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
		
		return input.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 18));
	}

	public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
		
		return input.stream().collect(Collectors.groupingBy(Person::getCountry));
	}

}
