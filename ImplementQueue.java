public class ImplementQueue {
    public static void main(String[] args) {
        myQueue q = new myQueue(1);

        q.add(1);

        // q.add(2);

        // q.display();
        // System.out.println(q.size);

        q.remove();
        q.remove();

    }

}

class myQueue {
    int[] arr;
    int size;

    myQueue(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    myQueue(){
         this.arr = new int[size];
        this.size = 10;
    }

    public void add(int ele) {

        if (this.size == arr.length) {
           int[] narr= new int[arr.length*2];


           for(int i=0;i<arr.length;i++){
            narr[i]=arr[i];
           }

           arr=narr;
           arr[size] = ele;
            size++;


        } else {

            arr[size] = ele;
            size++;
        }
    }

    public int remove() {

        if (this.size == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int ele = arr[0];

            for (int i = 1; i < this.size; i++) {
                arr[i - 1] = arr[i];
            }
            this.size--;
            return ele;
        }

    }

    public int peek() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[0];
        }
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
    }

}
