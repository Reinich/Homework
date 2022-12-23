
FillDiagonal(matrix);
Output(matrix);









        //     if (i == 0 && j == 0)
        //     {
        //         matrix[i, j] = 0;
        //         CountOfRows++;
        //         j++;
        //     }
        //     if (j == 0)
        //     {
        //         matrix[i, j] = matrix[i - 1, j] + CountOfRows + 1;
        //         CountOfRows++;
        //         j++;
        //     }
        //     while (CountOfRows < matrix.GetLength(0))
        //     {
        //         matrix[i, j] = matrix[i, j - 1] + CountOfRows;
        //         CountOfRows++;
        //         j++;
        //     }
        //     matrix[i, j] = matrix[i, j - 1] + CountOfRows;
        // }
        // CountOfRows = i + 1;