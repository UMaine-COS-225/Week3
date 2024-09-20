import java.util.ArrayList;

class ObjectOrientedShapes {

    public static void main(String[] args) {

        // Let's try to create multiple squares, calculate their
        // perimeter and area, and print their details.

        // I already have a template in `Square.java`, here I am creating
        // an instance of Square. We call this instance of Square as an object

        // Square squareTwo = new Square(15, "sqaureTwo", "Blue");

        // System.out.println(squareTwo.getArea());

        Square squareOne = new Square(10, "SquareOne", "Red");
        squareOne.printSquareDetails();

        // In the above line, `Square` is a class, and `squareOne` is an object.
        // Note that we are using `Square` as a type!
        // Let's try to comment the lines below and just run this part!

        // Let's create 5 more squares!
        // Here `squareTwo`, `squareThree`, `squareFour`, and `squareFive` are objects
        Square squareTwo = new Square(15, "Michael", "blue");
        Square squareThree = new Square(17, "Dwight", "Yellow");
        Square squareFour = new Square(18, "Jim", "Light Blue");

        // Get suggestion from the students

        squareTwo.printSquareDetails();
        squareThree.printSquareDetails();
        squareFour.printSquareDetails();

        // Let's compare the syntax of instantiating Squares with instantiating Lists
        Square newSquare = new Square();
        ArrayList<String> myList = new ArrayList<String>();

        // We see that `Square` and `ArrayList` are classes,
        // `newSquare` and `myList` are names of the objects we instantiate
        // we use the `new` keyword to create an instance of a class.
        Rectangle newRectangle = new Rectangle();

        newRectangle.setWidth(5);

    }

}