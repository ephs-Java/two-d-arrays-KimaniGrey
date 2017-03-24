
import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		
		int [][] nums = new int[3][5];
		
		int[] numsNext = {1};
		
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 5, 10);
		// test each method you create below.
		printArray(nums);
		
		System.out.println(sumRow(nums,0));
		
		System.out.println(nums.length);
		
		System.out.println(arrayToString(rowSums(nums)));
		
		System.out.println(haveRepeats(numsNext));
		
		System.out.println(min(nums));
		
		System.out.println(max(nums));
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	
	public static void fillRandom(int[][] nums, int low, int high){
		
		Random random = new Random();
		
		for(int r = 0; r<nums.length; r++){
			for(int c = 0; c<nums[0].length;c++){
				
				nums[r][c] = random.nextInt(high) + low;
				
			}
		}
	}
	
	/*
	 * create a method that prints a 2D array
	 */

	public static void printArray(int[][] nums){
		
		for(int r = 0; r<nums.length; r++){
			
			System.out.print(" { ");
			
			for(int c = 0; c<nums[0].length;c++){
				
				System.out.print(nums[r][c] + " ,");
				
			}
		
			System.out.println(" } ");
		
	}
	
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	
		public static int sumRow(int[][] nums, int row){
			
			int total = 0;
			
			for(int c = 0; c<nums[0].length; c++){
				
				total += nums[row][c];
				
			}
			
			return total;
			
		}
	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	
		 public static int[] rowSums(int[][] nums){
		 
		
		int[] sums = new int[nums.length];	
			
		for(int c = 0; c<nums.length; c++){
			
		int total = sumRow(nums, c);
			
			sums[c] = total;
			
		}

		return sums;
	
		 }
		 
		 public static String arrayToString(int[] printee){
			 
			 String a = "{";
			 
			 for(int index: printee){
				 
				 a = a + index + ", ";
				 
			 }
			 
			 a = a + "}";
		 
			 return a;
			 
		 }
		 
		
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	
		 public static boolean haveRepeats(int[] nums){
			 
			 int[] newNums = new int[nums.length];
			 
			 for(int i = 0;i<nums.length;i++){
				 
				newNums[i] = nums[i]; 
				 
			 }
			 
			 int count = 0;
			 
			 System.out.println(newNums[0]);
			 
			 for(int index: newNums){
				 
				 
				 for(int indexx: nums){
					 
					 if(index==indexx){
						 
						 count++;
						
					 }
					 
					 
					 if(count>=2){
						 
						 return false;
						 
					 }
					 
				 }
				 
				 count = 0;
				 
			 }
			 
			 return true;
			 
		 }
	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	
		 public static int getIndex(int[] nums, int x){
			 
			 for(int i = 0; i<nums.length;i++){
				 
				 if(nums[i]==x){
					 
					 return i;
					 
				 }
				 
			 }
			 
			 return -1;
			 
		 }

	
	
	/*
	 * return the min value in a 2D array
	 */
	

		public static int min(int[][] nums){
			
			int min = nums[0][0];
			
			for(int i = 0; i<nums.length;i++){
				
				for(int p = 0; p<nums[0].length;p++){
					
					min = Math.min(min, nums[i][p]);
					
				}
				
			}
			
			return min;
			
		}
	
	
	
	/*
	 * return the max value in a 2D array
	 */
	
		
	public static int max(int[][] nums){
			
			int max = nums[0][0];
			
			for(int i = 0; i<nums.length;i++){
				
				for(int p = 0; p<nums[0].length;p++){
					
					max = Math.max(max, nums[i][p]);
					
				}
				
			}
			
			return max;
			
		}
	
	
	
		
}

