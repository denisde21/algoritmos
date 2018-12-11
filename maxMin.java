import java.util.Scanner;

 

public class maxMin{

	public static void main(String[] ARGS){

		int[][] myList = {{5,4,8,6,3,2,9},
						{8,1,10,7,6,25,71},
						{100,0,5,7,6,5,8}};

		int i, j, max, min, suma;

		min=max=myList[0][0];

		
		for(i = 0; i < myList.length; i++){
			for(j=0; j<myList[0].length; j++){
				if(min>myList[i][j]){
					min=myList[i][j];
				}

				if(max<myList[i][j]){
					max=myList[i][j];
				}
			}
			

		}

		System.out.println("El máximo es " + max + " y el minimo es " + min);

	}

}