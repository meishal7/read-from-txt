import java.io.FileNotFoundException;  //catch exceptions
import java.io.FileInputStream; //file stream
import java.util.Scanner; //read from file
import java.util.ArrayList; //array list
import java.util.Collections; //find min max in 
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Arrays;



class Main {
  public static void main(String[] args) {
    Scanner inputstream  = null; //create a stream
    PrintWriter outputstream = null;
  
        
        //Open file and catch exceptions
       
        try{
            inputstream = new Scanner(new FileInputStream("Input.txt"));
            System.out.print("opened");

               outputstream = new PrintWriter( new FileOutputStream("Output.txt"));

            System.out.print("File created.");
        }
        catch(FileNotFoundException e)
        {
            System.out.print("File was not found or couldn't be open.");
            System.exit(0);
        }
         

        ArrayList<String> data = new ArrayList<String>();
        String[] ardata = new String[11];
        
        String line;
        //String[] words = new String
        line = inputstream.nextLine();
       // System.out.println(line);
        
        while(inputstream.hasNextLine()){
          line = inputstream.nextLine();
          data.add(line);
        }

        ardata = data.toArray(ardata);
        

        for(int i =0; i< ardata.length; i++){
            System.out.println(ardata[i]);
            String[] words  = ardata[i].split("\\s+");
            String first = words[0];
	words[0] = words[words.length-1];
	words[words.length-1] = first;
  outputstream.println("\n");
	//System.out.println("New array after swaping the first and last elements: "+Arrays.toString(words));
   for(int j =0; j< words.length; j++){
      //outputstream.write("\n");
      outputstream.print(words[j] + " ");
      
      
      


   }
  
 
  

  
            
        }
        outputstream.close();
        
        //outputstream.close(); 

            
      }
}