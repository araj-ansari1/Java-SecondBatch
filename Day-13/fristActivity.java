package com.app;
import java.util.*;

public class fristActivity{
	public static void main(String args[]){
		Vector vector=new Vector();
		vector.add("First");
		vector.add("Second");
		vector.add("Third");
		vector.add("Fourth");
		vector.add("Fifth");
		
		for(int i=0; i<vector.size(); i++){
			System.out.println(i+" -----> "+vector.get(i));
		}
	}
}			