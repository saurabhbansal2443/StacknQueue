// public class myStackBuild {
//     public static void main(String[] args) {
//         MyStack st = new MyStack(2);

//         st.push(1);
//         //st.display();
//         st.push(2);
//         //st.display();
//         //st.push(3);
//         //st.display();

//         st.pop();
//          st.display();
//         st.pop();
//          st.display();
//         st.pop();
//          st.display();
        
        
//     }
// }

// class MyStack{

//     int tos;
//     int[] arr ;

//      MyStack(int n){
//       this.tos = -1;
//       this.arr = new int[n];
//     }

//     public void push(int ele){
//         if(tos==arr.length-1){
//             System.out.println("Stack is already filled");
//             return ;
//         }else{
//             tos++;
//             arr[tos]=ele;
//         }
//     }

//     public int pop(){
//         if(tos==-1){
//             System.out.println("Stack is Empty");
//             return -1;
//         }else{
//             int ans = arr[tos];
//             tos--;
//             return ans ;
//         }
//     }

//     public int size(){
//         return tos+1;
//     }

//     public void display(){

//       for(int i=tos;i>=0;i--){
//         System.out.print(arr[i] + "  ");
//       } 
//       System.out.println(); 
//     }
// }
