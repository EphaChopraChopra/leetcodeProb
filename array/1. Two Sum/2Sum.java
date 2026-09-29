class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n = nums2.length;
        int c[]= new int[m+n];
        int i=0,j=0;
        int k=0;
        for(k=0; k<m+n; k++){
            if(i<m && j<n){
                if(nums1[i]<=nums2[j]){
                c[k]=nums1[i];
                i++;
            }
            else if(nums2[j]<nums1[i]){
                c[k]=nums2[j];
                j++;
            }
            }
            
            else break;

        }
        while(i<m){
            c[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            c[k]=nums2[j];
            j++;
            k++;
        }
        int x=c.length;
        double median= x%2==0 ? (c[x/2] + c[(x/2)-1])/2.0 : c[x/2];
        return median;
        
    }
}