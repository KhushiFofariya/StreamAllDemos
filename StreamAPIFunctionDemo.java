package StreamAPIDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class StreamAPIFunctionDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Nashik","","Bangalore","","Chennai","Mumbai","Pune");
		System.out.println("List of Citites is:"+strList);
		
		//retrieve the stream
		Stream<String> stream = strList.stream();
		
		//counting the empty strings
		long count = StreamFunctions.countEmptyStrings(stream);
		System.out.printf("List %s has %d empty strings \n",strList,count);
		System.out.println("List " + strList+" has "+count+" empty strings");
		
		System.out.println("\n");
		//counting String with length more than 8*
		
		count = StreamFunctions.countStrings(strList.stream(),8);
		System.out.printf("List %s has %d strings of length more than 8\n"+strList,count);
		
		//remove all empty String from list*
		List<String> filteredList = StreamFunctions.nonEmptyStringList(strList.stream());
		System.out.printf("Original List:%s,List without Empty Strings:%s\n",strList,filteredList);
		
		//String with length more than 6
		filteredList = StreamFunctions.getStrings(strList.stream(),6);
		System.out.printf("Original List:%s,Cities length more than 6:%s %n",strList,filteredList);
		
		List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
		//retrieve the stream
		Stream<Integer> stream1 = numbers.stream();
		
		//List of square of all distinct numbers
		List<Integer> filteredNumberList = StreamFunctions.getSquareList(stream1);
		System.out.println("Original List:%s,Square Without duplicates:%s %n",numbers,filterNumberList);
		
		//Get count,min,max,sum and avg for numbers
		StreamFunctions.showStatistics(numbers.stream());
		
		
		
		
		
		
		
	}

}
