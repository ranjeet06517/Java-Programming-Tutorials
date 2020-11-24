package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{0,1,1},
						{1,1,2},
						{1,1,1}};
		int dayCount =0;
		int row =3;
		int cow =3;
		Queue<Orange> rotOrange = new LinkedList<>();
		for(int i =0;i<cow;i++) {
			for(int j=0;j<row;j++) {
				if(arr[i][j]==2) {
					Orange orange = new Orange(i, j);
					rotOrange.add(orange);
				}
				
			}
		}
		//rot orange in queue
		Orange delimiter = new Orange(-1, -1);
		rotOrange.add(delimiter);
		
		while (!rotOrange.isEmpty()) {
			
			Orange orange = rotOrange.remove();
			
			boolean rotHappen = false;
			while(orange.x!=-1) {
				
				//check top adjacent 
				if((orange.x-1)>-1 && arr[orange.x-1][orange.y] ==1) {
					arr[orange.x-1][orange.y] =2;
					Orange tmp = new Orange(orange.x-1,orange.y);
					rotOrange.add(tmp);
					rotHappen = true;
				}
				//check bottom adjacent 
				if((orange.x+1)<cow && arr[orange.x+1][orange.y] ==1) {
					arr[orange.x+1][orange.y] =2;
					Orange tmp = new Orange(orange.x+1,orange.y);
					rotOrange.add(tmp);
					rotHappen = true;
				}
				//check left adjacent 
				if((orange.y-1)>-1 && arr[orange.x][orange.y-1] ==1) {
					arr[orange.x][orange.y-1] =2;
					Orange tmp = new Orange(orange.x,orange.y-1);
					rotOrange.add(tmp);
					rotHappen = true;
				}
				//check right adjacent 
				if((orange.y+1)<row && arr[orange.x][orange.y+1] ==1) {
					arr[orange.x][orange.y+1] =2;
					Orange tmp = new Orange(orange.x,orange.y+1);
					rotOrange.add(tmp);
					rotHappen = true;
				}
				orange = rotOrange.remove();
				
			}
			if(rotHappen) {
				dayCount++;
				Orange tmpDelimiter = new Orange(-1, -1);
				rotOrange.add(tmpDelimiter);
				print(arr, dayCount, row, cow);
			}
			
			
		}
		
		//check all the orange are rotten or not
		boolean allOrangeRotten = true;
		for(int i =0;i<cow;i++) {
			for(int j=0;j<row;j++) {
				
				if(arr[i][j]==1) {
					allOrangeRotten = false;
				}
			}
		}
		
		if(allOrangeRotten) {
			System.out.println("day take to rot all orange: "+dayCount);
		}else {
			System.out.println("all orange are not rotten ");
		}
		
		
		}
	
	static class Orange{
		int x=-1;int y=-1;
		public Orange(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static void print(int[][] arr, int dayCount,int row, int cow) {
		
		System.out.println("###day: "+dayCount);
		for(int i =0;i<cow;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}


}
