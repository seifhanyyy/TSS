/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tss;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Eslam
 */
public interface NewFile {
     public void WritingFile()throws IOException;
     public String  ReadingFile()throws FileNotFoundException, IOException;
    
}
