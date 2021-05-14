package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int[] arr = {1, 2, 3};

	int [][] matrix = new int[2][];
	matrix[0] = new int[3];
	matrix[1] = arr;

		int[] innerMaxtrix = matrix[matrix.length - 1];


		System.out.println(innerMaxtrix
				[innerMaxtrix.length - 1 ]
		);

    }
}
