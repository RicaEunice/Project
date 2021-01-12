package main;

/**
 * 
 * @author Rica Eunice Dordas
 *
 */
public class RecipeDetails {
	
    private String recipeName;  
    
    private String recipeCourse;
    
    private String recipeCuisine;
    
    private String recipeIngredients;
    
    
    /**
     * recipeName is the name of recipe
     * @return name of recipe
     */
    public String getRecipeName() { 
    	
        return recipeName;  
        
    }  
    /**
     * 
     * @param recipeName name of recipe
     */
    public void setRecipeName(String recipeName) {  
    	
        this.recipeName = recipeName;  
        
    }  
    /**
     * 
     * @return course of recipe
     */
    public String getRecipeCourse() {
    	
        return recipeCourse;  
        
    }  
    /**
     * 
     * @param recipeCourse course of recipe
     */
    public void setRecipeCourse(String recipeCourse) {  
    	
        this.recipeCourse = recipeCourse;  
        
    }  
    /**
     * 
     * @return cuisine of recipe
     */
    public String getRecipeCuisine() {  
    	
        return recipeCuisine;  
        
    }  
    /**
     * 
     * @param recipeCuisine cuisine of recipe
     */
    public void setRecipeCuisine(String recipeCuisine) {  
    	
        this.recipeCuisine = recipeCuisine;  
    }  
    /**
     * 
     * @return name of recipe
     */
    public String getRecipeIngredients() { 
    	
        return recipeIngredients;  
        
    }  
    /**
     * 
     * @param recipeIngredients ingredients of recipe
     */
    public void setRecipeIngredients(String recipeIngredients) {  
    	
        this.recipeIngredients = recipeIngredients;  
        
    }
}