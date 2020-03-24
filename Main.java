package HW_2;

import java.util.Arrays;
import java.util.Random;

public class Main {

	
	public static void main(String[] args){
		
		  System.out.println("----------------------------------------------------------------------------------Soru1"); 
		  
		  System.out.println("--old version of array--");
		
		int[][] array = new int[5][5];
		
		   for(int i=1;i<array.length;i++){
	        	for(int j=1;j<array[0].length;j++){
	        		Random random = new Random();
					int number = random.nextInt(2);
					array[i][j] = number;
					System.out.print(array[i][j]+"  " );
	        	}
	        	System.out.println("  " );
		   }
          
        int[][] newArray = new int [array.length-1][array[0].length-1];
       
        for(int i=1;i<array.length-1;i++){
        	for(int j=1;j<array[0].length-1;j++){
        		
        		
        		
        		 int count=0;
        		   
        		 for(int k=-1;k<2;k++){
        			 for(int n=-1;n<2;n++){
        				 count +=array[i+k][j+n];
        			 }
        		 }
        			
        		 count =count-array[i][j];
        		 
        		 if (((array[i][j] == 1) && (count < 2))||((array[i][j] == 1) && (count > 3))) {
 					newArray[i][j] = 0;
 				} else if ((array[i][j] == 0) && (count==3)) {
 					newArray[i][j] = 1;
 				} else {
 					newArray[i][j] = array[i][j];
 				}
        		
        			
        		
        	}
        	
        }
        
        System.out.println("--new version of array--");
       
        for(int i=0;i<newArray.length;i++){
        	for(int j=0;j<newArray[0].length;j++){
        		System.out.print(newArray[i][j]+"  " );
        	}
        	 System.out.println();
        	
        }	
        
        System.out.println("----------------------------------------------------------------------------------Soru2"); 
        
        int [][] multiArray= new int [][]{
            {1,2,3,4,5},
            {16,17,18,19,6},
            {15,24,25,20,7},
            {14,23,22,21,8},
            {13,12,11,10,9},
            
        };
        
        int[] linearArray=new int[multiArray.length*multiArray[0].length];
        int k=0;
        System.out.println("--old version of array--");
        for(int i=0; i<multiArray.length; i++) {
        	for(int j=0;j<multiArray[0].length;j++){
        		
        		linearArray[k]=multiArray[i][j];
        		k++;
    			
        		System.out.print(multiArray[i][j]+"  " );
        	}
        	 System.out.println();
        }
        for (int i = 0; i < linearArray.length; i++) {
            int min = linearArray[i];
            int minId = i;
            for (int j = i+1; j < linearArray.length; j++) {
                if (linearArray[j] < min) {
                    min = linearArray[j];
                    minId = j;
                }
            }
            // swapping
            int temp = linearArray[i];
            linearArray[i] = min;
            linearArray[minId] = temp;
        }
        System.out.println("--new version of array -- with selection sort");
        
        for(int i=0;i<linearArray.length-1;i++){

    		System.out.print(linearArray[i]+"  " );
        	
        }

        System.out.println(" "); 
        System.out.println("----------------------------------------------------------------------------------Soru3"); 
        Random random = new Random();
        System.out.println("First Matrix is : "); 
        int rn = random.nextInt(10)+1;
        int rn3 = random.nextInt(10)+1;
        int[][] firstMatrix=new int[rn3][rn];
        
        for(int i=1;i< firstMatrix.length;i++){
        	for(int j=1;j<firstMatrix[0].length;j++){
        		
				int number = random.nextInt(11);
				 firstMatrix[i][j] = number;
				System.out.print( firstMatrix[i][j]+"  " );
        	}
        	System.out.println("  " );
	   }
        System.out.println("  " );
        System.out.println("Second Matrix is : "); 
        int rn2 = random.nextInt(10)+1;
        int[][] secondMatrix=new int [firstMatrix[0].length][rn2];
        for(int i=1;i< secondMatrix.length;i++){
        	for(int j=1;j<secondMatrix[0].length;j++){
        		
				int number = random.nextInt(11);
				secondMatrix[i][j] = number;
				System.out.print( secondMatrix[i][j]+"  " );
        	}
        	System.out.println("  " );
	   }
        
        System.out.println("");
        
        int[][] resultMatrix=new int [firstMatrix.length][secondMatrix[0].length];
        
        for(int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int z = 0; z < secondMatrix.length; z++) {
                    resultMatrix[i][j] += firstMatrix[i][z] * secondMatrix[z][j];
                }
            }
        }
        
      
        System.out.println("Result Matrix is : "); 
        
        for(int i=1;i< resultMatrix.length;i++){
        	for(int j=1;j< resultMatrix[0].length;j++){
        		
				System.out.print( resultMatrix[i][j]+"  " );
        	}
        	System.out.println("  " );
	   }
        
        System.out.println("");
        

        
        
        System.out.println("----------------------------------------------------------------------------------Soru4"); 
       

		int[] repeatArray = new int[10];
		for(int i=0; i<repeatArray.length; i++) {
			
			int number = random.nextInt(101);
			repeatArray[i] = number;
		}
		System.out.println("Our array: "); 
		for(int i=0; i<repeatArray.length; i++) {
			  System.out.print(repeatArray[i]+" "); 
		}
		System.out.println(" "); 
		System.out.print("repeating numbers : ");
		
		for(int i=0;i<repeatArray.length;i++){
			for(int j=i+1;j<repeatArray.length;j++){
				if(repeatArray[i]==repeatArray[j]){
					System.out.print(repeatArray[j]+",");
					
				}
			}
			
				
			
		}
		
		
        
	}
}
