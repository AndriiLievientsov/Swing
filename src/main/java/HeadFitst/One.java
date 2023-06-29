package HeadFitst;

import java.net.Socket;

public class One {
    public static void main(String[] args) {
//        class TapeDeck {
//            boolean canRecord = false;
//            void playTape() {
//                System.out.println("пленка проигрывается");
//            }
//
//            void recordTape() {
//                System.out.println("идет запись на пленку");
//            }
//        }
//
//        TapeDeck t = new TapeDeck();
//        t.canRecord = true;
//        t.playTape();
//        if (t.canRecord == true){
//            t.recordTape();
//        }

//        class DrumKit {
//            boolean topHat = true;
//            boolean snare = true;
//
//            void playSnare() {
//                System.out.println("бах бах ба-бах");
//            }
//
//            void playTopHat () {
//                System.out.println("динь динь ди-динь");
//            }
//        }
//
//
//            DrumKit d = new DrumKit();
//            d.playSnare();
//            d.snare = false;
//            d.playTopHat();
//           if (d.snare == true) {
//               d.playSnare();
//           }

            class Echo {
                int count = 0;
                void hello () {
                    System.out.println("привееееет...");
                }
            }

           Echo e1 = new Echo();
           Echo e2 = new Echo();
           int x = 0;
           while (x<4) {
               e1.hello();
               e1.count = e1.count  + 1;
               e2 = e1;
               if (x==3) {
                   e2.count = e2.count + 1;
               }
               if(x>0) {
                   e2.count = e2.count  + e1.count; // вот эта часть нужна что бы первый круг по циклу Вайл прошел и был ноль
               }

                x =x + 1;

           }
        System.out.println(e2.count);



    }
}
