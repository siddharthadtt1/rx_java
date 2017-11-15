package com.practice.rxjava.withoutrxjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) throws IOException {
		List<AVariable> avList = Collections.synchronizedList(new ArrayList<AVariable>());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String varName = null;
		Double varValue = 0.0;
		AVariable aVariable = null;
		while (true) {
			System.out.println("------- Non reactive example [Change is not propagated] --------");
			System.out.println();
			System.out.println("Enter variable name : ");
			varName = bufferedReader.readLine();
			if (varName.equalsIgnoreCase("exit"))
				break;
			System.out.println("Enter variable value : ");
			varValue = Double.valueOf(bufferedReader.readLine());
			aVariable = new AVariable(varName, varValue);
			if (!avList.contains(aVariable))
				avList.add(aVariable);
			System.out.println("Added aVariable sum : " + avList.stream().mapToDouble(x -> x.getVarValue()).sum());
		}

	}

}
