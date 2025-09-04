package objectOriProgra.thisKeyEx;

class ThisKeywordTraps {

    String name;

    // 1. Shadowing Trap
    ThisKeywordTraps(String name) {
        // ❌ Wrong: this does nothing because of shadowing
        name = name;
        System.out.println("Shadowing Trap  name = " + this.name);

        // ✅ Correct way
        this.name = name;
        System.out.println("Shadowing Trap  name = " + this.name);
    }

    // 2. Constructor Chaining
    ThisKeywordTraps() {
        this(10); // ✅ allowed, must be first line
        System.out.println("Default Constructor");
    }

    ThisKeywordTraps(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    // 3. Returning Current Object
    ThisKeywordTraps getObject() {
        return this; // Used for method chaining
    }

    // 4. Passing this as Argument
    void showPass(ThisKeywordTraps obj) {
        System.out.println("Passing this: " + obj.name);
    }

    void callShowPass() {
        showPass(this); // ✅ passing current object
    }

    // 5. Static Context Trap
    static void staticMethod() {
        // System.out.println(this); // ❌ Compile-time error
        System.out.println("Static Context Trap: 'this' cannot be used here");
    }

    // 6. Anonymous Inner Class Trap
    void anonymousTrap() {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Inside Anonymous Class, this = " + this);
                System.out.println("To access Outer, use ThisKeywordTraps.this = " + ThisKeywordTraps.this);
            }
        };
        r.run();
    }

    // MAIN method to run everything
    public static void main(String[] args) {
        System.out.println("=== Shadowing Trap ===");
        ThisKeywordTraps obj1 = new ThisKeywordTraps("Alice");

        System.out.println("\n=== Constructor Chaining ===");
        ThisKeywordTraps obj2 = new ThisKeywordTraps();

        System.out.println("\n=== Returning Current Object ===");
        obj1.getObject().getObject().getObject(); // Chained calls

        System.out.println("\n=== Passing this as Argument ===");
        obj1.callShowPass();

        System.out.println("\n=== Static Context Trap ===");
        staticMethod();

        System.out.println("\n=== Anonymous Inner Class Trap ===");
        obj1.anonymousTrap();
    }
}
