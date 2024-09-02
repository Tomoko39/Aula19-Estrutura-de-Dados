package stack;

public class Main {
    public static void main(String[] args) {
        try {
            Stack stack = new ArrayStack(5);

            for(int i = 0; i < 5; i++) {
                stack.push(i + 1);
                System.out.println(stack);
            }

            while(!stack.isEmpty()) {
                System.out.println("Popping: " + stack.pop());
                System.out.println(stack);
            }
            stack.pop();
            System.out.println("Cheguei aqui");
        } catch(StackFullException e) {
            e.printStackTrace();
        } catch(StackEmptyException e) {
            e.printStackTrace();
        }
    }
}

