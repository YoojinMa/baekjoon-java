package stepbystep.step06.b11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        for(byte val : br.readLine().getBytes()) {
            sum += (val - '0');
        }
        System.out.println(sum);
    }
}
