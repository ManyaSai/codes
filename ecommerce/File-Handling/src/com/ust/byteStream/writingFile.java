package com.ust.byteStream;

import java.io.*;
import java.util.Scanner;

public class writingFile {
    public static void main(String[] args) {
//       OutputStream output = null;
        //if we write beside try then all commented are not reqd. it is called try with resources
        try(OutputStream output = new FileOutputStream("output.txt")) {
//            output = new FileOutputStream("output.txt");
            String lines = """
                    Hello all,
                    We are writing data on a file
                    """;
            output.write(lines.getBytes());
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }
//        finally {
//            try {
//                output.close();
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }

    }
}
