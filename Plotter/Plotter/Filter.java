package Plotter;



import java.io.*;



public class Filter implements FilenameFilter {

    final private String format = "FUNKTION";



    public boolean accept(File dir, String name) {

        if(name.startsWith(format)&&name.endsWith(".java")){

            return true;

        }

        return false;

    }

}
