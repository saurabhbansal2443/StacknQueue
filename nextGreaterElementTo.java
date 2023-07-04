import java.util.Stack;


// GFG Question 
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
public class nextGreaterElementTo {
    public static void main(String[] args) {
        
    }
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st = new Stack<>();
        
        long[] ans = new long[arr.length];
        
        ans[arr.length-1]=-1;
        
        st.push(arr[n-1]);
        
        for(int i = n-2;i>=0;i--){
            
            long ele = arr[i];
            
            if(st.size()!=0 && ele>=st.peek()){
                st.pop();
            }
            
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            
            st.push(ele);
            
        }
        return ans ;
}
}
