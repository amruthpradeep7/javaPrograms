package org.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZerosAtTheEnd {

    public static void main(String[] args) {


        List<Integer> arr1 = Arrays.asList(1, 2, 0, 9, 6, 0, 7, 0, 4, 0);

        List<Integer> result = Stream.concat(
                arr1.stream().filter(x -> x != 0),
                arr1.stream().filter(x -> x == 0)).collect(Collectors.toList());

        System.out.println(result);

    }
}
