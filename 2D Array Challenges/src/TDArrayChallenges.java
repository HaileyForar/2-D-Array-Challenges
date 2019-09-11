import java.lang.reflect.Array;

public class TDArrayChallenges
	{

		static int[][] myArray = 
					{
						{3,5,9,2,1,8,13},
						{2,5,1,11,8,2,0},
						{9,1,3,4,8,4,8},
						{6,0,0,1,4,12,7},
						{2,6,1,5,3,10,0},
						{2,5,1,7,9,2,3},
						{3,1,1,4,11,12,4}
								
					};
		
		public static void main(String[] args)
			{
				challenge1();
				challenge2();
				challenge3();
			}
		
		//Printing the largest number in the array
		public static void challenge1()
		{
			int maxValue = 0;
			
			System.out.println("The program will print the largest number in the array.");
			
			for(int row = 0; row < myArray.length; row++)
			{
				for(int col = 0; col < myArray[row].length; col++)
				{
					if(myArray [row][col] > maxValue)
					{
						maxValue = myArray[row][col];
					}
				}
			}
			
			System.out.println("The maximum value in the array is " + maxValue);
		}
		
		//Printing the smallest number in the array
		public static void challenge2()
		{
			int minValue = 0;
			
			System.out.println("The program will print the smallest number in the array.");
			
			for(int row = 0; row > myArray.length; row++)
			{
				for(int col = 0; col > myArray[row].length; col++)
				{
					if(myArray [row][col] < minValue)
					{
						minValue = myArray[row][col];
					}
				}
			}
			
			System.out.println("The minimum value in the array is " + minValue);
		}
		
		//Printing the average of all the numbers in the array
		public static void challenge3()
		{
			double total = 0;
			int totalLength = 0;
			
			System.out.println("The program will calculate the average of all the numbers in the array.");
			
			for(int row = 0; row < myArray.length; row++)
			{
				for(int col = 0; col < myArray[row].length; col++)
				{
					total += myArray[row][col];
					totalLength++;
				}
			}
			
			System.out.println("The average of all the numbers in the array " + total / totalLength);
		}

	}
