package pack1;

import java.io.File;

//The File class directly has access to the computer filing system
// and mainly defines 3 main constructor
public class FileClass {

	
	//let's create a simple method to experiment file methods
	
	static void prt(String s){System.out.println(s);}
	
    public static void main(String...args){
		
		File file = new File("/java/Files");
		
		prt("file name: "+file.getName());
		prt("file path: "+file.getPath());
		prt("file absolute path: "+file.getAbsolutePath());
		prt("file parent: "+file.getParent());
		prt(file.exists()? "file exist":"file doesn't exist");
		prt(file.canWrite()? "file is writable":"file in't writable");
		prt(file.canRead()? "file is readable":"file in't readable");
		prt(file.isDirectory()? "file is a directory":"file in't a directory");
		prt(file.isFile()? "file is a normal file":"file is a named pipe");
		prt(file.isAbsolute()? "file is absolute":"file is not absolute");
		prt("file last modified: "+ file.lastModified());
		prt("file lenght: "+ file.length());
	
	}
	
}
