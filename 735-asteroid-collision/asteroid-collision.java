class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stack = new Stack <>();
        for(int i =0;i<asteroids.length;i++){
            //if stack is empty or positive  then insert
            if(stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
                while(!stack.isEmpty()){
                    int top =stack.peek();
                    if(top<0){
                        stack.push(asteroids[i]);
                        break;
                    }
                    int mod=Math.abs(asteroids[i]);
                        if(mod == top){
                            stack.pop();
                            break;
                        } else if(mod <top){
                            break;
                        } else{
                            stack.pop();
                            if(stack.isEmpty()){
                                stack.push(asteroids[i]);
                                break;
                            }
                        }
                    
                }
            }
        }
        int l =stack.size();
        int ansArray[]= new int [l];
        for(int i =l-1;i>=0;i--){
            ansArray[i]=stack.pop();

        }
        return ansArray;
        
    }
}