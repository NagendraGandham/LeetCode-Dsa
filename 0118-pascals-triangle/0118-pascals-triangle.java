class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows==0){
            return List.of();
        }
        if(numRows==1){
            return List.of(List.of(1));
        }
        if(numRows==2){
            return List.of(List.of(1),List.of(1,1));
        }
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list.add(List.of(1));
        list.add(List.of(1,1));
        for(int i=3;i<=numRows;i++){
            List<Integer> l=list.get(list.size()-1);
            list1.add(l.get(0));
            for(int j=0;j<l.size()-1;j++){
                list1.add((l.get(j)+l.get(j+1)));
            }
            list1.add(l.get(0));
            list.add(new ArrayList<>(list1));
            list1.clear();
        }
        return list;
    }
}