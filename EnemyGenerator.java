import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EnemyGenerator{
    private HashMap<String, Integer> enemies = new HashMap<String, Integer>();
	public EnemyGenerator(){
    	// HashMap<String, Integer> enemies = new HashMap<String, Integer>();
		// System.out.println("enemies: " + enemies);
		try{
			Scanner read = new Scanner(new File ("Enemies.txt"));
			while(read.hasNext()){
                String line = read.nextLine();
                String[] tokens = line.split(",");
				int i = Integer.valueOf(tokens[1]);
                enemies.put(tokens[0], i);
			}
		} catch (FileNotFoundException fnf){
			System.out.println("FNF");
		}
		System.out.println(enemies);
		
	}

	public String generateEnemy(int level){
		// Select random enemy
		int selection = (int)Math.floor(Math.random() * (enemies.size()-1+1) + 1);
		System.out.println(selection);
		
		return "ignore";
	}
	
	// public static void generateHash(){
 //    	HashMap<String, Integer> enemies = new HashMap<String, Integer>();
	// 	// System.out.println("enemies: " + enemies);
	// 	try{
	// 		Scanner read = new Scanner(new File ("Enemies.txt"));
	// 		while(read.hasNext()){
 //                String line = read.nextLine();
 //                String[] tokens = line.split(",");
	// 			int i = Integer.valueOf(tokens[1]);
 //                enemies.put(tokens[0], i);
	// 		}
	// 	} catch (FileNotFoundException fnf){
	// 		System.out.println("FNF");
	// 	}
	// 	// System.out.println(enemies);
	// }
}