class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        if(target==0){
            return list;
        }
        combination(candidates,new ArrayList<>(),list,0,target);
        return list;
    }

    public void combination(int[] arr,List<Integer> Tlist,List<List<Integer>> list,int index,int target){
        if(target==0){
            list.add(new ArrayList<>(Tlist));
            return;
        }
        if(target<0 || index>=arr.length){
            return;
        }

        Tlist.add(arr[index]);
        combination(arr,Tlist,list,index+1,target-arr[index]);
        Tlist.remove(Tlist.size()-1);
        while(index<arr.length-1 && arr[index]==arr[index+1]){
            index++;
            continue;
        }
        combination(arr,Tlist,list,index+1,target);

    }
}