import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// try hash map implementation
// debug code presented to class

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            // fix this for loop
            // change made: bound changed from j<=i to j<=i-1
            for (int j = 1; j <= i - 1; j++) {
                int valueAboveLeft = triangle.get(i - 1).get(j - 1);
                int valueAboveRight = triangle.get(i - 1).get(j);
                int sum = valueAboveLeft + valueAboveRight;
                row.set(j, sum);
            }
            triangle.add(row);
        }
        return triangle;
    }
}
