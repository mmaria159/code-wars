package com.mariamacovei.kata8kyu;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class CountOfPositives {
    public static void main(String[] args) {
        System.out.println(countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    public static int[] countPositivesSumNegatives1(int[] input) {
        return Objects.nonNull(input) && input.length != 0 ? new int[]{(int) IntStream.of(input).filter(i -> i > 0).count(), IntStream.of(input).filter(i -> i < 0).sum()} : new int[]{};
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (isInvalidInput(input)) return defaultImpl();
        Predicate<Integer> positiveAndNegative = n -> n > 0;
        Map<Boolean, List<Integer>> partitions = stream(input)
                .boxed()
                .collect(toList())
                .stream()
                .collect(partitioningBy(positiveAndNegative));
        List<Integer> positives = partitions.get(TRUE);
        List<Integer> negatives = partitions.get(FALSE);
        return new int[]{count(positives), sum(negatives)};
    }

    private static boolean isInvalidInput(int[] input) {
        return Objects.isNull(input) || input.length == 0;
    }

    private static int[] defaultImpl() {
        return new int[]{};
    }

    private static Integer sum(List<Integer> negative) {
        return negative.stream().reduce(Integer::sum).orElse(0);
    }

    private static int count(List<Integer> positive) {
        return positive.size();
    }
}
