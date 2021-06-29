
public class ArrayDemo {

	public static void main(String[] args) {
		int nums[] = new int[4];
		
		/*nums[0] = 99;
		nums[1] = 59;
		nums[2] = 949;
		nums[3] = 9239;
		
		for(int i =0; i<4; i++)
		{
			System.out.println(nums[i]);
		}*/
		
		int a[] = {1,2,3,4};
		int b[] = {3,4,5,6};
		int c[] = {2,4,6,8};
		
		int d[][]= {a,b,c};
		
		for(int i=0;i<3;i++)
		{
			for(int j =0;j<4; j++)
			{
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
// for jagged array
		int a1[] = {1,2,3,4};
		int b1[] = {3,4,5};
		int c1[] = {2,4,6,8,3,4};
		
		int d1[][]= {a1,b1,c1};
		
		for(int i=0;i<d1.length;i++)
		{
			for(int j =0;j<d1[i].length; j++)
			{
				System.out.print(d1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("for each");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		System.out.println("2d array using enhansed for loop");
		
		for(int k[]: d1)
		{
			for(int l: k)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
