package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0501 {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力してください");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println(str + "が入力されました。");
        
        
        String str1  = "123";
        System.out.println(str1 + 4);//①1234
        int num = Integer.parseInt(str1);
        System.out.println(num + 4); //②127
    }

}
