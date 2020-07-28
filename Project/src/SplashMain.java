import java.io.File;




import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class SplashMain 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		
		
	FilesAscending fa=new FilesAscending();
     boolean again=true;
      while(again) 
      {
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("***********Welcome to LOCKME.COM******************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");	          		
	
		
		
        
        System.out.println("Please select from the below options"); 
        System.out.println("--------------------------------------"); 
        System.out.println("1.Get file names in ascending order");
        System.out.println("2.Modify existing files");
        System.out.println("3.Close the application");
        
        Scanner scan=new Scanner(System.in);
        int option=scan.nextInt();
        System.out.flush(); 
        switch(option)
        {  
        	case 1:
        	{
	             fa.filesort();
	             scan.nextLine();
	             break;
        	}
        	case 2:
        	{
        		System.out.println("Select from the below options");
        		System.out.println("--------------------------------------"); 
                System.out.println("1.Add files");
                System.out.println("2.Delete files");
                System.out.println("3.Search files");
                
        		int option1=scan.nextInt();
        		
        		switch(option1)
        		{
        			case 1:
	        		{
	        			System.out.println("Enter file name which you want to add");
	        			
	        			scan.nextLine();
	        			String Filename=scan.nextLine();        		       			
	        			fa.add(Filename+".txt");  
	        			break;
	        		}
	        		
	        		case 2:
	        		{   
	        			System.out.println("enter the file to be deleted");
	        			
	        			scan.nextLine();
	        			String filename=scan.nextLine();      
	        			fa.delete(filename+".txt"); 
	        			break;
	        		}
	        	        		
	        		case 3:
	        		{        			
	        		     System.out.println("Enter the file name to be searched");
	        		     
	        		     scan.nextLine();
	        		     String filename=scan.nextLine();
	        		     fa.Search(filename+".txt");
	        		     break;
	        		}
	        		
	        		default:
	            		System.out.println("Option is invalid");
	            		scan.nextLine();
	            		
	            		break;
        		}
        		             			
        		      		        		
        		break;
        	}
        	
        	case 3:
        	{
        		System.out.println("Thanks for using the application");
        		System.exit(0);
        	}  
        	default:
        		System.out.println("Option is invalid");
        		scan.nextLine();
        		
        		break;
        }
	
        
        System.out.println("Do you want to continue again Y or N??");
        
        
        String temp=scan.nextLine();
        if (temp.equalsIgnoreCase("Y"))
        	again=true;
        else
        	again=false;
      
      }
    		System.out.println("Thanks for using the application");
    		System.exit(0);
}
}




