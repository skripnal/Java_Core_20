package task;

import java.util.Scanner;

public class MyThread extends Thread {
	private Scanner scanner = new Scanner(System.in);
	private int[] fibonachi;

	@Override
	public void run() {
		System.out.print("Введіть кількість чисел Фібоначі: ");
		this.fibonachi = new int[scanner.nextInt()];
		if (this.fibonachi.length == 0) {
			
		} else if (this.fibonachi.length == 1) {
			this.fibonachi[0] = 1;
		} else {
			this.fibonachi[0] = 1;
			this.fibonachi[1] = 1;
			for (int i = 2; i < fibonachi.length; i++) {
				this.fibonachi[i] = this.fibonachi[i - 1] + this.fibonachi[i - 2];
			}
		}

		for (int i = 0; i < this.fibonachi.length; i++) {
			System.out.println(this.fibonachi[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class ApplicationMyTherad {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
