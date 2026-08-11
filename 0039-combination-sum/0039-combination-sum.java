class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        if(candidates.length==0){
            return list;
        }
        backtracking(candidates,0,new ArrayList<>(),list,target);
        return list;
    }

    void backtracking(int[] candidates,int index,List<Integer> current,List<List<Integer>> list,int target){
        if(index>=candidates.length || target<0){
            return;
        }
        if(target==0){
            list.add(new ArrayList<>(current));
            return;
        }

        current.add(candidates[index]);
        backtracking(candidates,index,current,list,target-candidates[index]);
        current.removeLast();
        backtracking(candidates,index+1,current,list,target);

    }
}