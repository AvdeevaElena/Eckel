package Chapter16.Task12;

import Chapter21.Task34.generics.coffee.Generator;

public class CountingGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;

        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }

    public static class Double implements Generator<java.lang.Double> {
        private double value = 0.0;

        public java.lang.Double next() {
            double result = value;
            value += 1.0;
            return result;
        }
    }
}