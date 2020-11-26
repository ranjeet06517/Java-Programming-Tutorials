package com.test;

public class RotateImage {
	
	
	public static void main(String[] str) {
		
		int[][] matrix = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int [][] outMatrix = {{0,0,0},
				{0,0,0},
				{0,0,0}};
		for(int i=0;i<matrix.length;i++) {
			for(int j =0;j<matrix.length;j++) {
				outMatrix[i][j]=matrix[matrix.length-1-j][i];
			}
		
		}
		for(int i=0;i<outMatrix.length;i++) {
			for(int j =0;j<outMatrix.length;j++) {
				System.out.print(outMatrix[i][j]);
			}
			System.out.println("");
		}
	}

}
