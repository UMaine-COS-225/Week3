class SomeClass {
    static int foo = 10;

    public int bar = 10;

    public SomeClass(int bar) {
        this.bar = bar;
    }

    public int getBar() {
        return bar;
    }

    public static void changeFoo() {
        foo++;
    }

    public static void tryToAccessBar(){
    this.bar;
    this.getBar();
    getBar();
    }
}

class DifferentClass {

    public static void main(String[] args) {

        SomeClass someInstance = new SomeClass(0);
        SomeClass secondInstance = new SomeClass(0);
        // System.out.println(SomeClass.foo);

        System.out.println("The value of foo is" + someInstance.foo);
        System.out.println("The value of foo is" + secondInstance.foo);

        someInstance.changeFoo();
        someInstance.changeFoo();
        SomeClass.changeFoo();

        System.out.println("The value of bar is " + SomeClass.bar);
        System.out.println("The value of foo is " + someInstance.foo);
        System.out.println("The value of foo is " + secondInstance.foo);

        // `static` variables belong to class and not to any object
        // `static` variables exist without instantiation
        // `static` variables have a single copy in memory

        // `static` methods also belong to class and not to any object
        // `static` methods can be accessed without instantiation
        // `static` methods cannot access instance variables/methods
        // `static` methods can access other static things.

    }
}