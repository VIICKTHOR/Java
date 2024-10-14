package mainPack;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static ArrayList<Position> cordenada = new ArrayList<Position>();
	public int oi;
	
	
	public static void main(String[] args) {
		
		Focker f = new Focker();
		
		cordenada.add(new Position(2,4));
		cordenada.add(new Position(6,9));
		cordenada.add(new Position(2,6));
		cordenada.add(new Position(9,4));
		
		int a = cordenada.get(0).x;
		
		cordenada.get(0).y=9;
		
		System.out.println(a);
		
		for(Position xy : cordenada) {
			
			System.out.println(xy.y);
		}
		
		for(int i =0; i<cordenada.size();i++) {
			
			System.out.println(cordenada.get(i).x+" "+" "+cordenada.get(i).y);
		}
		cordenada.remove(3);
		
		int last = cordenada.size()-1;
		
		System.out.println(cordenada.get(last).x);
		
		
		
		f.remover(cordenada);
		
		int index=0;
		for(int i =0; i<100;i++) {
			
			System.out.println(cordenada.get(index).x+" "+" "+cordenada.get(index).y);
			
			index = (index+1) %cordenada.size();
		}
		
		
		Position.porra();
	}
}
