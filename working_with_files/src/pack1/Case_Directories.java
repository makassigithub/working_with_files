package pack1;

import java.io.File;
import java.io.FilenameFilter;

public class Case_Directories {

	// here we show how directories work in java
	//We wil use a phyical directory on this machine
	
	public static void main(String...args){		
		
		String dir = "/tmp";
		
		File file = new File(dir);
		
		if(file.isDirectory()){
			System.out.println("Directory of "+ dir);
			 String [] fls = file.list();
			 
			 for(int i = 0;i<fls.length;i++){
				 File f = new File(dir +"/"+fls[i]);
				 
				 if(f.isDirectory()){
				     System.out.println("the subdirectory"+f.getName()+" contains");
				    	 for(String s :f.list()) System.out.println(s);
			     }else{System.out.println(f.getName() + "is a file inside "+ dir);}
				 System.out.println();
			 }

				/*
				 Directory of /tmp
			the subdirectoryjava contains
			Body.docx
			CL.docx
			Dale.docx
			FY2013 Monthly Report_MAR2013.doc
			students_file.txtis a file inside /tmp

				  */
			
			 }
		

	}
	
	
}
