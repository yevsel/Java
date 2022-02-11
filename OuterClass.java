public class OuterClass {
    public void heyThere() {
        System.out.println("Hey There how are you");
    }

    public class InnerClass {
        public void intro() {
            System.out.println("This is from the inner class");
        }
    }

    public static class StaticInnerClass {
        public void desc() {
            System.out.println("You dont need to create an object of outer class to access me");
        }
    }
}
