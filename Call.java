public class Call {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before calling changeValue() method, num = " + num);
        changeValue(num);
        System.out.println("After calling changeValue() method, num = " + num);
    }

    public static void changeValue(int num) {
        num = 30;
        System.out.println("Inside changeValue() method, num = " + num);
    }
}
