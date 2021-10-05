package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> level1Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create Object of questionList class and a pass a question along with question and answer
        final QuestionsList question1 = new QuestionsList("5 - 2  = ?" , "3" , "4" , "6" , "5" , "3" , "");
        final QuestionsList question2 = new QuestionsList("7 - 6 = ?" , "2" , "3" , "1" , "5" , "1" , "");
        final QuestionsList question3 = new QuestionsList("3 - 2 = ?" , "8" , "6" , "0" , "1" , "1" , "");
        final QuestionsList question4 = new QuestionsList("7 - 4 = ?" , "3" , "4" , "5" , "6" , "3" , "");
        final QuestionsList question5 = new QuestionsList("5 - 4 = ?" , "1" , "0" , "2" , "3" , "1" , "");
        final QuestionsList question6 = new QuestionsList("9 - 6 = ?" , "3" , "4" , "1" , "5" , "3" , "");
        final QuestionsList question7 = new QuestionsList("8 - 3 = ?" , "8" , "6" , "5" , "2" , "5" , "");
        final QuestionsList question8 = new QuestionsList("3 - 1 = ?" , "2" , "3" , "0" , "4" , "2" , "");
        final QuestionsList question9 = new QuestionsList("8 - 4 = ?" , "3" , "5" , "6" , "4" , "4" , "");
        final QuestionsList question10 = new QuestionsList("9 - 2 = ?" , "4" , "2" , "3" , "7" , "7" , "");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> level2Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("35 - 21  = ?" , "22" , "16" , "12" , "14" , "14" , "");
        final QuestionsList question2 = new QuestionsList("19 - 11 = ?" , "6" , "8" , "12" , "11" , "8" , "");
        final QuestionsList question3 = new QuestionsList("42 - 27 = ?" , "13" , "15" , "19" , "21" , "15" , "");
        final QuestionsList question4 = new QuestionsList("57 - 23 = ?" , "32" , "24" , "34" , "28" , "34" , "");
        final QuestionsList question5 = new QuestionsList("65 - 25 = ?" , "40" , "50" , "30" , "60" , "40" , "");
        final QuestionsList question6 = new QuestionsList("70 - 43 = ?" , "31" , "14" , "27" , "35" , "27" , "");
        final QuestionsList question7 = new QuestionsList("91 - 56 = ?" , "34" , "35" , "33" , "32" , "35" , "");
        final QuestionsList question8 = new QuestionsList("76 - 19 = ?" , "62" , "53" , "60" , "57" , "57" , "");
        final QuestionsList question9 = new QuestionsList("99 - 66 = ?" , "33" , "25" , "36" , "31" , "33" , "");
        final QuestionsList question10 = new QuestionsList("97 - 49 = ?" , "41" , "52" , "48" , "45" , "48" , "");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> level3Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("124 - 35  = ?" , "87" , "79" , "89" , "83" , "89" , "");
        final QuestionsList question2 = new QuestionsList("111 - 32 = ?" , "75" , "81" , "67" , "79" , "79" , "");
        final QuestionsList question3 = new QuestionsList("174 - 67 = ?" , "111" , "107" , "97" , "117" , "107" , "");
        final QuestionsList question4 = new QuestionsList("7 - 4 = ?" , "3" , "4" , "5" , "6" , "3" , "");
        final QuestionsList question5 = new QuestionsList("5 - 4 = ?" , "1" , "0" , "2" , "3" , "1" , "");
        final QuestionsList question6 = new QuestionsList("9 - 6 = ?" , "3" , "4" , "1" , "5" , "3" , "");
        final QuestionsList question7 = new QuestionsList("8 - 3 = ?" , "8" , "6" , "5" , "2" , "5" , "");
        final QuestionsList question8 = new QuestionsList("3 - 1 = ?" , "2" , "3" , "0" , "4" , "2" , "");
        final QuestionsList question9 = new QuestionsList("8 - 4 = ?" , "3" , "5" , "6" , "4" , "4" , "");
        final QuestionsList question10 = new QuestionsList("9 - 2 = ?" , "4" , "2" , "3" , "7" , "7" , "");

        //add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }


    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Level 01":
                return level1Questions();
            case "Level 02":
                return level2Questions();
            default:
                return level3Questions();
        }
    }


}
