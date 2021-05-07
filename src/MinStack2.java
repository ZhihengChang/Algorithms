class MinStack2 {

    private class LinkNode {
        int data;
        LinkNode next;
        int min = Integer.MAX_VALUE;

    }

    private int counter;

    private LinkNode head;

    /** initialize your data structure here. */
    public MinStack2() {
        this.head = new LinkNode();
        this.head.next = null;

        this.counter = 0;
    }

    public void push(int x) {

        LinkNode top = new LinkNode();
        top.next = head;
        top.data = x;
        if(top.data <= head.min) {
            top.min = top.data;
        }else{
            top.min = head.min;
        }
        head = top;

        counter++;
    }

    public void pop() {
        if (counter <= 0) {
            counter = 0;
            return;
        }

        LinkNode top = head;
        head = top.next;
        counter--;
        top = null;
        return;

    }

    public int top() {

        return head.data;
    }

    public int getMin() {
        return head.min;
    }

    public static void main(String[] args){
        MinStack2 ms = new MinStack2();
        ms.push(2147483646);
        ms.push(2147483646);
        ms.push(2147483647);
        System.out.println("top: " + ms.top());
        ms.pop();
        System.out.println("min: " + ms.getMin());
        ms.pop();
        System.out.println("min: " + ms.getMin());
        ms.pop();
        ms.push(2147483647);
        System.out.println("top: " + ms.top());
        System.out.println("min: " + ms.getMin());
        ms.push(-2147483648);
        System.out.println("top: " + ms.top());
        System.out.println("min: " + ms.getMin());
        ms.pop();
        System.out.println("min: " + ms.getMin());
    }
}
