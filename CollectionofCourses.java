package main;
/**
 * 
 * @author Rica Eunice Dordas
 *
 */
public class CollectionofCourses implements Container {  
	/**
	 * course is the array containing the courses
	 */
		public String course[]={"Appetizer", "Main Dish","Desert"};   
		      
		@Override  
		
		/**
		 * @return iterated courses
		 */
		    public Iterator getIterator() {  
			
		        return new CollectionofCoursesIterate() ;  
		        
		    }  
		
		    private class CollectionofCoursesIterate implements Iterator{ 
		    	
		        int i;  
		        
		        @Override  
		        /**
		         * @return boolean value if there is a next element
		         * @param i is the index number of an object in the array
		         */
		        public boolean hasNext() {  // if the array has a next element
		        	
		            if (i<course.length){  // it will not execute if it is already the last element
		            	
		                return true;  
		            }  
		            
		            return false;  
		        }  
		        
		        @Override  
		        
		        /**
		         * @return the next value in the array
		         */
		        public Object next() {  
		        	
		            if(this.hasNext()){  
		            	
		                return course[i++];  //iterate to the next element
		                
		            }  
		            
		            return null;      
		        }  
		    }  
		}
