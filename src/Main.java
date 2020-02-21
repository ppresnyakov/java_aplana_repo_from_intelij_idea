import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int Lines,Columns;
        System.out.println("Введите количество строк матрицы:");
        Scanner in = new Scanner(System.in);
        Lines = in.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        Columns = in.nextInt();

        int MyArray[][] = new int[Lines][Columns];

        for (int i = 0; i<Lines; i++ ){
            for (int y = 0; y<Columns; y++ ) {
                System.out.println("Введите элемент матрицы, строка " + i + " столбец " + y  );
                MyArray[i][y] = in.nextInt();
            }
        }
        System.out.println("Первая строка матрицы: ");
        for (int i= 0; i<Columns; i++ ){
            System.out.print(MyArray[1][i]+ " ");

        }
    }
    }


