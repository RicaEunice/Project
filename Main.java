
package main;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Rica Eunice Dordas
 *
 */
public class Main {
	
/**
 * 
 * @param args menu1 is the Main Menu of the program
 * @throws IOException when the operation fails
 */
	public static void main(String args[]) throws IOException{  
		menu1();
	
	
	}
/**
 * creates recipe book
 */

    public static void createFile() {	
    	try {
    		
    	      File newFile = new File("RecipeBook.txt"); // created new txt file
    	      
    	      
    	      if (newFile.createNewFile()) {
    	    	  
    	        System.out.println("\n Great! Recipe Book is created \n"); // Will print if it is a newly created Recipe Book
    	        
    	      } else {
    	    	  
    	        System.out.println("\n Recipe Book already exists.\n "); // Will print is Recipe Book has already been created
    	        
    	      }   
    	      
    	    } catch (IOException e) {
    	    	
    	      System.out.println("An error occurred.");
    	      
    	    }
    }
 
/**
 * 
 * @throws FileNotFoundException when there is an error locating the file
 */
  // View Recipe Book implements Iterator Pattern
 public static void viewRecipe() throws FileNotFoundException {
	 
	 
	 CollectionofCourses cmpnyRepository = new CollectionofCourses();  
     
     for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  // iterates the 3 courses
    	 
         String course = (String)iter.next();  // saves the 3 courses to var course
         
         System.out.println(course); 
         
	    }
     
     String filepath= "C:\\Users\\acer\\Documents\\NetBeansProjects\\Main\\RecipeBook.txt"; // filepath
     
     {

   FileInputStream fstream = new FileInputStream(filepath); // reads data of the txt file
   
       try ( 
    		   
           DataInputStream in = new DataInputStream(fstream)) { //reads primitive java data types
    	   
           BufferedReader br = new BufferedReader(new InputStreamReader(in)); // reads the data of the txt file
           
           System.out.print("Enter the course of recipe:");  
           
           BufferedReader cr=new BufferedReader(new InputStreamReader(System.in)); // reads the input of the user
           
           String course=cr.readLine(); // user input is the desired course of the user
           
           String strLine;
           
           System.out.print("\n");
           
           //Read File Line By Line
           
           while ((strLine = br.readLine()) != null) { // reads the txt file line by line
        	   
               String[] arr = strLine.split("-"); // line is split by the delimeter (-)
               
               String name = arr[1]; 
               
               String cuisine = arr[2];
               
               String ingredients = arr[3];
               
               for (String word : arr) {
            	   
                   if (word.equals(course)){ // if statement that will determine what course was desired by the user to show the recipe under that course
                	   
                       System.out.println("Recipe Name: " + name + " \t Cuisine " + cuisine + "\n Ingredients: " + ingredients);
                       
                       System.out.print("\n");
                   }
           }
           }
        
     }catch (IOException e){
    	 
   System.err.println("Error: " + e.getMessage());
   
   }
     }
 }

	 
 
    
    
    
  // Add Recipe (using Adapter Pattern)
 /**
  * 
  */
  public static void addRecipe() {
	  
	  Recipe targetInterface=(Recipe) new RecipeInput();  
  
	  targetInterface.giveRecipeDetails(); // details of the recipe (name, cuisine, course, ingredients)
  
	  targetInterface.AddRecipe(); // function to add the recipe
	
	}
  
  /**
   * 
   * @throws IOException if there is an error in the operation
   */

	public static void menu1() throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {
			 
			boolean isWrongAnswer;
			
			System.out.println("\n What do you like to do? \n 1 - Create a Recipe Book \t 2 - View Recipe Book \t 3 - Add Recipe \t 4 - Exit \n");
			
			
			String line = br.readLine();
			
			 do { // will execute if it has the correct answer
				 
			    isWrongAnswer = false;
			    
			    
			    switch (line) {
			    
			        case "1": // create a file
			        	
			            createFile();
			            
			            menu1();
			            
			            break;
			            
			        case "2": // view recipe book
			        	
			        	System.out.println("Recipe Book");
			        	
			        	viewRecipe();
			        	
			        	menu1();
			        	
			            break;
			         
			        case "3": // add recipe
			        	
			        	addRecipe();
			        	
			        	System.out.println("Recipe added.");
			        	
			        	menu1();
			        	
			            break;
			            
			        case "4": // exit the program
			        	
			        	System.out.println("Closing Recipe Book");
			        	
			        	System.exit(0);
			        	
			            break;
			            
			        default: // if the user did not input from 1-4
			        	
			           System.out.println("\n Choose from 1 to 4 \n");
			           
			           isWrongAnswer = true;
			           
			           menu1();
			           
			        }
			    
			 } while (isWrongAnswer);
			
		}
		}

	}

	
