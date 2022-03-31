package com.generics;

public class Maximum <T extends Comparable<T>>{
	T first;
	T second;
	T third;
	T fourth;
	T fifth;
	public Maximum(T first, T second, T third, T fourth, T fifth) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
	}

	public <T extends Comparable<T>> T findMax(T first, T second, T third, T fourth, T fifth) {
		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0 && first.compareTo(fourth) >= 0 && first.compareTo(fifth) >= 0) {
			System.out.println("First Element is Largest");
			return first;
		}

		else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0 && second.compareTo(fourth) >= 0 && second.compareTo(fifth) >= 0) {
			System.out.println("Second Element is Largest");
			return second;
		}

		else if (third.compareTo(first) >= 0 && third.compareTo(second) >= 0 && third.compareTo(fourth) >= 0 && third.compareTo(fifth) >= 0) {

		}

		else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println("Second Element is Largest");
		}

		else {

			System.out.println("Third Element is Largest");
			return third;
		}

		if (fourth.compareTo(first) >= 0 && fourth.compareTo(second) >= 0 && fourth.compareTo(third) >= 0 && fourth.compareTo(fifth) >= 0) {
			System.out.println("Fourth Element is Largest");
			return fourth;
		}

		else {
			System.out.println("Fifth Element is Largest");
			return fifth;
		}
	}

	public void findMax() {

		findMax(this.first, this.second, this.third, this.fourth, this.fifth);

	}


	public Maximum(T first, T second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;

	}
}
