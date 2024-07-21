package arrays;

public class Exercise6_ThreeDim1 {

	public static void main(String[] args) {
		
		// Print :
		int[][][] t = {
				{{1,-2},{2,3}}, 
				{{-4,-5},{1,2}}
		};
		
		for (int i=0;i<t.length;i++) {
            for (int j=0;j<t.length;j++) {
                for(int k=0;k<t.length;k++) {
                    System.out.print(t[i][j][k] + " ");
                }
                System.out.println(" ");
            }
        }
	}
}
