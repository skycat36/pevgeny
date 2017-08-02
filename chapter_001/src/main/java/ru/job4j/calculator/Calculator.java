
package ru.job4j.calculator;

public class Calculator {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
    
    public void sub(double first, double second) {
        this.result = first - second;
    }

    public void mul(double first, double second) {
        this.result = first * second;
    }

    public void div(double first, double second) {
		if (second != 0) {
        	this.result = first / second; 
		}
		else { 
			this.result	= -1.0;
		}
    }	
	
    public double getResult() {
        return this.result;
    }
}