import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[]args) throws IOException{
        //Map map;
        String[] products;
        int nrOfWareHouses = 0;
        int rows=0,colums=0,nrOfDrones=0,deadLine=0,maxLoad=0;
        try{
            Scanner fileScanner = new Scanner(new File("redundancy.in"));
            String read;
            int lineNr = 0;
            while(fileScanner.hasNextLine()){
                read = fileScanner.nextLine();
                if(lineNr == 0){
                    String[] strArr = read.split("\\s+");
                    rows = Integer.parseInt(strArr[0]);
                    colums = Integer.parseInt(strArr[1]);
                    nrOfDrones = Integer.parseInt(strArr[2]);
                    deadLine = Integer.parseInt(strArr[3]);
                    maxLoad = Integer.parseInt(strArr[4]);
                    lineNr++;
                }else if(lineNr == 1){
                    //map.maxWeight(Integer.parseInt(read));
                    lineNr++;
                }else if(lineNr == 2){
                    products = read.split("\\s+");
                    lineNr++;
                }else if(lineNr == 3){
                    nrOfWareHouses = Integer.parseInt(read);
                    lineNr++;
                }else if(lineNr == 4){ //adding warehouses
                    for(int i = 0;i < nrOfWareHouses;i++){
                        System.out.println(i);
                        System.out.println("warehous cord: " + read);
                        String[] xy = read.split("\\s+");
                        read = fileScanner.nextLine();
                        System.out.println("Prods in wareHouse" + read);
                        String[] productsInWareHouse = read.split("\\s+");
                        read = fileScanner.nextLine();
                    }
                    lineNr++;
                }else{
                    //System.out.println(read);
                }
            }

            System.out.println("Rows: " + rows);
            System.out.println("Col: " + colums);
            System.out.println("Nr of Drones: " + nrOfDrones);
            System.out.println("Nr of warehouses: " + nrOfWareHouses);
        }catch(Exception e){
            System.out.println("An error occured while reading file");
        }
    }
}
