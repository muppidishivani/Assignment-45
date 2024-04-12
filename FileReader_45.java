package com.web.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_45 {

	
	 public static void main(String[] args) {
	       
	        String fp = "test.txt";

	        try {
	           
	            FileReader fr = new FileReader("C:\\Users\\ramya\\OneDrive\\Desktop\\test. txt");

	           
	            BufferedReader br = new BufferedReader(fr);

	            
	            String line;
	            while ((line = br. readLine()) != null) {
	                System.out.println(line);
	            }

	            
	            br.close();
	            fr.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading from the file: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}

