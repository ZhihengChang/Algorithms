import java.util.ArrayList;
import java.util.List;

class MinStack {

    /** initialize your data structure here. */
    private List<Integer> stack;
    private int min;
    private int min_index;
    private int count;
    public MinStack() {
        this.stack = new ArrayList<Integer>();
        this.min = Integer.MAX_VALUE;
        this.min_index = 0;
        this.count = 0;
    }

    public void push(int x) {
        stack.add(x);
        if(x <= this.min){
            min = x;
            min_index = count;
        }
        count++;
    }

    public void pop() {
        if(!stack.isEmpty()){
            if(stack.remove(count-1) == min){
                min = Integer.MAX_VALUE;
                min_index = -1;
                for(int i=0; i<stack.size(); i++){
                    if(stack.get(i) <= min){
                        min = stack.get(i);
                        min_index = i;
                    }
                }
            }
            count--;
        }
    }

    public int top() {
        return stack.get(count-1);
    }

    public int getMin() {
        if(min_index >= 0)
            return stack.get(min_index);
        return 0;
    }

    public static void main(String[] args){
        MinStack ms = new MinStack();
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


