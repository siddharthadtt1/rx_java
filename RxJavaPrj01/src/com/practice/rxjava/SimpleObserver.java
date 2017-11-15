package com.practice.rxjava;

import rx.Observer;

public class SimpleObserver implements Observer<String> {

	@Override
	public void onCompleted() {
		System.out.println("completed ...");
	}

	@Override
	public void onError(Throwable arg0) {
		System.out.println("error ...");
	}

	@Override
	public void onNext(String string) {
		System.out.println(string);
	}

}
