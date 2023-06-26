package HeadFitst;

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

        class DrumKit {
            boolean topHat = true;
            boolean snare = true;

            void playSnare() {
                System.out.println("бах бах ба-бах");
            }

            void playTopHat () {
                System.out.println("динь динь ди-динь");
            }
        }


            DrumKit d = new DrumKit();
            d.playSnare();
            d.snare = false;
            d.playTopHat();
           if (d.snare == true) {
               d.playSnare();
           }



    }
}
