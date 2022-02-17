package com.mindae.sec01;

import java.util.stream.Stream;

public class Lec01Streams {
	public static void main(String[] args) {
		Stream<Integer> mystream = Stream.of(1).map(i -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return i * 2;
		});
		
		System.out.println(mystream);
		mystream.forEach(System.out::println);
	}
	
	
}
