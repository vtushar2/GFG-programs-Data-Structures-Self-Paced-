class Solution {
  public:
    int subClock(int num1, int num2) {
        // code here
        int sub=(num1-num2)%12;
        if(sub<0)
        {
            return(sub+12);
        }
        return sub;
    }
};
