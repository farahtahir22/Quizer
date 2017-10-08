/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farahtahir_bscs5a_123030;

public class Ques_Ans { //class to create a question objects.with atrributs of question, its options, and the correct option
    public String question; 
    public String opt1, opt2, opt3, opt4;
    public String correctAnswer;

    public Ques_Ans(String question, String opt1, String opt2, String opt3, String opt4, String correctAnswer) { //condtructor
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.correctAnswer = correctAnswer;
    }
    
    //setters.
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    

    Ques_Ans() { //default contructor
    }
}
