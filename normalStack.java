public class normalStack {
    public static void main(String[] args) {
        myStack st = new myStack();

        st.push(1);
        st.push(2);
        st.push(1);
        // st.push(2);
        // st.push(1);
        // st.push(2);
        // st.push(1);
        // st.push(2);
        // st.push(1);
        // st.push(2);
        // st.push(1);
        // st.push(2);

       

    st.display();

    System.out.println(st.size());
    }

}

class myStack {
    int[] arr;
    int tos;

    myStack(int n) {
        arr = new int[n];
        tos = -1;
    }

    myStack(){   // this constrructor is for dynamic stack 
        arr = new int[10];
        tos = -1;
    }

    // public void push(int ele) {   // this is for normal stack 
    //     if (tos == arr.length - 1) {
    //         System.out.println("Stack is full");
    //     } else {
    //         tos++;
    //         arr[tos] = ele;
    //     }
    // }

    public void push(int ele) {  // this is for dynamic stack 
        if (tos == arr.length - 1) {
            int[] narr = new int[arr.length*2];

            for(int i=0;i<arr.length;i++){
                narr[i]=arr[i];
            }
              this.arr = narr;
            tos++;
            arr[tos] = ele;

        } else {
            tos++;
            arr[tos] = ele;
        }
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[tos];
            tos--;

            return ele;
        }
    }

    public int size() {
        return tos + 1;
    }

    public int peek() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int ele = arr[tos];

            return ele;
        }
    }

    public void display(){
         if (tos == -1) {
            System.out.println("Stack is empty");
           
        } else {
            for(int i=0;i<=tos;i++){
                System.out.print(arr[i] + "   ");
            }
            System.out.println();
        }
    }

}
