package Chapter11.Task22;

import java.util.Objects;

class StringCount implements Comparable<StringCount> {
    private String word;
    private int count;

    StringCount(String word) {
        this.word = word;
        count = 1;
    }

    String getWord() {
        return word;
    }

    void addCount() {
        count++;
    }

    @Override
    public int compareTo(StringCount other) {
        return String.CASE_INSENSITIVE_ORDER.compare(word, other.word);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        StringCount other = (StringCount) otherObject;
        return Objects.equals(word, other.word);
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return word + "=" + count;
    }
}