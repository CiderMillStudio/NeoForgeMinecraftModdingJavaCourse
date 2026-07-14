package net;

/* EXERCISE 3b: Trivia Game with Classes
 * Let's create a Trivia Game! Get a few fun facts ready, because while one game should be 3-5 questions long,
 * they should always be randomly selected from a pool of ~15 questions. You can also just google for trivia!
 *
 * Think about what structure makes sense with classes. It's not always necessary to use Interfaces and Abstract
 * Classes! Think what truly makes sense!
 *
 * Sometimes it's best to start with a small plan than plan TOO much. Here I suggest you use a maximum of
 * 30 minutes to plan out the structure and then simply start programming. Otherwise, you might overplan!
 *
 * Don't forget that Errors are your friend, not your foe! They usually tell you what needs fixing so your
 * game can work in the end!
 *
 * Remember String comparisons and reading in of answers with the scanner and NextLine!
 *
 * Estimated Time: 120-180 minutes
 *
 */

import net.wady.TriviaGame;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> questionPool = new HashMap<>();

        questionPool.put("What is the capital of France?", "Paris");
        questionPool.put("How many quarters in a dollar?", "4");
        questionPool.put("What is the capital of Maine?", "Augusta");
        questionPool.put("What is the fourth planet?", "Mars");
        questionPool.put("What is the third planet?", "Earth");
        questionPool.put("What is the capital of Latvia?", "Riga");


        TriviaGame triviaGame = new TriviaGame(questionPool, 6);

        for (int i = 0; i < triviaGame.numOfQuestions; i++) {
            triviaGame.fieldQuestion();
        }






    }

}
