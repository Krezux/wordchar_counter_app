package com.example.word_counter_app.modules;
import android.util.Log;

public class OptionSelect {

        public int HandleChoices(String choice,String uncountedText) // handler to handle spinner choices
        {
                switch (choice) {
                        case "Chars":
                                return CountText.getCharsCount(uncountedText);
                        case "Words":
                                return CountText.getWordsCount(uncountedText);
                }

                return 0;
        }
}
