package org.example.learn.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MyStreams {

    public static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumStream(List<Integer> list) {
        return list.stream().filter(x -> x > 10).mapToInt(i -> i).sum();
    }

    public static void createJavaStreams() {
        // cannot be primitive : new int[]{1,2,3}
        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4});

        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < 10; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<String> stream1 = Stream.generate(() -> {return "abc";});
        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);

        LongStream is = Arrays.stream(new long[]{1,2,3,4});
        IntStream is2 = "abc".chars();
    }

    public static void convertStreamToCollection() {
        Stream<Integer> intStream = Stream.of(1,2,3,4,5);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList);

        intStream = Stream.of(1,2,3,4);
        Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i +10));
        System.out.println(intMap);

        Stream<Integer> intStream2 = Stream.of(1,2,3,4,5);
        Integer[] intArray = intStream2.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));
    }

    public static void intermediateOperationFilter() {
        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<100;i++) myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90);
        System.out.println("High Nums greater than 90=");
        highNums.forEach(p -> System.out.println(p+ " "));
    }

    public static void intermediateOperationMap() {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(x -> x.toUpperCase()).collect(Collectors.toList()));
    }

    public static void intermediateOperationSorted() {
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123344");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted);

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123344");
        List<String> naturalSorted = names3.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(naturalSorted);
    }

    public static void intermediateOperationsFlatMap() {
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("Davi", "Lisa"),
                Arrays.asList("Amit"));

        Stream<String> flatStream = namesOriginalList.flatMap(namesList -> namesList.stream());
        flatStream.forEach(System.out::println);
    }

    public static void terminalOperationsReduce() {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> intOptional = numbers.reduce((i,j) -> i*j);
        if(intOptional.isPresent()) System.out.println("Multiplication = " + intOptional.get());
    }

    public static void terminalOperationsCount() {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        System.out.println(numbers.count());
    }

    public static void terminalOperationsForEach() {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        numbers.forEach(t -> System.out.print(t + ","));
    }

    public static void terminalOperationsMatch() {
        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("String contains 4? "+numbers3.anyMatch(x -> x == 4));

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains all elements less than 10? " + numbers4.allMatch(i -> i < 10));

        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println("Stream does not contain 10? " + numbers5.noneMatch( i -> i == 10));
    }

    public static void terminalOperationsFindFirst() {
        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa", "Doug");
        // findFirst is short-circuiting operator.
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent()) {
            System.out.println("First Name starting with D="+firstNameWithD.get());
        }
    }
}
