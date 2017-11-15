package com.practice.rxjava.withreactivejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rx.Observable;

public class Driver {

	public static List<AVariable> avList = Collections.synchronizedList(new ArrayList<AVariable>());
	
	public static void main(String[] args) throws IOException {
		
		Observable<AVariable> observable = Observable.from(avList);
		SimpleObserver simpleObserver = new SimpleObserver();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String varName = null;
		Double varValue = 0.0;
		AVariable aVariable = null;
		while (true) {
			System.out.println("------- RX Java example [Change is propagated] --------");
			System.out.println();
			System.out.println("Enter variable name : ");
			varName = bufferedReader.readLine();
			if (varName.equalsIgnoreCase("exit"))
				break;
			System.out.println("Enter variable value : ");
			varValue = Double.valueOf(bufferedReader.readLine());
			aVariable = new AVariable(varName, varValue);
			
			// if (!avList.contains(aVariable))
			// avList.add(aVariable);
			
			if(avList.contains(aVariable)) avList.get(avList.indexOf(aVariable)).setVarValue(aVariable.getVarValue());
			else avList.add(aVariable);
			
			observable.subscribe(simpleObserver);
			
			//avList.stream().map(x -> x.getVarName() + " : " + x.getVarValue()).forEach(System.out::println);
			//System.out.println("Added aVariable sum : " + avList.stream().mapToDouble(x -> x.getVarValue()).sum());
		}

	}

}
