package net.wady;

import java.util.*;

public class TriviaGame {

    public HashMap<String, String> chosenQuestions = new HashMap<>();

    public int numOfQuestions = 0;

    public int questionCounter = 0;

    public int score = 0;

    public TriviaGame(HashMap<String, String> questionPool, int numOfQuestions) {

        getQuestions(questionPool, numOfQuestions);
        this.numOfQuestions = numOfQuestions;

    }

    public void getQuestions(HashMap<String, String> questionPool, int numOfQuestions) {

        Random random = new Random();

        while (chosenQuestions.size() < numOfQuestions) {
            int randomNumber = random.nextInt(0, questionPool.size());
            String question = questionPool.entrySet().stream().toList().get(randomNumber).getKey();
            String answer = questionPool.get(question); // returns the answer associated with that question

            questionPool.remove(question);

            chosenQuestions.put(question, answer);
        }

    }

    public void fieldQuestion() {
        questionCounter++;
        Random random = new Random();
        Scanner reader = new Scanner(System.in);

        int randomNum = random.nextInt(0, chosenQuestions.size());
        String fieldedQuestion = chosenQuestions.entrySet().stream().toList().get(randomNum).getKey();
        String answer = chosenQuestions.get(fieldedQuestion);

        System.out.println(fieldedQuestion);
        String givenAnswer = reader.nextLine().toLowerCase();
        if (givenAnswer.equalsIgnoreCase(answer)){
            System.out.println("CORRECT DING DING DING");
            score++;

        }
        else {
            System.out.println("INCORRECT...");
        }

        if (questionCounter < numOfQuestions) {
            System.out.println("Score is now " + score + " out of " + questionCounter);
            System.out.println("NEXT QUESTION >>>");
        }

        else {
            System.out.println("ALL DONE! FINAL SCORE: " + score + " out of " + numOfQuestions);
        }

        chosenQuestions.remove(fieldedQuestion);


    }






}
