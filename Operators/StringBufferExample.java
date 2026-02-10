import java.util.*;
public class StringBufferExample{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println("append: " + sb );
        sb.insert(5 , ",");
        System.out.println("insert: " + sb);
        sb.replace( 6, 11, "Java");
        System.out.println("replace: " + sb );
        sb.delete(5, 6);
        System.out.println("delete: " + sb);
        sb.reverse();
        System.out.println("reverse: " + sb);
        System.out.println("length: " + sb.length());
        System.out.println("substring: " + sb.substring(1  , 4 ));
    }
}