package com.mindae.sec01;

import java.util.stream.Stream;

import com.mindae.courseutil.Util;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
	public static void main(String[] args) {
		Mono<Integer> mono = Mono.just("ball")
								 .map(str->str.length())
								 .map(l->l/1);
//		mono.subscribe(
//				data->System.out.println(data),
//				err->System.out.println(err.getMessage()),
//				()->System.out.println("Task Completed!")
//		);
		
		mono.subscribe(
				Util.onNext(),
				Util.onError(),
				Util.onComplete()
		);
	}
	
	
}
