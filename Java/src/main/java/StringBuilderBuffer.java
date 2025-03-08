package src.main.java;

public class StringBuilderBuffer {

    public static void main(String[] args) {
        //StringBuilder can be replaced with StringBuffer, the functionality remains same.
        // the minimum soze starts with 16 and then adds the extra characters to 16 and sums the final length.
        StringBuffer sb = new StringBuffer(); //Can be replaced with StringBuilder but it is not inherently thread safe
//        sb.append("World");
//        sb.insert(0, "Hello ");
//        System.out.println(sb);
//        System.out.println(sb.capacity());
//        System.out.println(sb.reverse());

        Thread t1 = new Thread(()-> {
            for (int i=0; i<1000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(()-> {
            for (int i=0; i<1000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(sb.toString().length());
    }
}
