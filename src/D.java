import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class D{
    public static void main(String[] args) throws  IOException{

       System.println("hello");





    }}





















































    static class FastScanner {

        private BufferedReader in;
        public String[] line;
        private int index;
        private int size;

        public FastScanner(InputStream in) throws IOException {
            this.in = new BufferedReader(new InputStreamReader(in));
            init();
        }

        public FastScanner(String file) throws FileNotFoundException,IOException {
            this.in = new BufferedReader(new FileReader(file));
            init();
        }

        private void init() throws IOException {
            line = in.readLine().split(" ");
            index = 0;
            size = line.length;
        }

        public int nextInt() throws IOException {
            if (index == size) {
                init();
            }
            return Integer.parseInt(line[index++]);
        }

        public long nextLong() throws IOException {
            if (index == size) {
                init();
            }
            return Long.parseLong(line[index++]);
        }

        public float nextFloat() throws IOException {
            if (index == size) {
                init();
            }
            return Float.parseFloat(line[index++]);
        }

        public double nextDouble() throws IOException {
            if (index == size) {
                init();
            }
            return Double.parseDouble(line[index++]);
        }

        public String next() throws IOException {
            if (index == size) {
                init();
            }
            return line[index++];
        }

        public String nextLine() throws IOException {
            if (index == size) {
                init();
            }
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < size; i++) {
                sb.append(line[i]).append(" ");
            }
            index=size;
            return sb.toString();
        }

        private  int[] nextIntArray(int n) throws IOException {
            int[] tab = new int[n];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = nextInt();
            }
            return tab;
        }

        private double[] nextDoubleArray(int n) throws IOException {
            double[] tab = new double[n];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = nextDouble();
            }
            return tab;
        }

    }

}