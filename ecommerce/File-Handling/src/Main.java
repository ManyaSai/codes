import com.ust.byteStream.writingFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File f = new File("xyxyx");
        try {
            if(f.createNewFile()) System.out.println("file name: "+f.getName());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose:1) reading or 2) writing: ");
        int input = scanner.nextInt();
        if(input==1) {
            try{
                InputStream i1 = new FileInputStream("readingFile1");
                Scanner scanner1 = new Scanner(i1);
                while (scanner1.hasNextLine()){
                    String line = scanner1.nextLine();
                    System.out.println(line);
                }
            }catch (IOException ex){
                System.err.println(ex.getMessage());
            }
        }
        else{
            try(OutputStream output = new FileOutputStream("writingFile1")) {
                Scanner s = new Scanner(System.in);
                System.out.println("input str: ");
                String x = s.nextLine();
//      (or)         String lines = """
//                    Hii
//                    I've successfully completed
//                    """;
                output.write(x.getBytes());
            }
            catch (IOException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}