public class SwitchClass {
    public static void main(String[] args) {
        char charvalue = 'b';
        int intValue = 10;
        switch (charvalue) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                switch (intValue) {
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 20:
                        System.out.println("Twenty");
                        break;
                }
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
                System.out.println("Doll");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
