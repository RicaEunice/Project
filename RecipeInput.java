
package main;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;  

/**
 * 
 * @author Rica Eunice Dordas
 *
 */

public class RecipeInput extends RecipeDetails implements Recipe{ 
	
@Override

/**
 * @param name is the recipe name, course if the recipe course, cuisine is the recipe cuisine and ing contains the ingredients of the recipe
 * @throws IOException and NumberFormatException when the operation fails
 */
 public void giveRecipeDetails(){  
	
     try{  
    	 
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
   
   
   System.out.print("Enter the name of the recipe:");  
   
   String name=br.readLine();  
   
   System.out.print("\n");
   
   
   
   System.out.print("Enter the classification:\n Appetizer \t Main Dish \t Desert   ");  
   
   String course=br.readLine();  
   
   System.out.print("\n");
   
   
   
   System.out.print("Enter the cuisine:");  
   
   String cuisine=(br.readLine());   
   
   System.out.print("\n");
   

   System.out.print("Enter ingredients:");
   
   String b=br.readLine();   
   
   String[] token = b.split(" ");
   
   String ing = Arrays.toString(token);
   
   System.out.print("\n");
   
   
   setRecipeName(name);  
   
   setRecipeCourse(course);
   
   setRecipeCuisine(cuisine); 
   
   setRecipeIngredients(ing); 
   
   
   } catch(IOException | NumberFormatException e){  
	   
   }  

}
	
	
     
 

@Override
/**
 * @param name is the recipe name, course if the recipe course, cuisine is the recipe cuisine and ing contains the ingredients of the recipe
 * @throws IOException when the operation fails
 * @return the data to the txt file
 */
public void AddRecipe() {
	
	FileWriter fw;
	
	String name=getRecipeName(); 
	
	String course=getRecipeCourse();  
	
	String cuisine=getRecipeCuisine();  
	
	String ing= getRecipeIngredients();
	
	
	try {
		
		fw = new FileWriter("RecipeBook.txt",true); // append to the txt file
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(course + "-" + name + "-" + cuisine + "-" + ing); // writes to the txt file
	    
	    pw.close();
	    
	    
	    
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}	
	
}

}  