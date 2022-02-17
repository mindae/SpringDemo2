package com.mindae.sec01;

import java.util.stream.Stream;

import reactor.core.publisher.Mono;

public class Lec01MonoJust {
	public static void main(String[] args) {
		Mono<Integer> just = Mono.just(1);
		just.subscribe(i->System.out.println(i));
	}
	
	
}
