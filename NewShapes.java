class NewShapes {

    public static void main(String[] args) {

        SecondSquare newSquare = new SecondSquare(10, "Pam", "Purple");

        // newSquare.printRectangleDetails();

        // System.out.println("The side is " + newSquare.getWidth());

        Rectangle newRectangle = new Rectangle();
        newRectangle.printRectangleDetails();
        newRectangle.width = 15;
        newRectangle.printRectangleDetails();

    }
}