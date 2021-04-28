package org.example.filedeatils.entities;
import java.io.File;

import java.util.ArrayList;
import java.util.Collections;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class Directory {

   public static final String name = "C:\\Users\\anego\\eclipse-workspace\\first.java\\phase1(FSJD)\\src\\main\\directory\\";

   
    private ArrayList<File> files = new ArrayList<File>();
    
    Path path = FileSystems.getDefault().getPath(name).toAbsolutePath();
    
    File Dfiles = path.toFile();
       
    public String getName() {
        return name;
    }
    
    public void print() {
    	System.out.println("Existing Files: ");
    	files.forEach(f -> System.out.println(f));
    }

    public ArrayList<File> fillFiles() {
    	
        File[] directoryFiles = Dfiles.listFiles();
        
        
        
    	files.clear();
    	try {
    	
    	for (int i = 0; i < directoryFiles.length; i++) {
    		if (directoryFiles[i].isFile()) {
    			files.add(directoryFiles[i]);
    		}
    
    	
    	Collections.sort(files);
    	}
    	}
    	catch(Exception e) {
    		System.out.println("there is no file");
    		
    	}
		return files;
		
    }

    public ArrayList<File> getFiles() {
    	
    	fillFiles();
    	return files;
    }
    
    
}
    



