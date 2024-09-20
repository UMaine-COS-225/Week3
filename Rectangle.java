class Rectangle {

    private int width, length;
    private String name, color;

    // EXERCISE: Add Javadoc to methods

    public Rectangle(int width, int length, String name, String color) {
        this.width = width;
        this.length = length;
        this.name = name;
        this.color = color;
    }

    public Rectangle() {
        this.width = 10;
        this.length = 12;
        this.name = "Bob";
        this.color = "Purple";
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }

    public void printRectangleDetails() {
        System.out.println("The rectangle " + name + " has a width of " + width + ", a length of " + length
                + ", and a color of " + color);
        System.out.println("The perimeter of " + name + " is " + getPerimeter());
        System.out.println("The area of " + name + " square is " + getArea());
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}