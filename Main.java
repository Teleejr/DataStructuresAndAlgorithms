public class Main {

    public static void main(String[] args) {
        MyArray array = new MyArray(3, "123");

        Integer point = Integer.parseInt(String.valueOf(array.get(2)));
        System.out.println(point);
    }
}
