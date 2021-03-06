package model;

/**
 * @author Alex Volochai
 */
public class Word {

    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }

}
