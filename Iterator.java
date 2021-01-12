package main;
/**
 * 
 * @author Rica Eunice Dordas
 *
 */
public interface Iterator {
	
	/**
	 * 
	 * @return boolean whether there is a next element
	 * 
	 */
	public boolean hasNext();
	
	/**
	 * 
	 * @return the next object
	 */
    public Object next();  
}
