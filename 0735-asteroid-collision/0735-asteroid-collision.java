class Solution {
    public int[] asteroidCollision(int[] a) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(int ele:a){
            boolean collided=false;

            while(!stack.isEmpty() && ele<0 && stack.peek()>0 &&
            stack.peek()<Math.abs(ele)){
                stack.pop();
            }
            if(!stack.isEmpty() && (ele!=stack.peekFirst() && ele<0 && Math.abs(ele)==Math.abs(stack.peek())) ){
                stack.pop();
                collided=true;
            }
            if(!stack.isEmpty() && ele<0 && stack.peek()>0 && stack.peek()>Math.abs(ele)){
                collided=true;
            }
            if(collided==false){
                stack.push(ele);
            }

            }
            int[] arr=new int[stack.size()];
            for(int i=0;i<arr.length;i++){
                arr[i]=stack.removeLast();
            }
            return arr;
        }
    }
