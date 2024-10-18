public class WaterTrapping {
 
	public static void main(String[] args) {
		
		int lmax =0 , rmax =0;
		int[] height = {4,2,0,3,2,5};
		//int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int left =0;
		int right = height.length-1;
		int total = 0;
		
		while(left <right)
		{
			if(height[left]<height[right])
			{
				if(height[left]>lmax)
				{
					lmax = height[left];
				}
				else
				{
					total = total + lmax - height[left];
				}
				left++;
			}
			else
			{
				if(height[right]>rmax)
				{
					rmax = height[right];
				}
				else
				{
					total = total + rmax - height[right];
				}
				right--;
			}
		}
		
		System.out.print(total);
		
		
			}
		}
	
