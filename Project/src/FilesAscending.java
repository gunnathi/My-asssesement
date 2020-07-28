import java.io.File;
import java.io.IOException; 
import java.nio.file.*; 
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class FilesAscending 
{
	   
	

	
	public String GetDirectoryName(String path, String filename) 
	{
		if (path.contains(filename)) 
		{ 
			path = path.replace(filename, "");									
        } 
		return path;		
	}
	
	void filesort() throws IOException 
	{
		
		File dir1 = new File("temp.txt");
		String dummy=this.GetDirectoryName(dir1.getCanonicalPath().toString(),"temp.txt");		
		File dir = new File(dummy);
		
	    File[] files = dir.listFiles();

	    Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	    for (File file : files) 
	    {
	       if (!file.isHidden()) 
	       {	        
	             System.out.println(file.getName());
	         
	       }
	    }

	}
	public void delete(String filename) 
	{
		{     
			try
	        { 
				File dir1 = new File("temp.txt");
				String dummy=this.GetDirectoryName(dir1.getCanonicalPath().toString(),"temp.txt");	
				if(Files.deleteIfExists(Paths.get(dummy+filename)))
	            	System.out.println("Deletion successful."); 	
	            else
	            	System.out.println("No such file/directory exists"); 	
	        } 
	        catch(NoSuchFileException e) 
	        { 
	            System.out.println("No such file/directory exists"); 
	        } 
	        catch(DirectoryNotEmptyException e) 
	        { 
	            System.out.println("Directory is not empty."); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.println("Invalid permissions."); 
	        } 	           
	    } 
	}    
	 
	
	public void add(String filename) throws IOException 
	{
		
		File file = new File(filename); // initialize File object and passing path as argument
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}
	}
	
	public void Search( String filename) throws IOException 
	{	
        String searchStr = filename;
		
        File dir1 = new File("temp.txt");
		String dummy=this.GetDirectoryName(dir1.getCanonicalPath().toString(),"temp.txt");	
		File dir = new File(dummy);
	      FilenameFilter filter = new FilenameFilter() 
	      {
	         public boolean accept (File dir, String name) 
	         { 
	            return name.contains(searchStr);
	         } 
	      }; 
	      String[] children = dir.list(filter);
	      
	      if (children.length == 0) 
	      {
	         System.out.println("File doesn't exist in the directory "); 
	      } 
	      
	      else 
	      { 
	         for (int i = 0; i< children.length; i++) 
	         {
	            String filename1 = children[i];
	            System.out.println(filename1+" has be succesfully found");
	         } 
	      } 
		
	}
	
	
	
	}
		
	




	

