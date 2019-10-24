package com.housegap.lab.eng.datastructure;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		TwoDimensionArray twoDimensionArray = new TwoDimensionArray();
		twoDimensionArray.simpleArray();
		twoDimensionArray.simpleArrayDiagonal();
	}
	
	private void simpleArray() {
		System.out.println("\nsimpleArray");
		int[][] data = new int [3][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 5;
		
		data[1][0] = 5;
		data[1][1] = 8;
		data[1][2] = 12;
		
		data[2][0] = 0;
		data[2][1] = 0;
		data[2][2] = 0;
		
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(data[i][j] + "\t");
//			}
//			System.out.println("\n");
//		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	private void simpleArrayDiagonal() {
		System.out.println("\nsimpleArray");
		int[][] data = new int [3][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 5;
		
		data[1][0] = 5;
		data[1][1] = 8;
		data[1][2] = 12;
		
		data[2][0] = 0;
		data[2][1] = 0;
		data[2][2] = 0;
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(data[i][j]);
				}
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
	

}
