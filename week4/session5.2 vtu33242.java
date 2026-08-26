import java.io.*;
import java.util.*;

public class Solution {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> values = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = rows - layer - 1;
            int right = cols - layer - 1;

            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                values.add(matrix.get(top).get(j));
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                values.add(matrix.get(i).get(right));
            }

            // Bottom row: right-1 -> left
            for (int j = right - 1; j >= left; j--) {
                values.add(matrix.get(bottom).get(j));
            }

            // Left column: bottom-1 -> top+1
            for (int i = bottom - 1; i > top; i--) {
                values.add(matrix.get(i).get(left));
            }

            int len = values.size();
            int rotation = r % len;

            int index = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                matrix.get(top).set(j, values.get((rotation + index) % len));
                index++;
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                matrix.get(i).set(right, values.get((rotation + index) % len));
                index++;
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                matrix.get(bottom).set(j, values.get((rotation + index) % len));
                index++;
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                matrix.get(i).set(left, values.get((rotation + index) % len));
                index++;
            }
        }

        // Print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix.get(i).get(j));

                if (j < cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);

        sc.close();
    }
}


Input (stdin)
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Your Output (stdout)
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
Expected Output
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
