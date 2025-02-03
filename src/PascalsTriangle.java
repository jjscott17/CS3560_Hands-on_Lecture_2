import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // initialize rows will 1s
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }

            // add the two above values to get sum value
            // ends of each row do not get summed, but are used to calculate the sums of other values
            for (int j = 1; j <= i - 1; j++) {
                int valueAboveLeft = triangle.get(i - 1).get(j - 1);
                int valueAboveRight = triangle.get(i - 1).get(j);
                int sum = valueAboveLeft + valueAboveRight;
                row.set(j, sum);
            }
            // add each row to the triangle
            triangle.add(row);
        }
        return triangle;
    }
}
