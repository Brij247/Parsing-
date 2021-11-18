package main;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
                System.out.print(scanner.next()+ " ");
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
    }
    
    private void csvReaderMethod2(String filePath) {
        try {
            String line ="";
            BufferedReader br=new BufferedReader(new FileReader(filePath));


            while ((line = br.readLine())!= null){
                String[] details= line.split(",");
                System.out.println(details[0] + " " +details[1] + " "+details[2] + " ");
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        String filePath = new File("").getAbsolutePath() + File.separator + "./resources/details.csv";
        
        CSVReader csvObj = new CSVReader();
        System.out.println("Reading *Scanner class");

        csvObj.csvReaderMethod1(filePath);

        System.out.println("Reading *String split");

        csvObj.csvReaderMethod2(filePath);
    }
}
