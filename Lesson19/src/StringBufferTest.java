public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sBuff = new StringBuffer("It is String Builder Object");
        System.out.println(sBuff.capacity());
        System.out.println(sBuff.length());
        System.out.println(sBuff);
        sBuff.replace(13, 20, "Buffer");
        System.out.println(sBuff);

    }
}
