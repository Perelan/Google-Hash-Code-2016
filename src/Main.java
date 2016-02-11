import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[]args) throws IOException{
        Map map;
        ArrayList<Strings> orders = new ArrayList<>();
        try{
            Scanner fileScanner = new Scanner(new File("redundancy.in"));
            String read;
            int lineNr = 0;
            while(fileScanner.hasNextLine()){
                read = fileScanner.nextLine();
                if(lineNr == 0){
                    String[] strArr = read.split("\\s+");
                    int rows = Integer.parseInt(strArr[0]);
                    int colums = Integer.parseInt(strArr[1]);
                    int nrOfDrones = Integer.parseInt(strArr[2]);
                    int deadLine = Integer.parseInt(strArr[3]);
                    int maxLoad = Integer.parseInt(strArr[4]);
                    lineNr++;
                }else if(lineNr == 1){
                    map.maxWeight(Integer.parseInt(read));
                    lineNr++;
                }else{

                }
                System.out.println(read);
            }
        }catch(Exception e){
            System.out.println("An error occured while reading file");
        }
    }
}
