import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


class MyJFrame extends JFrame implements ActionListener {
    private JPanel contentPane;
    private int imgNumber = 1;
    
    MyJFrame (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 200, 280, 350);
        setTitle("change picture");
        setVisible(true);
        
        contentPane = new JPanel();
        add(contentPane);
        contentPane.setLayout(new FlowLayout());
        
        JLabel lab1 = new JLabel("圖片1", JLabel.CENTER);
        Font font = new Font("SansSerif", Font.BOLD, 15);
        lab1.setFont(font);
        contentPane.add(lab1);
        
        ImageIcon img1 = new ImageIcon("C:\\Users\\a2718\\Desktop\\picture_hw\\1.png");
        ImageIcon img2 = new ImageIcon("C:\\Users\\a2718\\Desktop\\picture_hw\\2.png");
        ImageIcon img3 = new ImageIcon("C:\\Users\\a2718\\Desktop\\picture_hw\\3.png");
        
        
        JLabel lab2 = new JLabel();
        lab2.setIcon(img1);
        contentPane.add(lab2);
        
        JButton btn1 = new JButton("上一張");
        JButton btn2 = new JButton("下一張");
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (imgNumber == 1){
                    JOptionPane.showMessageDialog(null, "沒有圖了", "圖片", JOptionPane.WARNING_MESSAGE);
                }
                else if (imgNumber == 2){
                    lab1.setText("圖片1");
                    imgNumber--;
                    lab2.setIcon(img1);
                }
                else {
                    lab1.setText("圖片2");
                    imgNumber--;
                    lab2.setIcon(img2);
                }
            }
        });
        contentPane.add(btn1);
        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (imgNumber == 3){
                    JOptionPane.showMessageDialog(null, "沒有圖了", "圖片", JOptionPane.WARNING_MESSAGE);
                }
                else if (imgNumber == 2){
                    lab1.setText("圖片3");
                    imgNumber++;
                    lab2.setIcon(img3);
                }
                else {
                    lab1.setText("圖片2");
                    imgNumber++;
                    lab2.setIcon(img2);
                }
            }
        });
        contentPane.add(btn2);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        JButton nameBtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null, nameBtn.getText());
    }
    
}
public class picture_hw{
    public static void main(String[] args) throws Exception{
        MyJFrame f1 = new MyJFrame();
    }
}