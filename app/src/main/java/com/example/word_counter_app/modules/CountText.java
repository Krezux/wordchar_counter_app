package com.example.word_counter_app.modules;

public class CountText {

    public static int getCharsCount(String phrase)
    {

        return phrase.length();
    }
    public static int getWordsCount(String phrase)
    {

        int wordsAmount = 0, amount;
        int stringLength = phrase.length();

        for (int i = 0 ; i < stringLength - 1; i++)
        {
            amount = i + 1;

            if (Character.isLetter(phrase.charAt(amount)) && amount == stringLength - 1 || Character.isLetter(phrase.charAt(i)) && phrase.charAt(amount) == ',' || Character.isLetter(phrase.charAt(i)) && phrase.charAt(amount) == '.' || Character.isLetter(phrase.charAt(i)) && phrase.charAt(amount) == ' ')
            {
                wordsAmount++;
            }
        }

        return wordsAmount;

    }

}
