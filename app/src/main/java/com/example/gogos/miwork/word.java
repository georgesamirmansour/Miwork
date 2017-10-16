package com.example.gogos.miwork;

/**
 * Created by gogos on 2017-10-16.
 */

public class word {
    private String englishWord;
    private String miWorkWord;

    public word(String englishWord, String miWorkWord) {
        this.englishWord = englishWord;
        this.miWorkWord = miWorkWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getMiWorkWord() {
        return miWorkWord;
    }

    public void setMiWorkWord(String miWorkWord) {
        this.miWorkWord = miWorkWord;
    }
}
