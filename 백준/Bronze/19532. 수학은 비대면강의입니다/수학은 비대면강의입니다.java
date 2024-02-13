import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x=0;
        int y=0;
        for(int i=-999; i<1000; i++){
            for(int j=-999; j<1000; j++){
                int num1 = i*a + j*b;
                int num2 = i*d + j*e;
                if(num1==c&& num2==f){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        System.out.println(x+" "+y);
    }
}