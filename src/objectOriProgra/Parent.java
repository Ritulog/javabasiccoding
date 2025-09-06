package objectOriProgra;

 public  class Parent {
        String name = "Parent";
        // Constructor
        Parent() {
            System.out.println("Parent Constructor");
        }
        // Normal method
        void show() {
            System.out.println("Parent show()");
        }
        // Static method
        static void staticMethod() {
            System.out.println("Parent staticMethod()");
        }
        // Final method
        final void finalMethod() {
            System.out.println("Parent finalMethod()");   }
        private void privateMethod() {
            System.out.println("Parent privateMethod()");
        }
    }
    class Child extends Parent {
        String name = "Child";  // field hiding
        Child() {
            // super() is called implicitly if not written
            System.out.println("Child Constructor");
        }
        // Overriding
        @Override
        void show() {
            System.out.println("Child show()");
        }
        // Static method hiding
        static void staticMethod() {
            System.out.println("Child staticMethod()");
        }
        // This is NOT overriding (private in parent → not visible)
        private void privateMethod() {
            System.out.println("Child privateMethod()");
        }
        // Overloading
        void show(String msg) {
            System.out.println("Overloaded show(): " + msg);
        }
    }

    class OOPsTrapsDemo {
        public static void main(String[] args) {
            Parent p = new Child();   // upcasting
            Child c = new Child();
//            System.out.println("\n--- Field Hidin---");
//            System.out.println(p.name);  // Parent
//            System.out.println(c.name);  // Child

//            System.out.println("\n--- Method Overriding (Dynamic Dispatch) ---");
//            p.show();   // Child's show() runs
//            c.show();   // Child's show()     System.out.println("\n--- Method Overloading ---");
//            c.show("Hello");  // Overloaded method
//            System.out.println("\n--- Static Method Hiding ---");
//            p.staticMethod(); // Parent's static method
//            c.staticMethod(); // Child's static method
//            System.out.println("\n--- Final Metho ---");
//            c.finalMethod();  // Inherited as-is
//            System.out.println("\n--- Private Method ---");
//            p.privateMethod();  //Compile error (not visible)
//             c.privateMethod(); // Compile error (not visible outside class)
        }
}
