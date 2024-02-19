import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buffer {
    public static void main(String [] args) throws IOException {
        //InputStreamReader in = new InputStreamReader(system.in);
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        String str = bf.readLine();
        System.out.println(str);
    }
}
