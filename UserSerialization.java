/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farahtahir_bscs5a_123030;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*Serialization and Deseraialization code for users.*/
public class UserSerialization implements Serializable{

	public static ArrayList<User> users = new ArrayList<User>(30); //new array of 30 users
	public static String loggedInUserType; //type of user

	public static void save_list() { //save function
		
		
		File file = new File("user_data.ser");  //creates new serial file for storing objects
		 
		try {

			file.createNewFile(); //new file if not exists
			FileOutputStream fout = new FileOutputStream(file); //stream to write on file
			ObjectOutputStream obj_fout = new ObjectOutputStream(fout); //stream to write an object
			System.out.println("Size oflist while saving " + users.size()); //println for prompt
			obj_fout.writeObject(users); //write object to stream
			obj_fout.flush();
			obj_fout.close();
			fout.close(); //close stream after flushing

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static boolean add_user(String username, String password, String userType) {
		try {
			System.out.println(userType + " added user to list"); //prompt
			
			users.add(new User(username, password, userType)); //adds new object of users to th list
			UserSerialization.save_list(); //saves the object to the list
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean authenticate(String username, String password) { //to check if username and password exist upon login

		for (User i : users) { //check loop
                        System.out.println("Checking UserName and Password"); //prompt
			if (i.username.equals(username) && i.password.equals(password)) { //comparison
				loggedInUserType = (String) i.user_type; //checks type.
				System.out.println(i.user_type); //prints type
                                return true; //returns true
			}
		}
                return false;
	}

	@SuppressWarnings("unchecked")
	public static void load_list() { //loads the objects. DeSerialization 
		try {
			FileInputStream fin = new FileInputStream(new File("user_data.ser")); //create new file stream
			ObjectInputStream obj_fin = new ObjectInputStream(fin); 
			users = new ArrayList<>();  //declare new array of users
			users =  (ArrayList<User>) obj_fin.readObject(); //store the objects fron serial file to arrae 
			System.out.println("Size oflist after retriving " + users.size()); //prompt
			obj_fin.close(); 
			fin.close(); //close streams

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}   

