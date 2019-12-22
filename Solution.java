import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
    	System.out.println("s length"+s.length());
    	char[] myArray = s.toCharArray();
    	double temp = Math.sqrt(s.length());
    	int rowLimit = (int)temp;
    	int columnLimit = (temp == (int)temp)? rowLimit:rowLimit+1;
    	if (rowLimit*columnLimit <s.length()) {
    		if (rowLimit > columnLimit)
    			columnLimit++;
    		else
    			rowLimit++;
    	}
    	System.out.println("row, column"+rowLimit+","+columnLimit);
    	String result = "";
    	int rCount =0, cCount = 0;
    	for (int i=0;i<rowLimit*columnLimit;i++) {
    		System.out.println(rCount+","+cCount);
    		if (rCount * columnLimit + cCount < s.length())
    			result += myArray[rCount * columnLimit + cCount];
    		if (rCount == rowLimit-1) {
    			rCount = 0;
    			cCount ++;
    			result+=" ";
    		}else {
    			rCount++;
    		}
    	}
    	
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        String s = scanner.nextLine();

        String result = encryption(s);

        System.out.println(result);
    }
}
