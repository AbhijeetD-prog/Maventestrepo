package org.abhi.java;

import java.io.File;
import java.util.*;  
import java.io.*;  

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args )throws Exception
    {
        System.out.println( "Hello World!" );
        System.out.println("Testing : " + System.getProperty("user.dir"));
        System.err.println("Print error");
        
        //FileReader reader=new FileReader(System.getProperty("user.dir")+"/src/main/resources/test1.properties"); 
       FileReader reader=new FileReader("test1.properties");
       //InputStream reader = App.class.getClassLoader().getResourceAsStream("test1.properties");	
	   //InputStream reader = App.class.getResourceAsStream("test1.properties");
        
        Properties p=new Properties();  
        p.load(reader);  
         System.out.println("Properties...."); 
        System.out.println(p.getProperty("name"));  
       
        
    }
}
