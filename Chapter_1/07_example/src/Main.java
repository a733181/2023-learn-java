import javax.swing.*;

public class Main {
    public static void main(String[] args) {
      String choose =  JOptionPane.showInputDialog("請輸入選項 A B C D；");
      choose= choose.toLowerCase();
      if(choose.equals("a")){
          JOptionPane.showMessageDialog(null,"A選項\n1");
      }else if(choose.equals("b")){
          JOptionPane.showMessageDialog(null,"B選項\n2");
      }else if(choose.equals("c")){
          JOptionPane.showMessageDialog(null,"C選項\n3");
      }else if(choose.equals("d")){
          JOptionPane.showMessageDialog(null,"D選項\n4");
      }else{
          JOptionPane.showMessageDialog(null,"找不到選項");
      }
    }
}
