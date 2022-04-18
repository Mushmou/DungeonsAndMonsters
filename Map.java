import java.awt.Point;
import java.io.*;
import java.util.Scanner;

public class Map{
	private char[][] map;
	private boolean[][] revealed;
	private static Map instance = null;

	private Map(){
		map = new char[5][5];
		revealed = new boolean[5][5];
	}
}