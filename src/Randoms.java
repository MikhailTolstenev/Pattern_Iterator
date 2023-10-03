import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    Random random = new Random();
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }


    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {

                return true;
            }

            @Override
            public Integer next() {
                IntStream randomNumbers = random.ints(min, max + 1);
                Integer num = randomNumbers.findAny().getAsInt();


                return num;
            }
        };
    }
}



