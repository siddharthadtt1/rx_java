package com.practice.rxjava.withreactivejava;

import rx.Observer;

public class SimpleObserver implements Observer<AVariable> {
	@Override
	public void onCompleted() {
		System.out.println("Added Variables : " + Driver.avList.stream().mapToDouble(x -> x.getVarValue()).sum());
		System.out.println(" ------------------------------------------ ");
	}

	@Override
	public void onError(Throwable arg0) {
		System.out.println("error...");
	}

	@Override
	public void onNext(AVariable aVariable) {
		System.out.println(aVariable.getVarName() + ": " + aVariable.getVarValue());
	}
}
