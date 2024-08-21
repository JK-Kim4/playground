import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void preOrder(char [][]inputArray, int idx){
        char []temp = inputArray[idx];
        char rootValue = (char)(idx + 'A');

        //print (postOrder)
        System.out.print(rootValue);
        if(temp[0] != '.'){
            preOrder(inputArray, temp[0] - 'A');
        }
        if(temp[1] != '.'){
            preOrder(inputArray, temp[1] - 'A');
        }
    }

    public static void inOrder(char [][]inputArray, int idx){
        char []temp = inputArray[idx];
        char rootValue = (char)(idx + 'A');

        if(temp[0] != '.'){
            inOrder(inputArray, temp[0] - 'A');
        }
        //print (postOrder)
        System.out.print(rootValue);
        if(temp[1] != '.'){
            inOrder(inputArray, temp[1] - 'A');
        }
    }

    public static void postOrder(char [][]inputArray, int idx){
        char []temp = inputArray[idx];
        char rootValue = (char)(idx + 'A');

        if(temp[0] != '.'){
            postOrder(inputArray, temp[0] - 'A');
        }
        if(temp[1] != '.'){
            postOrder(inputArray, temp[1] - 'A');
        }
        //print (postOrder)
        System.out.print(rootValue);
    }



    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(bufferedReader.readLine());

        char [][]matrix = new char[rows][2];

        for(int i = 0; i < rows; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

            char rootValue = Character.toUpperCase(st.nextToken().charAt(0));
            char leftValue = Character.toUpperCase(st.nextToken().charAt(0));
            char rightValue = Character.toUpperCase(st.nextToken().charAt(0));

            matrix[rootValue - 'A'][0] = leftValue;
            matrix[rootValue - 'A'][1] = rightValue;

        }

        Main.preOrder(matrix, 0);
        System.out.println();
        Main.inOrder(matrix, 0);
        System.out.println();
        Main.postOrder(matrix, 0);

    }
}