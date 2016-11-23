public class arrayAppend {
    public arrayAppend(){}
    public  int[] addOn(int[] array, int value){
        if(array==null){
            return new int[]{value};
        }
        else {
            int[] temp = array;
            array = new int[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  String[] addOn(String[] array, String value){
        if(array==null){
            return new String[]{value};
        }
        else{
            String[] temp = array;
            array = new String[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  float[] addOn(float[] array, float value){
        if(array==null){
            return new float[]{value};
        }
        else{
            float[] temp = array;
            array = new float[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  double[] addOn(double[] array, double value){
        if(array==null){
            return new double[]{value};
        }
        else {
            double[] temp = array;
            array = new double[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  boolean[] addOn(boolean[] array, boolean value){
        if(array==null){
            return new boolean[]{value};
        }
        else {
            boolean[] temp = array;
            array = new boolean[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  byte[] addOn(byte[] array, byte value){
        if(array==null){
            return new byte[]{value};
        }
        else {
            byte[] temp = array;
            array = new byte[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  long[] addOn(long[] array, long value){
        if(array==null){
            return new long[]{value};
        }
        else {
            long[] temp = array;
            array = new long[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  char[] addOn(char[] array, char value){
        if(array==null){
            return new char[]{value};
        }
        else{
            char[] temp = array;
            array = new char[array.length + 1];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = temp[i];
            }
            array[array.length - 1] = value;
            return array;
        }
    } //NULL HANDLED
    public  int[] subOn(int[] array){
        if(array.length==1){
            return null;
        }
        return subOn(array, array.length-1);
    }
    public  String[] subOn(String[] array){
        return subOn(array, array.length-1);
    }
    public  float[] subOn(float[] array){
        return subOn(array, array.length-1);
    }
    public  double[] subOn(double[] array){
        return subOn(array, array.length-1);
    }
    public  boolean[] subOn(boolean[] array){
        return subOn(array, array.length-1);
    }
    public  byte[] subOn(byte[] array){
        return subOn(array, array.length-1);
    }
    public  long[] subOn(long[] array){
        return subOn(array, array.length-1);
    }
    public  char[] subOn(char[] array){
        return subOn(array, array.length-1);
    }
    public  int[] subOn(int[] array, int n){
        int[] temp=new int[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public  String[] subOn(String[] array, int n){
        String[] temp=new String[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public  float[] subOn(float[] array, int n){
        float[] temp=new float[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public  double[] subOn(double[] array, int n){
        double[] temp=new double[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public boolean[] subOn(boolean[] array, int n){
        boolean[] temp=new boolean[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public byte[] subOn(byte[] array, int n){
        byte[] temp=new byte[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public long[] subOn(long[] array, int n){
        long[] temp=new long[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public char[] subOn(char[] array, int n){
        char[] temp=new char[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==n){
                i++;
            }
            if(i>=n){
                temp[i-1]=array[i];
            }
            else{
                temp[i]=array[i];
            }
        }
        return temp;
    }
    public String[][] append(String[][] array, String[] addition){
        String[][] temp=new String[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public int[][] append(int[][] array, int[] addition){
        int[][] temp=new int[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
                temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public float[][] append(float[][] array, float[] addition){
        float[][] temp=new float[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public double[][] append(double[][] array, double[] addition){
        double[][] temp=new double[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public boolean[][] append(boolean[][] array, boolean[] addition){
        boolean[][] temp=new boolean[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public byte[][] append(byte[][] array, byte[] addition){
        byte[][] temp=new byte[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public long[][] append(long[][] array, long[] addition){
        long[][] temp=new long[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
    public char[][] append(char[][] array, char[] addition){
        char[][] temp=new char[array.length+1][array[0].length];
        for(int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        temp[temp.length-1]=addition;
        return temp;
    }
}