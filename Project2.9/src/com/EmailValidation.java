package com;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();  
        emails.add("subhanishaik@gmail.com");  
        emails.add("subbushaik@gmail.com");  
        emails.add("1234subbu@gmail.com");  
        emails.add("6186subbu@gmail.com");  
        emails.add("subbu12345@gmail.com");  
        emails.add("subbushaik5555@gmail.com");  
        //Add invalid emails in list  
        emails.add("subbushaik");  
        emails.add("subhanishaik.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  

	}

