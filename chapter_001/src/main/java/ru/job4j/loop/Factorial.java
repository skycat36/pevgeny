package ru.job4j.loop;

public class Factorial {

public int calc(int n) {
	int factorial=1;
	while (n > 0) {
		factorial *= n;
		n--;	
	}
	return factorial;	
}

}