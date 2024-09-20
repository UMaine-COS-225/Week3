class Square {

    // Classes allows me to create a template.

    // In my previous example, I wanted my square to have a side

    // Therefore, I can create a variable to hold its side.
    // Let's ignore the `private` keyword for now
    private int side;

    // I also wanted to give it a name and color so I created two more variables
    private String name, color;

    // I also wanted to do three operations:
    // - calculate perimeter
    // - calculate area
    // - print its details

    /**
     * Calculates the perimeter of the square.
     * 
     * @return The perimeter of the square
     */
    public double getPerimeter() {
        return 4 * side;
    }

    /**
     * Calculates the area of the square
     * 
     * @return The area of the square
     */
    public double getArea() {
        return side * side;
    }

    /**
     * Print the area of the ssquare
     */
    public void printSquareDetails() {
        System.out.println("The square " + name + " has a side of " + side + " and a color of " + color);
        System.out.println("The perimeter of " + name + " is " + getPerimeter());
        System.out.println("The area of " + name + " square is " + getArea());
    }

    // I have copied the functions from `Shape.java` with minimal modifications!

    // I need to create a way to fill the template!

    // The following "function" is called a constructor - it constructs objects
    public Square(int side, String name, String color) {
        this.side = side;
        this.name = name;
        this.color = color;
    }

    // Now let's try to use this class in a different java file

    // I can create multiple constructors based on how I want to instantiate objects
    public Square() {
        this.side = 10;
        this.name = "John";
        this.color = "Blue";
    }

}