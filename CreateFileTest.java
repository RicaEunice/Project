package main;

import static org.junit.Assert.assertEquals;

import java.io.File;
import org.junit.jupiter.api.Test;


 
class CreateFileTest {
	
	@Test

    public void createFileTest() throws Exception {
		
        File file = new File("RecipeBook.txt");
        
        boolean expectedResult = true;
        
        boolean actualResult = false;
        
        if (file.exists()){
        	
            actualResult = true;
            
        }
        
        assertEquals(expectedResult, actualResult);
    }
}

  