package com.mindae.sec01;

import com.mindae.courseutil.Util;

import reactor.core.publisher.Mono;

public class L5MonoFromSupplier {
	public static void main(String[] args) {
//		Mono.just(getName()); //user only when u have data directly in hand
		Mono<String> name = Mono.fromSupplier(()->getName());
		name.subscribe(item->System.out.println(item),
				err->System.out.println(err.getMessage()),
				()->System.out.println());
	}
	
	private static String getName() {
		System.out.println("generating name...");
		return Util.faker().name().fullName();
	}
}
