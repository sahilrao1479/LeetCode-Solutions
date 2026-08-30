class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        if(num1.length==0 && num2.length==0) return 0.0;
        int left=0,right=0;
        int arr[]=new int[num1.length+num2.length];
        int i=0;
        while(left<num1.length || right<num2.length){
          
            if(left==num1.length){
                arr[i++]=num2[right++];
            }
            else if(right==num2.length){
                arr[i++]=num1[left++];
            }
            else if(num1[left]<num2[right]){
                arr[i++]=num1[left++];
            }
            else{
                arr[i++]=num2[right++];
            }
            
            
        }
        if(arr.length%2==0){
            int mid1=arr.length/2;
            int mid2=(arr.length/2)-1;
            return (double)((arr[mid1]+arr[mid2])/2.0);
        }
        else{
            return (double)arr[arr.length/2];
        }
    }
}