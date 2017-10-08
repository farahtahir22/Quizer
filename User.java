/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farahtahir_bscs5a_123030;

import java.io.Serializable;

public class User implements Serializable {

	String username, password;
	String user_type;
        
        User () { //default constructor
	}
	
	User (String username, String password,String user_type) throws Exception { //constructor
		this.username = new String(username);
		this.password = new String(password);
		if (user_type.equals("student") || user_type.equals("teacher")) //checks user type for further UI prcessing
		this.user_type = user_type;
		else throw new Exception("Invalid User Type");
	}

        //getters and setters.
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
        
       

}