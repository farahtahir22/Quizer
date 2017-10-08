/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farahtahir_bscs5a_123030;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class QuizSerialization implements Serializable { //serialization for quizzws
    public static ArrayList<Quiz> quizzes = new ArrayList<Quiz>(5); //to create max five quizzes
    
    public static void save_quiz() throws FileNotFoundException, IOException{ //save quiz to serial file
        File file = new File("quiz_data.ser"); //create/get new file
        try{ 
            file.createNewFile();  //create new file if it doesnt exist
            FileOutputStream fout = new FileOutputStream(file);		//create new steam
            ObjectOutputStream obj_fout = new ObjectOutputStream(fout); //create new stram for objects to store in serial file
            System.out.println("Size oflist while saving " + quizzes.size()); //prompt
            obj_fout.writeObject(quizzes); //writes object array to serial file
            obj_fout.flush();
            obj_fout.close(); //close all streams after flushing it 
	fout.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
	public static void load_quiz() {
		try {
			FileInputStream fin = new FileInputStream(new File("quiz_data.ser")); //create new input stream
			ObjectInputStream obj_fin = new ObjectInputStream(fin); //new object stream
			quizzes = new ArrayList<>(); //new array to store recieved objects
			quizzes =  (ArrayList<Quiz>) obj_fin.readObject(); //store recieved objects
			System.out.println("Size oflist after retriving " + quizzes.size()); //prompt
			obj_fin.close(); 
			fin.close(); //close all streams

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        
        public static boolean add_quiz() {//add quiz updates the original array of quizzes
		try {
			System.out.println("quiz added to list");  //prompt
			quizzes.add(new Quiz()); //new quiz
                        QuizSerialization.save_quiz(); //save the quiz in serial file
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
