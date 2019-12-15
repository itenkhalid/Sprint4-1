/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modification;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Statstics_products {
    
    Database DB=new Database();
  
    public void Products_max() throws IOException{
    
    File file = new File("SoldProducts.txt"); 

 
 System.out.println("Maximum product sold is : "+DB.Sort(2, file, "MAX"));
        
        
	}
    
    
    public void Products_min() throws FileNotFoundException, IOException{
    
 
  File file=new File("SoldProducts.txt");
 System.out.println("Minmum product sold is : "+DB.Sort(2, file, "min"));
 


}}
