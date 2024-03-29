public class Bird {
    private String name;

    // Constructor with no parameters
    public Bird() {
        this.name = "Unknown Bird";
    }

    // Constructor with name parameter
    public Bird(String name) {
        this.name = name;
    }

    // Method to display the name of the bird
    public void displayBirdName() {
        System.out.println("Bird Name: " + name);
    }

    public static void main(String[] args) {
        // Create Bird objects using different constructors
        Bird unknownBird = new Bird();
        Bird parrot = new Bird("Parrot");
        Bird sparrow = new Bird("Sparrow");

        // Display the names of birds
        unknownBird.displayBirdName();
        parrot.displayBirdName();
        sparrow.displayBirdName();
    }
}
