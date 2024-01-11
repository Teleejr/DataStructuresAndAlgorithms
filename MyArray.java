/* Details the steps of creating your own array from scratch *
 * and some useful processes to know how to do.              *
 * Processes such as reversing Strings, merging, sorting,    *
 * and merge sort.                                           *
 * Created by: Tom Lee                                       *
 * Date: January 11, 2024                                    */
public class MyArray {

    //Create length and data variables
    int length;
    String data;

    //Add empty constructor
    public MyArray() {
    }
    //Add constructor
    public MyArray(int length, String data) {
        this.length = length;
        this.data = data;
    }

    /*Add Getters and Setters*/
    public int getLength() {
        return length;
    }

    public String getData() {
        return data;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Character get(int index) {
        return this.data.charAt(index);
    }



    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", data=" + data +
                '}';
    }
}
