package modification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {

 

    public String Current_Directory(File file2) {

        return file2.getPath().toString();
    }

    public void Write_to_file(File file2, String []array) throws IOException {

        FileWriter writeer = new FileWriter(file2, true);

        for(String i: array){
        writeer.write(i);
          writeer.write("\n");
        
        }
   

        writeer.close();

    }

    
    public boolean Read_From_File_one(File file3, String A) throws FileNotFoundException, IOException {

        
        
        
        
        String f2 = Current_Directory(file3);
        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new FileReader(f2));

        String line2;
        String line1;
        String line3;

        boolean aExists = false;

        while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null  ) {

            if (line1.equals(A)) {

                aExists = true;

                break;
            }

        }

        if (aExists) {
            return true;
        } else {
            return false;
        }

    }

    public boolean Read_From_file_3(File file4, String a, String b, String c) throws FileNotFoundException, IOException {
        String f = Current_Directory(file4);

        BufferedReader bufferedReader;

        bufferedReader = new BufferedReader(new FileReader(f));
        String line1;
        String line2;
        String line3;
       
     

        boolean aExists = false;
        boolean bExists = false;
        boolean cexists = false;

        while ((line1 = bufferedReader.readLine()) != null & (line2 = bufferedReader.readLine()) != null & (line3 = bufferedReader.readLine()) != null ) {

            if (line1.equals(a) && line2.equals(b) && line3.equals(c)) {
                aExists = true;
                bExists = true;
                cexists = true;
                break;
            }
        }
        if (aExists && bExists && cexists) {
            return true;

        } else {
            return false;
        }

    }
    
    
 
    

    public void view(File file) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }

    
    /*
    public void Copy_file(FileReader f1, File f2) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(f1);
        FileWriter fw = new FileWriter(f2, true);
        String s;

        while ((s = br.readLine()) != null) { // read a line
            fw.write(s); // write to output file
            fw.flush();
        }
        br.close();
        fw.close();

    }

    
    public void Replace (File file1,String oldtext,String offer) throws FileNotFoundException, IOException{

 
   { String line;
         try
             {
            
             BufferedReader reader = new BufferedReader(new FileReader(file1));
         
             while((line = reader.readLine()) != null)
                 {
                 oldtext += line + "\r\n";
             }
             reader.close();
             // replace a word in a file
             
             
             //String newtext = oldtext.replaceAll("drink", "Love");
            
             
             //To replace a line in a file
             String newtext = oldtext.replaceAll(oldtext, offer);
            
             FileWriter writer = new FileWriter("file.txt");
             writer.write(newtext);writer.close();
         }
         catch (IOException ioe)
             {
             ioe.printStackTrace();
         }
     }
   
   
}
    */
    public int Counting(File file) throws FileNotFoundException, IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line1; 
		 String line2;
		 String line3;
	
		
		 int  count=0;
		while((line1 = br.readLine()) != null&(line2 = br.readLine()) != null&(line3 = br.readLine()) != null ) {
			count++;
	}
		
		return count;
    } 
    
   
    
    public String Sort(int count,File file,String m) throws IOException{
        
        
       
	int minnum=100;
        String name = null;
        int maxmum=0;

       
         BufferedReader br = new BufferedReader(new FileReader(file)); 
	Map<String,Integer>x =new HashMap<String, Integer>();
	
	String line; 
	while((line = br.readLine()) != null) {
		if(count==0) {
		if(x.get(line)!=null) {
			x.put(line,x.get(line)+1);
		}else {
			x.put(line,1);
		}
		
		}	
		count++;
		if(count==3) {
			count=0;
		}
              
	}
        
        if(m.equals("MAX"))
        {
        
     
	for(Map.Entry<String, Integer>entry:x.entrySet()) {
		if(entry.getValue()>maxmum)
		{
			maxmum=entry.getValue();
			name=entry.getKey();
		}
              
	
        }}
        else 
            
   
        {
         for(Map.Entry<String, Integer>entry:x.entrySet()) {
		if(entry.getValue()<minnum)
		{
			minnum=entry.getValue();
	 name=entry.getKey();
                        

		}
                
    
         }}
        return name;
    
      
    
    }}
		
                
                 
    
    
   

