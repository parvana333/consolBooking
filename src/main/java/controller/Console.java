package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Console {

    private List<String> listcategory=new ArrayList<String>(Arrays.asList("1.Online-board","2.Show the flight info."));
    public void showMenu(){
        for(String c:listcategory){
            System.out.println(c);
        }
    }

    Scanner scan=new Scanner(System.in);
    public int read(){
        System.out.println("enter category");
        return scan.nextInt();
    }


}
