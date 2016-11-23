import java.io.File;

public class primms {
    private int[][] table;
    private int[][] connections;
    private int length;
    public primms(int[][] table){
        this.table=table;
        findShortest();
    }
    public primms(File file){
        table=readFile(file);
        findShortest();
    }
    public void settable(int[][] table){
        this.table=table;
        findShortest();
    }
    public int[][] getConnections(){
        return connections;
    }
    public int getLength(){
        return length;
    }
    private void findShortest(){
        arrayAppend app=new arrayAppend();
        int[] checkOrder={0};
        connections=new int[1][2];
        boolean[] eliminated=new boolean[table.length];
        for(int i=0;i<eliminated.length;i++){
            eliminated[i]=false;
        }
        eliminated[0]=true;

        for(int i=0;i<table.length-1;i++){ //Connections
            int[] lowest=new int[2];
            int temp=99999; //Highest Length is Reset for that Connection
            for(int i2=0;i2<checkOrder.length;i2++){//Collumn check
                int collumn=checkOrder[i2];
                for(int i3=0;i3<table[i2].length;i3++){ //Row check
                    if(!eliminated[i3]){ //Ignore eliminated rows
                        if(table[collumn][i3]<temp){ //If row distance<current lowest found distance
                            temp=table[collumn][i3]; //Store as current lowest found
                            lowest[1]=collumn; //Store connection
                            lowest[0]=i3;
                        }
                    }
                } //Next row
            } //Next collumn
            if(i==0){
                connections[0][0]=lowest[0];
                connections[0][1]=lowest[1];
            }
            else {
                connections = app.append(connections, lowest); //Append connection
            }
            checkOrder=app.addOn(checkOrder,lowest[0]); //Append new collumn
            eliminated[lowest[0]]=true; //Eliminate row
        }
        findLength();
    }
    private void findLength(){
        length=0;
        for(int i=0;i<connections.length;i++){
            length=length+table[connections[i][1]][connections[i][0]];
        }
    }
    private int[][] readFile(File file){
        csvReader read=new csvReader();
        String[][] contents=read.readCsv(file);
        int[][] number=new int[contents.length][contents[0].length];
        for(int i=0;i<contents.length;i++){
            for(int i2=0;i2<contents[i].length;i2++){
                if(contents[i][i2].equals("-")){
                    number[i][i2]=Integer.MAX_VALUE;
                }
                else{
                    number[i][i2] = Integer.parseInt(contents[i][i2]);
                }
            }
        }
        return number;
    }
}