//Your task, is to create N×N multiplication table, of size provided in parameter.
public class MultiplicacionTable {

    public static void main(String[] args) {
        int n=3;
        int[][] table=Multiplication.multiplicationTable(n);
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.println(table[i][j]);
            }
        }
    }
}


 class Multiplication{
    public static int [][] multiplicationTable(int n){

        int[][] table=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }
}