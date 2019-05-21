public class ArrayMethod {
    public static void main (String [] args) {
        System.out.println("Thank you for using ArrayMethod");
        int count = 10;
        while (count != 0) {

            System.out.println(count);
            --count;
        }
        int Count2 = 0;
        while (Count2 <= 10) {
            System.out.println(Count2);
            ++Count2;
        }
    }
    public static void displayDoWHile(){
        int display = 0;
        int display2 = 0;

        do{
            System.out.println(display);
            -- display;
        }while (display >= 0);
        do{
            System.out.println(display2);
            ++display2;
        }while (display2 <= 10);
    }
    public static void displayForLoop(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}
