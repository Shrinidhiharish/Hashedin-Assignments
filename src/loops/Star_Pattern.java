package loops;

import java_DayOne_Assignments.Base;

public class Star_Pattern extends Base {
	public static void main(String[] args) {

		int rows = 0;
		int column = 0;
		int squareSide = 0;

		System.out.println("Enter the number of sides for square");
		squareSide = scan.nextInt();

		System.out.print("\n");
		//Loop for the number of rows
		for (rows = 1; rows <= squareSide; ++rows) {
			//Loop for the number of columns
			for (column = 1; column <= squareSide; ++column) {
				//Condition for the boundary and the diagonal
				if ((rows == 1) || (rows == squareSide) || (column == 1) || (column == squareSide) || (rows == column)
						|| (column == (squareSide - rows + 1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
