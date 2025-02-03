import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> spiral = new ArrayList<>();
            // group the different rows together
            int top = 0, left = 0, bottom = matrix.length-1, right = matrix[0].length-1;

            while(left <= right && top <= bottom) {
                // move right
                for (int i = left; i <= right; i++) {
                    spiral.add(matrix[top][i]);
                }
                top++;

                // move down
                for (int i = top; i <= bottom; i++) {
                    spiral.add(matrix[i][right]);
                }
                right--;

                // move left
                // check if top <= bottom before decrementing bottom
                if(top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        spiral.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                // move up
                // check if left <= right before incrementing left
                if(left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        spiral.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return spiral;
        }
    }


