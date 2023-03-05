package Question12;

import java.io.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
  
class CopyImage {
    public static void main (String[] args) {
       try {
      File file = new File("imagee.jpeg");
      BufferedImage image = ImageIO.read(file);
        
      
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        
     
      ImageIO.write(image, "jpeg", byteArrayOutputStream );
        
      
      byte [] byteArray = byteArrayOutputStream.toByteArray();
        
    
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        
      
      BufferedImage newImage = ImageIO.read(byteArrayInputStream);
        
    
      ImageIO.write(newImage, "jpeg", new File("imgCpy.jpeg"));
      System.out.println("Image copied..!");
       }
       catch(Exception e)
       {
    	   System.out.println("Copying image failed...!");
       }
    }
}