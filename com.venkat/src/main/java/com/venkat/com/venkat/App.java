package com.venkat.com.venkat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	String s = "rohith";
    	String rev = "";
    	
    	//int length = s.length();
    	for(int i=s.length()-1;i>=0;i--){
    		rev = rev + s.charAt(i);
    		
    	}
    		
    	System.out.println(rev);
    	}
    	
    	
    	
    }
    	
