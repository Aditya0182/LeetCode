class Solution {
    static long count(int n) {
    // code here
    long edges = (long)n*(n-1)/2;
    return (long) Math.pow(2,edges);
    

  }
}