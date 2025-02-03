# Pascal's Triangle
## Prompt
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it

## Triangle Pattern
The first two rows of the triangle will always consist of 1s.

After the first two rows, the values on the ends of each row will remain 1s, but the other values will consist of the sums of the two values above it.

For example, if the triangle had 3 Rows, the first two rows would be all 1s, but the third row would have [1, 2, 1]. The 2 would result from the sum of the two 1s in the row above it.

## Test Cases
### Test Case 1
The first test case used 3 rows, like the example provided.
The output of this was: [[1], [1,1], [1, 2, 1]]

### Test Case 2
The second test case used 5 rows.
The output of this was: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]


# Spiral Matrix
## Prompt
Given an m x n matrix, return *all elements of the matrix in spiral order*

## Spiral Pattern
For every step, at each iteration the value at that index of the matrix is added to a list. <br> <br>

1. The spiral starts from the top left of the matrix, or at matrix[0][0]. <br> <br>
2. From there, it moves to the right, to matrix[0][matrix[0].length-1]. <br> <br>
3. Once it reaches the end of the first row, it goes down the rightmost column, to matrix[matrix.length-1][matrix[0].length-1]. <br> <br>
4. It then goes from the bottom right to the bottom left, to matrix[matrix.length-1][0]. <br> <br>
5. The final step of this pattern is to go back up, but not to the top left. Since the top left has already been added to the list, the bound for the top row will 
increment by 1. The new row that the pattern will reach in this step is matrix[1][0]. <br> <br>

This pattern will loop, incrementing the bounds for the top row and left column and decrementing the bounds for the bottom row and right column each 
time they are passed through, until the pattern reaches the final value to add to the list.

## Test Cases
### Test Case 1
The first test case used the matrix: {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}}
The output of this was: [1, 2, 3, 7, 11, 10, 9, 5, 6]

### Test Case 2
The second test case used the matrix: {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
The output of this was: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]

