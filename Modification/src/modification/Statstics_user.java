package modification;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Statstics_user {
      int NumberOfProducts_viewed =0;
      int NumberOfStores_visited =0;
      int  NumberOfProducts_bought=0;
      Database DB=new Database();

    public int getNumberOfProducts_viewed() {
        return NumberOfProducts_viewed;
    }

    public void setNumberOfProducts_viewed(int NumberOfProducts_viewed) {
        this.NumberOfProducts_viewed = NumberOfProducts_viewed;
    }

    public int getNumberOfStores_visited() {
        return NumberOfStores_visited;
    }

    public void setNumberOfStores_visited(int NumberOfStores_visited) {
        this.NumberOfStores_visited = NumberOfStores_visited;
    }

    public int getNumberOfProducts_bought() {
        return NumberOfProducts_bought;
    }

    public void setNumberOfProducts_bought(int NumberOfProducts_bought) {
        this.NumberOfProducts_bought = NumberOfProducts_bought;
    }
      
      
    public int User_sum() throws IOException{
     File file = new File("SoldProducts.txt"); 
	 
	int summation=DB.Counting(file);
		
        return summation;
	}
    
        
    
    public int User_avg() throws IOException{
        
       	int AVGsum = User_sum();
		return AVGsum/2 ;
    
    
    }
    
   
    public void User_Min() throws IOException{

      
  File file=new File("SoldProducts.txt");
 System.out.println("Minmum user using site is  : "+DB.Sort(0, file, "min"));
	
    }
     
    public void User_Max() throws IOException{
      
   
	
  File file=new File("SoldProducts.txt");
 System.out.println("Maximum user using site is : "+DB.Sort(0, file, "MAX"));
	
    
   
}
}

    