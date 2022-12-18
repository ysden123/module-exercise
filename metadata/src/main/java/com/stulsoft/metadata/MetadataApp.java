package com.stulsoft.metadata;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Metadata;

import java.io.File;

public class MetadataApp {
    public static void main(String[] args) {
        System.out.println("==>main");

        try {
            File jpegFile = new File("myImage.jpg");
            Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
