package com.PracticeTest;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Test2 {
	public static void main(String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
            inputData.add(in.nextLine());
        
        
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
	}
	public static List<String>  processData(ArrayList<String> array) {
		Map<String, Integer> libVersion=new HashMap<String, Integer>();
		Set<String> productList=new LinkedHashSet<String>();
		for (String line : array) {
			String[] lineElement=line.split(",");
			Integer oldVersion=libVersion.get(lineElement[1]);
			Integer newVersion=Integer.parseInt(lineElement[2].substring(2));
			if(oldVersion!=null) {
				if(oldVersion<newVersion)
					libVersion.put(lineElement[1],newVersion);
			}
			else
				libVersion.put(lineElement[1],newVersion);		
		}
		for (String line : array) {
			String[] lineElement=line.split(",");
			Integer currentVersion=Integer.parseInt(lineElement[2].substring(2));
			if(currentVersion<libVersion.get(lineElement[1])) {
				productList.add(lineElement[0]);
			}
		}
       List<String> retVal = new ArrayList<String>(productList);
       return retVal;
	}
}