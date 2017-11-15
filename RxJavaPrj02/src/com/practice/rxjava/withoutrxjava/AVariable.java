package com.practice.rxjava.withoutrxjava;

public class AVariable {
	
	private String varName = null;
	private Double varValue = 0.0;
	
	public AVariable(String varName, Double varValue) {
		super();
		this.varName = varName;
		this.varValue = varValue;
	}
	public String getVarName() {
		return varName;
	}
	public void setVarName(String varName) {
		this.varName = varName;
	}
	public Double getVarValue() {
		return varValue;
	}
	public void setVarValue(Double varValue) {
		this.varValue = varValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((varName == null) ? 0 : varName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AVariable other = (AVariable) obj;
		if (varName == null) {
			if (other.varName != null)
				return false;
		} else if (!varName.equals(other.varName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AVariable [varName=" + varName + ", varValue=" + varValue + "]";
	}
}
