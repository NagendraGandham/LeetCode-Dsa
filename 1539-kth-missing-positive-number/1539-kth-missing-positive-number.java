class Solution {
    public int findKthPositive(int[] arr, int k) {
      int positive,count=0;
      int j=0,i,ele=1;
      positive=Math.abs(arr[arr.length-1]-arr.length);
      System.out.println(positive);
      if(positive==0){
        return arr[arr.length-1]+k;
      }
      for(i=1;i<arr[arr.length-1];i++){
        if(arr[j]==i){
            j++;
            continue;
        }
        else{
            count++;
            ele=i;
            if(count==k){
                break;
            }
        }
      }
      if(count!=k){
        return arr[arr.length-1]+(k-positive);
      }
      return ele;
    }
}