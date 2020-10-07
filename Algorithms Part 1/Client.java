import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Client {

    public static void main(String[] args) {
        System.out.println("hello");
        Scanner scan;
        try {
            File file = new File("data.txt");
            
            scan = new Scanner(file);
            int N=scan.nextInt();

            UnionFind uf=new UnionFind(N);

            uf.union(3, 4);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
            e.printStackTrace();
        }
    }
}