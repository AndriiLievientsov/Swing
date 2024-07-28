import static java.lang.System.out;


//Каков результат выполнения следующего кода? Сделайте некоторые
//предположения, а потом выполните код, чтобы сравнить полученные результаты с вашими предположениями.

public class TaskFromBook {
    public static void main ( String [] args ) {
        out.println("ЬigValue : " + MutableInteger.bigValue);

        MutableInteger holderl = new MutableInteger(42);
        MutableInteger holder2 = new MutableInteger(7);
        out.println("holderl : " + holderl.value);
        out.println("holder2 : " + holder2.value);
        out.println();
        holderl.value++;
        holder2.value++;
        MutableInteger.bigValue++;
        out.println("ЬigValue : " + MutableInteger.bigValue);
        out.println("holderl : " + holderl.value);
        out.println("holder2 : " + holder2.value);
        out.println();
        holderl.bigValue++;
        out.println("bigValue в соответствии с holderl : "
                + holderl.bigValue);
        out.println("bigValue в соответствии с holder2 : "
                + holder2.bigValue);
        }
    }
        class MutableInteger {
            int value;
            static int bigValue = 1_000_000;

            public MutableInteger(int value) {
                this.value = value;
            }
        }


