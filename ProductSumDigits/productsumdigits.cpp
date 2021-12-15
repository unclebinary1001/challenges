class Solution {
public:
    int subtractProductAndSum(int n) {
       
        int sum = 0;
        int product = 1;
        while (n>0){
            int res = n%10;
            sum += res;
           
            product *= res;
            n = n/10;
           
        }
        return (product-sum);
    }
}




