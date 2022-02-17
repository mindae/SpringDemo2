package com.mindae.sec01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.github.javafaker.Faker;

public class FakerDemo {
	public static void main(String[] args) {
//		for(int i=0;i<10;i++)
//			System.out.println(Faker.instance().name().fullName());

		
		byte [] bytes = new byte[50];
		int size = 0;
		File file=new File("fileWriter3.txt");
		try(FileOutputStream fos=new FileOutputStream(file);FileInputStream fis=new FileInputStream(file);){
			fos.write("Howdy Boys!".getBytes("UTF-8"));
			
			size = fis.read(bytes);
			for(int i=0;i<size;i++)
				System.out.println((char)bytes[i]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
