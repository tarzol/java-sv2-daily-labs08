package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int numberOfRandoms, int minValue, int maxValue) {
        //véletlenszámok generálása
        Random random = new Random();
        for (int i = 0; i < numberOfRandoms; i++) {
            numbers.add(random.nextInt(minValue, maxValue + 1));
        }
    }

    public double calculateAvg() {
        //numberofRandoms-ban levők átlagának számítása
        double avg = 0;
        for ( Integer item: numbers ) {
            avg += item;
        }
        return avg/numbers.size();
    }

    public List<Integer> closeToAverage(int value) {
        //azon elemek listába rakása, amelyek az átlagtól max. "value"-val térnek el
        List<Integer> result = new ArrayList<>();
        double avg = calculateAvg();

        for (Integer item : numbers) {
            if ( Math.abs(item-avg) < value ) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //NumberSequence numberSequence = new NumberSequence(Arrays.asList(2, 5, 9, 4, 7));
        //List<Integer> numbersNearAverage = numberSequence.closeToAverage(4);
        //System.out.println(numbersNearAverage);

        NumberSequence numberSequence1 = new NumberSequence(8, 3, 6);
        List<Integer> numbersNearAverage1 = numberSequence1.closeToAverage(2);
        System.out.println(numbersNearAverage1);
    }
}
