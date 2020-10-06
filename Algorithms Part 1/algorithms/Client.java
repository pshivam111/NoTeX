package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import algorithms.UnionFind;
class Client {

    public static void main(String[] args) {
        Scanner scan;
        try {
            File file = new File("filename.txt");
            
            scan = new Scanner(file);
            int N=scan.nextInt();

            UnionFind uf=new UnionFind(N);

            
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
            e.printStackTrace();
        }
    }
}