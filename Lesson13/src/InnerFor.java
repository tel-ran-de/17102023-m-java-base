public class InnerFor {
    public static void main(String[] args) {
//        2 * 2 = 4
//        2 * 3 = 6
//                ....
//        3 * 2 = 6
//        3 * 3 = 9
//                ....
//        9 * 9 = 81
//        for (int i = 2; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//            System.out.println();
//        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
