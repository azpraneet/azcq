package P2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Even {
	    public static void main(String[] args) {
	        List<Integer> even = Arrays.asList(1, 2, 3, 4, 5);
	        List<Integer> a = even.stream()
	                .filter(s -> s % 2 == 0)
	                .collect(Collectors.toList());

	        System.out.println(a);
	    }
	}
	

