package NewTask;

import NewTask.Player;

import java . util . Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame ;
import javax.swing.JLabel;
import java.awt.GridLayout ;

@SuppressWarnings ( "serial" )
public class TeamFrame extends JFrame {

//    public TeamFrame() throws IOException {
//        Player player;
//        Scanner hankeesData = new Scanner(new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\NewTask\\Hankees.txt"));
//
//        for (int num = 1; num <= 9; num++) {
//            player = new Player(hankeesData.nextLine(),
//                    hankeesData.nextDouble());
//            hankeesData.nextLine();
//            addPlayerInfo (player);
//        }
//
//            setTitle("Средние бэттинги Ханков ");
//            setLayout(new GridLayout(9,2,20,3));
//            setLocationRelativeTo(null);
//            setDefaultCloseOperation(EXIT_ON_CLOSE);
//            pack();
//            setVisible(true);
//            hankeesData.close();
//    }
//
//    void addPlayerInfo (Player player) {
//        add (new JLabel(" " + player.getName()));
//        add (new JLabel(player.getAveragesString()));
//    } // залочил бо делал ДЗ по PlaeerPlus нужно было изменить часть кода.


    public TeamFrame () throws IOException {
        PlayerPlus playerPlus;
        Scanner hankeesData = new Scanner(new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\NewTask\\Hankees.txt"));

        for (int num = 1; num <= 9; num++) {
            playerPlus = new PlayerPlus(hankeesData.nextLine(),
                                        hankeesData.nextDouble());
            hankeesData.nextLine();
            addPlayerInfo(playerPlus);
        }

        add(new JLabel());
        add(new JLabel(" ---------"));
        add(new JLabel("Средний бэттинг команды: "));
        add(new JLabel(PlayerPlus.findTeamAverageString()));

        setTitle("Бэттинги игроков и команды");
        setLayout(new GridLayout(11,2,20,3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        hankeesData.close();

    }

    void  addPlayerInfo (PlayerPlus playerPlus) {
        add(new JLabel(" " + playerPlus.getName()));
        add(new JLabel(playerPlus.getAveragesString()));
    }

}