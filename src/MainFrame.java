import javax.swing.*;
import java.awt.*;

/**
 * @Author: liuwei
 * @Date: 2019/8/13 0013 11:43
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        //创建一个19*19格子棋板
        FiveInARowModel board=new FiveInARowModel(19);
        BoardPanel panel=new BoardPanel(board);
        getContentPane().add(panel, BorderLayout.CENTER);
        setSize(panel.getWidth(),10+panel.getHeight());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
