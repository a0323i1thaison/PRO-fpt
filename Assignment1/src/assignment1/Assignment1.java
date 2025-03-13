package assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        PlanetStack planetStack = new PlanetStack(5);

        planetStack.push(new Planet("Mercury", 0.055, 4879));
        planetStack.push(new Planet("Venus", 0.815, 12104));
        planetStack.push(new Planet("Earth", 1.0, 12742));
        planetStack.push(new Planet("Mars", 0.107, 6779));
        planetStack.push(new Planet("Jupiter", 317.8, 139820));

        // Display the stack
        planetStack.printStack();

        // Pop a planet
        System.out.println("\nPopping planet: " + planetStack.pop());

        // Peek at the top planet
        System.out.println("\nTop of stack: " + planetStack.peek());
    }

}
