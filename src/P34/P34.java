package P34;

import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;

public class P34 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入1個整數");
		
		BufferedReader br= 
				new BufferedReader(new InputStreamReader (System.in));
		
		String str=br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("你輸入的數字是"+num);
	}
	
}