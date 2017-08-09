package ru.job4j.loop;

public class Counter {

/** 
* Функция считатет сумму четных элементов массива
 */

 public int add(int start, int finish) {
	int summa=0;
	for (; start <= finish; start++)	{
		if (start % 2 == 0)  {
			summa = start + summa;
		}
	}
	return summa;	
}

}