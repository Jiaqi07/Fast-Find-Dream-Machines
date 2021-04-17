package com.example.alansqrgamedm;

public class Item {

    private String question, answer;

    public Item(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
}
