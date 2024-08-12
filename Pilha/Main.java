public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(5);


        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("Pilha cheia? " + stack.isFull());
        System.out.println("Pilha vazia? " + stack.isEmpty());


        System.out.println("Removendo: " + stack.pop());
        System.out.println("Pilha cheia? " + stack.isFull());

        stack.push(6);
        System.out.println("Pilha cheia? " + stack.isFull());


        stack.clear();
        System.out.println("Pilha limpa");
        System.out.println("Pilha vazia? " + stack.isEmpty());
    }
}
