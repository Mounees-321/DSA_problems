class Solution {

    void merge(int[] nums,int l,int r,int m)
    {
        int temp[] = new int[r-l+1];
        int i=l,j = m+1 , k=0;
        while(i<=m && j<=r)
        {
            int val;
            if(nums[i]<nums[j]){
                val = nums[i];
                i++;
            }
            else
            {
                val = nums[j];
                j++;
            }
            temp[k++] = val;
        }


        if(i<=m)
        {
            while(i<=m)
            {
                temp[k++] = nums[i++];
            }
        }
        else
        {
             while(j<=r)
            {
                temp[k++] = nums[j++];
            }
        }

        for(int s=0; s<temp.length; s++)
        {
            nums[l+s] = temp[s];
        }
    }


    void  mergeSort(int[] nums, int l, int r)
    {
        if(l<r)
        {
            int m = l +(r-l)/2;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,r);
            merge(nums,l,r,m);
        }

    }


    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}