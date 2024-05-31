package OOWN;

public class rotate {
    public static void main(String[] args) {
        left l = new left();
        right r = new right();
        
        int[] left = {1, 2, 3, 4, 5, 6, 7};
        int[] right = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        
        System.out.println("Original array:");
    	System.out.println();
    	for (int num : left) {
    		System.out.print(num + " ");
    		}
            System.out.println();
        
        l.rotate(left, k);
        r.rotate(right, k);
        
        l.display(left);
        r.display(right);
    }
}


class left {

    
	//reverse 0 to k-1 array
	//reverse k to entire array
	//reverse entire array
	
	public static void swap(int[] nums,int a,int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	public static void reverse(int[] nums,int start,int end) {
		while(start<end) {
			swap(nums,start,end);
			start++;
			end--;
		}
	}
	
	public void display(int[] nums) {
		System.out.println("Array after left rotation:");
		System.out.println();
		for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
	
	public void rotate(int[] nums,int k) {
		int n=nums.length-1;
		reverse(nums,0,k-1);
		reverse(nums,k,n);
		reverse(nums,0,n);
	}
}


class right{
	
	//reverse entire array
	//reverse o to k-1 array
	//reverse k to entire array
	
	public static void swap(int[] nums,int a,int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	public static void reverse(int[] nums,int start,int end) {
		while(start<end) {
			swap(nums,start,end);
			start++;
			end--;
		}
	}

	public void display(int[] nums) {
		System.out.println("Array after right rotation:");
		System.out.println();
		for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
	
	public void rotate(int nums[],int k) {
		int n=nums.length-1;
		reverse(nums,0,n);
		reverse(nums,0,k-1);
		reverse(nums,k,n);
	}
}
