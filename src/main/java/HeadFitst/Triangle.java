package HeadFitst;

public class Triangle {
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

//            class Echo {
//                int count = 0;
//                void hello () {
//                    System.out.println("привееееет...");
//                }
//            }
//
//           Echo e1 = new Echo();
//           Echo e2 = new Echo();
//           int x = 0;
//           while (x<4) {
//               e1.hello();
//               e1.count = e1.count  + 1;
//               e2 = e1;
//               if (x==3) {
//                   e2.count = e2.count + 1;
//               }
//               if(x>0) {
//                   e2.count = e2.count  + e1.count; // вот эта часть нужна что бы первый круг по циклу Вайл прошел и был ноль
//               }
//
//                x =x + 1;
//
//           }
//        System.out.println(e2.count);
//---------------------------------------------------------------------------------
//        class Books {
//            String title;
//            String author;
//        }
//
//
//
//        Books[] myBooks = new Books[3];
//        myBooks[0] = new Books();
//        myBooks[1] = new Books();
//        myBooks[2] = new Books();
//
//
//        int x = 0;
//        myBooks[0].title = "Плоды Java";
//        myBooks[1].title = "Java Гэтсби";
//        myBooks[2].title = "Сборник рецептов по Java";
//
//        myBooks[0].author = "Боб";
//        myBooks[1].author = "Сью";
//        myBooks[2].author = "Ян";
//
//        while (x < 3) {
//            System.out.print(myBooks[x].title);
//            System.out.print(", автор " + "\n");
//            System.out.print(myBooks[x].author);
//            x = x + 1;
//        }
//---------------------------------------------------------------------------------
           // String name; - это пишется до public static void main(String[] args)

//        One[] h = new One[3];
//        int z = 0;
//
//        while (z < 2) {
//            z = z + 1;
//            h[z] = new One();
//            h[z].name = "Бильбо";
//            if (z == 1) {
//               h[z].name = "Фродо";
//            }
//            if (z == 2) {
//                h[z].name = "Сэм";
//            }
//            System.out.print(h[z].name + " - ");
//            System.out.println("имя хорошего хоббита");
//        }
//---------------------------------------------------------------------------------
//        String[] islands = new String[4];
//        islands[0] = "Бермуды";
//        islands[1] = "Фиджи";
//        islands[2] = "Азорские острова";
//        islands[3] = "Косумель";
//
//        int[] index = new int[4];
//        index[0] = 1;
//        index[1] = 3;
//        index[2] = 0;
//        index[3] = 2;
//
//        int y = 0;
//        int ref;
//        while (y < 4) {
//            ref = index[y];
//            System.out.print("острова = ");
//            System.out.println(islands[ref]);
//            y = y + 1;
//        }
// ---------------------------------------------------------------------------------

          //  double area;
          //    int height;
          //    int length;    - это пишется до public static void main(String[] args)

//           int x = 0;
//           Triangle[] ta = new Triangle[4];
//
//           while (x < 4) {
//               ta[x] = new Triangle();
//               ta[x].height = (x + 1) * 2;
//               ta[x].length = x + 4;
//               ta[x].setArea();
//               System.out.print("треугольник " + x + ", зона");
//               System.out.println(" = " + ta[x].area);
//               x = x + 1;
//           }
//           int y = x;
//           x = 27;
//           Triangle t5 = ta[2];
//           ta[2].area = 343;
//           System.out.print("y = " + y);
//           System.out.println(", зона t5 = " + t5.area);
//       }
//        void setArea() {
//            area = (height + length) / 2;
//        }

// ---------------------------------------------------------------------------------
          class Dog {
              String name;
              void bark(int numOfBarks) {
                  while (numOfBarks > 0) {
                      System.out.println("Гав");
                      numOfBarks = numOfBarks - 1;
                  }
              }
          }

          Dog d = new Dog();
          d.bark (3);





    }
}


