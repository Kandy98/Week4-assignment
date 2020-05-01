package arrays;

public class Matrix {

	int n,m;
	int[][] arr = new int[n][m];
	
	public Matrix() {
		n = 3;
		m = 3;
	}
	
	public Matrix(int[][] mat) {
		this.n = mat.length;
		this.m = mat[0].length;
		this.arr = mat;
	}
	
	public Matrix(Matrix mat) {
		this.n = mat.n;
		this.m = mat.m;
		this.arr = mat.arr;
	}
	
	public void read() {
		System.out.println("Enter size (m,n) of the array: ");
		n = Scan.sc.nextInt();
		m = Scan.sc.nextInt();
		
		System.out.println("Enter elements of the array: ");
		for(int i=0; i<n; i++) 
			for(int j=0; j<m ;j++ )
				arr[i][j] = Scan.sc.nextInt();
	}
	
	public void display() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] sun(int sec[][]) {
		int[][] su = new int[n][m];
		
		for(int i=0; i<n; i++) 
			for(int j= 0; j<m; j++)
				su[i][j] = this.arr[i][j] + sec[i][j];
		
		return su;
	}
	
	public boolean isScalar() {

		if (arr.length == arr[0].length) {
			int element = arr[0][0];
			
			for (int i = 1; i < n; i++) 
				for (int j = 1; j < m; j++) 
					if (element != arr[i][j]) 
						return false;
		}
		else 
			return false;

		return true;

	}

	
	public int getN() {
		return n;
	}

	public int getM() {
		return m;
	}

	public int[][] getArr() {
		return arr;
	}

	public void multiply(int sec[][]) {
		int resultMatrix[][] = new int[n][sec[0].length];

		if (sec.length == m) {

			for (int i = 0; i < resultMatrix.length; i++) {
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < resultMatrix[0].length; k++) {
						resultMatrix[i][k] += arr[i][j] * sec[j][k];
					}
				}
			}

		} else {
			System.out.println("Multiplication not possible");
		}

		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
