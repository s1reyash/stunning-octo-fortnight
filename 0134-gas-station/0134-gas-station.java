class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     int n=gas.length;
     int total =0; //difference betwn gas and cot 
     int surplus=0; //our index

     int start=0;   
    for(int i=0;i<n;i++){
        total +=gas[i]- cost[i] ;
        surplus +=gas[i]-cost[i] ;

        if(surplus <0){
            surplus=0;
            start =1+i;
        }
    }
    return (total < 0) ? -1 : start;
    }
}