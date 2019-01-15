package Chapter21.Task34.generics.coffee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.List;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private static Random random = new Random();

    private Class[] types = new Class[]{Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private int size;


    private List<Factory<? extends Coffee>> factories = new ArrayList<>();

    {
        factories.add(Americano::new);
        factories.add(Breve::new);
        factories.add(Cappuccino::new);
        factories.add(Latte::new);
        factories.add(Mocha::new);
    }

    public CoffeeGenerator() {
        size = 0;
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        /*try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }*/
        int n = random.nextInt(factories.size());
        return factories.get(n).create();
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public Coffee next() {
                count++;
                return CoffeeGenerator.this.next();
            }
        };
    }
}
