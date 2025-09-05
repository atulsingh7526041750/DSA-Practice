package implementationfolder;

public class Stack {
    int capacity;
    int stack[];
    int top;

    Stack(int capacity){
        this.capacity = capacity;
        stack = new int[capacity];
        top  = top -1;
    }

void push(int value){

        stack[++top] =value;

}

int pop(){

return stack[top--];


}

int peek(){
        return stack[top];
}

boolean isEmpty(){
return top == capacity-1;
}
int size(){
return top+1;
}

}
