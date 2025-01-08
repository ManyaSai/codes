package com.ust.byteStream.slackquestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class slackQ1 {
    public static void main(String[] args) {
        int n;
        String ch,s="";
        try{
            Set<String> set = new HashSet<>();
            List<String> list = new ArrayList<>();
            InputStream i1 = new FileInputStream("slackQ1Read");
            Scanner scanner1 = new Scanner(i1);


            while (scanner1.hasNextLine()){
                String line = scanner1.nextLine();
                int i=0,j=0;
                while (i<line.length()){

                    if(line.charAt(i)==' '){
                        set.add(s);
                        if(j==1 && s.equals(s.toUpperCase()))list.add(s);
                        s = "";
                    }
                    else s+=line.charAt(i);
                    i++;j=1;
                }
            }
            n = set.size();
        }catch (
                IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
