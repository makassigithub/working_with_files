package pack1;

import java.io.File;

//The File class directly has access to the computer filing system
// and mainly defines 3 main constructor
public class FileClass {

	
	//let's create a simple method to experiment file methods
	
	static void prt(String s){System.out.println(s);}
	
    public static void main(String...args){
		
		File file = new File("/java/Files");
		
		//getting the file name
		prt("file name: "+file.getName());
		
		//getting the file path
		prt("file path: "+file.getPath());
		
		//getting the path absolute path
		prt("file absolute path: "+file.getAbsolutePath());
		
		//getting the parent folder
		prt("file parent: "+file.getParent());
		
		//checking if the file exist : It not physically created
		prt(file.exists()? "file exist":"file doesn't exist");
		
		//It,s not writtable nor readable
		prt(file.canWrite()? "file is writable":"file in't writable");
		prt(file.canRead()? "file is readable":"file in't readable");
		
		//It,s not a directoty
		prt(file.isDirectory()? "file is a directory":"file isn't a directory");
		
		//It' not a file nor absolute
		prt(file.isFile()? "file is a normal file":"file is a named pipe");
		prt(file.isAbsolute()? "file is absolute":"file is not absolute");
		
		//Not modified and contains nothing
		prt("file last modified: "+ file.lastModified()); // Can also setLastModified(long millisec) 
		prt("file lenght: "+ file.length());
		
		//get the num of free, total,  byte available on the partition associated with it
		prt("free space: "+ file.getFreeSpace());
		prt("total space: "+ file.getTotalSpace());
		
		//Check if hidden or id readOnly
		prt("file is hideen: "+ file.isHidden());
		//prt("file is set readonly: "+ file.setReadOnly());
		
		
		
	
	}
	
}
