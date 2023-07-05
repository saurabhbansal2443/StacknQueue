public class normalStack {
    public static void main(String[] args) {
        myStack2 st = new myStack2(5);

        st.push(1);
        st.push(2);
         

        int ele = st.peek();

        System.out.println(ele);
    }

}

class myStack2 {
    int[] arr;
    int tos;

    myStack2(int n) {
        arr = new int[n];
        tos = -1;
    }

    public void push(int ele) {
        if (tos == arr.length - 1) {
            System.out.println("Stack is full");
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
