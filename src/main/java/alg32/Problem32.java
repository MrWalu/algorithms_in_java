package alg32;

public class Problem32 {
    public static boolean arbitrage(double[][] table){
        for(int i=0 ; i< table.length ; i++)
            for(int j=0; j<table[0].length ; j++)
                table[i][j] = -Math.log(table[i][j]) / Math.log(2);

        int v = table.length;

        for(int k=0 ; k<v ; k++)
            for(int i= 0 ; i<v ; i++)
                for(int j= 0 ; j<v ; j++)
                    table[i][j] = Math.min(table[i][j], table[i][k] + table[k][j]);

        for( int i = 0 ; i<table.length ; i++)
            if (table[i][i] < 0.0)
                return true;

        return false;
    }
    public static void main(String[] args) {
        Problem32 pr32 = new Problem32();

        double[][] matrix = {
                {1, 1.28, 0.82},
                //{0.78, 1, 0.65},
                //{1.21, 1.55, 1}
                //{1,1},{1,1}
        };

        System.out.println(pr32.arbitrage(matrix));
    }
}
