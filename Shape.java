class Shape {

    public static void main(String[] args) {

        // Let's say I want to create a square and do some operations on it

        // A variable to hold the size of the sides
        int squareOneSide = 10;

        // A variable to hold the perimeter of the square
        double squareOnePerimeter = squareOneSide * 4;

        // A variable to hold the area of the square
        double squareOneArea = squareOneSide * squareOneSide;

        System.out.println("The side of squareOne is " + squareOneSide);
        System.out.println("The perimeter of squareOne is " + squareOnePerimeter);
        System.out.println("The area of squareOne is " + squareOneArea);

        // Let's say I want to create another square! I will repeat the above three
        // lines!
        int squareTwoSide = 20;
        double squareTwoPerimeter = squareTwoSide * 4;
        double squareTwoArea = squareTwoSide * squareTwoSide;

        System.out.println("The side of squareOne is " + squareTwoSide);
        System.out.println("The perimeter of squareOne is " + squareTwoPerimeter);
        System.out.println("The area of squareOne is " + squareTwoArea);

        // Let's say, I want to create a third and a fourth square!
        int squareThreeSide = 15;
        int squareFourSide = 12;
        // int squareFiveSide = 19;

        double squareThreePerimeter = squareThreeSide * 4;
        double squareThreeArea = squareThreeSide * squareThreeSide;

        double squareFourPerimeter = squareFourSide * 4;
        double squareFourArea = squareFourSide * squareFourSide;

        // I don't want to copy paste the print statements for squareThree and
        // squareFour!!
        // Also I notice that I am doing the same operations -
        // calculating perimeter and area over and over again!
        // I am extremely lazy and I do not want to do that.
        // So, using the DRY principle - Do Not Repeat Yourself, I can create functions
        // to do the repetitive tasks!
        // Below I create functions `calculateSquarePerimeter` and `calculateSquareArea`
        // to calculate the perimeter and area of a square.

        System.out.println("The side of squareThree is " + squareThreeSide);
        System.out.println("The perimeter of squareThree is " + calculatePerimeterOfSquare(squareThreeSide));
        System.out.println("The area of squareThree is " + calculateAreaOfSquare(squareThreeSide));

        System.out.println("The side of squareFour is " + squareFourSide);
        System.out.println("The perimeter of squareThree is " + calculatePerimeterOfSquare(squareFourSide));
        System.out.println("The area of squareThree is " + calculateAreaOfSquare(squareFourSide));

        // This is much better because now I do not have to create two extra variables
        // for storing the perimeter and the area. But wait...

        // Using the DRY principle, I can see that I am printing the same three things
        // over and over.
        // I can write a third function now - `printSquareDetails` to print the
        // perimeter and the area!

        int squareFiveSide = 18;
        printSquareDetails(squareFiveSide);

        // Now what used to take me 6 lines of code to create a square, calculate its
        // perimeter and area and printing it to the console can now be done
        // in just two lines! But wait...

        // What if, I am feeling whimsical and I want to name the square
        // and add a color!
        // I can modify `printSquareDetails` to take in two String variables, the name
        // of the square and its color.
        // But, now I am back two square one (pun intended) where I have to create two
        // additional variables for each square!

        // There must be a solution!

    }

    /**
     * Calculates the perimeter of the square.
     * 
     * @param sideOfSquare
     * @return The perimeter of the square
     */
    public static double calculatePerimeterOfSquare(int sideOfSquare) {
        return 4 * sideOfSquare;
    }

    /**
     * Function to calculate the area of the square by taking in the side
     * 
     * @param sideOfSquare The side of the square
     * @return The area of the square
     */
    public static double calculateAreaOfSquare(int sideOfSquare) {
        return sideOfSquare * sideOfSquare;
    }

    public static void printSquareDetails(int sideOfSquare) {
        System.out.println("The side of the square is: " + sideOfSquare);
        System.out.println("The perimeter of square is " + calculatePerimeterOfSquare(sideOfSquare));
        System.out.println("The area of square is " + calculateAreaOfSquare(sideOfSquare));

    }

    public static void printSquareDetailsWithNameAndColor(int sideOfSquare, String nameOfSquare, String colorOfSquare) {
        System.out.println(
                "The square " + nameOfSquare + " has a side of " + sideOfSquare + " and a color of " + colorOfSquare);
        System.out.println("The perimeter of " + nameOfSquare + " is " + calculatePerimeterOfSquare(sideOfSquare));
        System.out.println("The area of " + nameOfSquare + " square is " + calculateAreaOfSquare(sideOfSquare));
    }
}
