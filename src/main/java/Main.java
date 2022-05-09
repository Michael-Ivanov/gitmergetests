public class Main {

    public static void main(String[] args) {
        isEquals();
        checkConstructor();
    }


    private static void isEquals() {
        RootChild rootChild1 = new RootChild(1L);
//        rootChild1.setName("child");
        rootChild1.setRootDescription("descr");
        RootChild rootChild2 = new RootChild(2L);
        rootChild2.setRootDescription("descr");
        System.out.println(rootChild1);
        System.out.println(rootChild2);
        System.out.println(rootChild1.equals(rootChild2));
    }

    private static void checkConstructor() {
        RootChild rootChild = new RootChild(22L);
        System.out.println(rootChild);

        AnotherChild anotherChild = new AnotherChild(44L, 5);
        System.out.println(anotherChild);
    }
}
