package matrix;

public class zeroMatrix {
	public static void main(String[] args) {
		int[][] names = { { 0, 3, 5, 3 }, { 6, 2, 0, 1 }, { 3, 5, 6, 1 } };
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[0].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

		zero(names);
		System.out.println("******************");
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[0].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void zero(int[][] names) {
		boolean[] row = new boolean[names.length];
		boolean[] coloumn = new boolean[names[0].length];

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[0].length; j++) {
					if(names[i][j]==0) {
						row[i]=true;
						coloumn[j]=true;
					}
			}
		}
		
		for(int i=0;i<row.length;i++) {
			if(row[i]==true) {
				nullifyRow(names,i);
			}
		}
		
		for(int i=0;i<coloumn.length;i++) {
			if(coloumn[i]==true) {
				nullifyColoumn(names,i);
			}
		}
		
	}
	
	
	
	public static void nullifyRow(int[][] matrix, int row) {
		for(int i=0;i<matrix[0].length;i++) {
			matrix[row][i]=0;
		}
	}
	
	public static void nullifyColoumn(int[][] matrix, int coloumn) {
		for(int i=0;i<matrix.length;i++) {
			matrix[i][coloumn]=0;
		}
	}

}
