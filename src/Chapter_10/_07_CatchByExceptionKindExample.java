package Chapter_10;

public class _07_CatchByExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println("data1 + data2 = " + result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no value");
        } catch (NumberFormatException e){
            System.out.println("Can not change to number");
        } finally {
            System.out.println("Please check the value");
        }
    }
}
