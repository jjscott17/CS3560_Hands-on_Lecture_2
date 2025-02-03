public class TestCases {
    public static void main(String args[]) {
        System.out.println("Pascal's Triangle Tests:\n");
        // Test Case 1: 3
        System.out.println("Test 1: "+PascalsTriangle.generate(3));
        System.out.println("Expected output: [[1], [1,1], [1, 2, 1]]\n");

        // Test Case 2: 5
        System.out.println("Test 2: "+PascalsTriangle.generate(5));
        System.out.println("Expected output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]\n");

        System.out.println("\nSpiral Matrix Tests:");
        // Test Case 1: {{1,2,3},{5,6,7},{9,10,11}}
        int matrix1[][] = new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        System.out.println("Test 1: "+SpiralMatrix.spiralOrder(matrix1));
        System.out.println("Expected output: [1, 2, 3, 7, 11, 10, 9, 5, 6]\n");

        // Test Case 2: {{1,2,3,4},{5,6,7,8},{9,10,11,12}}
        int matrix2[][] = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("Test 2: "+SpiralMatrix.spiralOrder(matrix2));
        System.out.println("Expected output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
    }
}
