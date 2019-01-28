package net.ukr.andy777;

/*
 Lesson05.1
 Создайте сто потоков, которые будут вычислять факториал числа, равного номеру этого потока, 
 и выводить результат на экран.
 */

public class Main {
	public static void main(String[] args) {
		Thread[] threads=new Thread[100];
		for (int i = 0; i < 100; i++) {
			threads[i] = new Thread(new FactorialThread(i+1),i+1+"-thread");
			threads[i].start();
		}
		System.out.println(Thread.currentThread().getName() + " is stop");
	}
}
