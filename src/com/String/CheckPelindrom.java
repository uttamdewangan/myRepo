package com.String;

public class CheckPelindrom {
	
	static int  uniqueChar=1;
	static boolean isPalindrom(String str)
	{
		
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static String uniqueCharacters(String test){
	    String temp = "";
	    for (int i = 0; i < test.length(); i++){
	        char current = test.charAt(i);
	        if (temp.indexOf(current) < 0){
	            temp = temp + current;
	        } else {
	            temp = temp.replace(String.valueOf(current), "");
	        }
	    }

	    return temp; 
	}
	
	
	static void makePelindrom(String str)
	{
		
		char tempArray[]=str.toCharArray();
		char temp;
		char tempChar;
		int swapcount=0;
		
		if(tempArray.length%2!=0)
		{
			String uniqueCharacter=uniqueCharacters(str);
			char uniqueChar=uniqueCharacter.charAt(0);
			System.out.println(""+uniqueChar);
			int indexNo=str.indexOf(uniqueChar);
			System.out.println("==="+str.indexOf(uniqueChar));
			
			
			tempChar=tempArray[(((tempArray.length)/2))];
			tempArray[(tempArray.length)/2]=tempArray[indexNo];
			tempArray[indexNo]=tempChar;
			System.out.print("*******after first swap********");
			for(int l=0;l<tempArray.length;l++)
			{				
				System.out.print(tempArray[l]);
			}
		}				
		
		//int o=tempArray.length -1;
		for(int i=0;i<tempArray.length-1;i++)
		for(int j=i+1;j<tempArray.length-i;j++)
		{			
			
			if(tempArray[i] == tempArray[tempArray.length-(i+1)])
			{
				
				System.out.println("first string "+tempArray[i]+"-----"+"Last string "+tempArray[tempArray.length-(j)]);
				break;
			}
			else
			{					
				while(tempArray[i] == tempArray[j])
				{
					
					temp=tempArray[j];
					tempArray[j]=tempArray[tempArray.length-(i+1)];
					tempArray[tempArray.length-(i+1)]=temp;
					
					swapcount=swapcount+1;
					uniqueChar=0;
					break;
				}
					
				//System.out.println("print String ************");
				for(int l=0;l<tempArray.length;l++)
					System.out.print(tempArray[l]);
					System.out.println("-----------------");
					//System.out.println("\n print String ************");
				
				
			}
			
							
		}
		for(int k=0;k<tempArray.length;k++)
		System.out.print(tempArray[k]);
		
		System.out.println("********"+swapcount);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		/*if(isPalindrom(str)==true)
		{
			System.out.println("String is pelindrom");
		}else{
			System.out.println("String not pelindrom");
		}*/
		
		makePelindrom(str);

	}

}
