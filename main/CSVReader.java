package main;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {

    //  Scanner class
    //  String.split
    //  by OpenCSV API

    private void csvReaderMethod1(String filePath){
        try {
            Scanner scanner =new Scanner(new File(filePath));

            scanner.useDelimiter(",");

            while(scanner.hasNext()){
                System.out.println(scanner.next()+" ");
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        String filePath = new File("").getAbsolutePath() + File.separator + "./resources/details.csv";
        
        CSVReader csvObj = new CSVReader();
        System.out.println("Reading");

        csvObj.csvReaderMethod1(filePath);
    }
}
