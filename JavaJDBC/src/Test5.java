import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test5 {
    static JTextField jtf=new JTextField();
    //密码框;
    static JPasswordField jpf=new JPasswordField();
    static JFrame win=new JFrame();
    public static void main(String[] args) {
                win.setTitle("登陆窗口");
                win.setSize(250, 150);
                win.setLocationRelativeTo(null);
                win.setDefaultCloseOperation(3);//关闭所有的窗口
                win.setResizable(false);//不允许调整窗体；
                //布局；1.边框布局2.表格布局3.流布局；
                win.setLayout(new BorderLayout());//设置为边框布局（上下左右中）；
                //需要两个面板；上/下；
                JPanel up=new JPanel();
                JPanel down=new JPanel();
                win.add(up,BorderLayout.CENTER);
                win.add(down,BorderLayout.SOUTH);
                //表格布局;
                up.setLayout(new GridLayout(2,2));//2行2列表格；
                //流布局；
                down.setLayout(new FlowLayout());
                //准备组件；
                JLabel jlb1=new JLabel("账号:");
                JLabel jlb2=new JLabel("密码:");//文字标签
                //文本框;
                //按钮；
                JButton jbt1=new JButton("登陆");
                JButton jbt2=new JButton("注册");
                JButton jbt3=new JButton("重置");
//                LoginDemo LD=new LoginDemo();
                //注册监听事件
//                jbt1.addActionListener(LD);
//                jbt2.addActionListener(LD);
//                jbt3.addActionListener(LD);
                //放置组件；
                up.add(jlb1);
                up.add(jtf);
                up.add(jlb2);
                up.add(jpf);
                down.add(jbt1);
                down.add(jbt2);
                down.add(jbt3);
                win.setVisible(true);//显示出来

            }

//            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //你想监听什么动作；
                //1.当用户点击登陆按钮的时候，打印一个"你点击了登陆"
                if(e.getActionCommand()=="登陆"){
                    //System.out.println("你点击了登陆");
                    //如果账号为admin密码为123456提示登陆成功,否则提示登陆失败并清空账号和密码框；
                    String username=jtf.getText();//获取jtf内的字符串；
                    String userpass=jpf.getText();//横线代表使用的旧方法；
                    if(username.equals("admin")&&userpass.equals("123456"))
                    {
                        //登陆成功;
                        //System.out.println("登陆成功");
                        JOptionPane.showMessageDialog(null, "登陆成功");
                        //打开聊天窗口；
                        win.dispose();
//                        ChartDemo cd=new ChartDemo();
//                        cd.setVisible(true);//窗口显示；
                        //	win.setVisible(false);//隐藏窗口；
                        //销毁窗体；
                    }
                    else{
                        //登陆失败
                        //System.out.println("登陆失败");
                        JOptionPane.showMessageDialog(null, "登陆失败");
                        jtf.setText(null);//将账号设为空值
                        jpf.setText(null);
                    }
                }
                if(e.getActionCommand()=="注册")
                {
                    System.out.println("你点击了注册");
                }
                if(e.getActionCommand()=="重置")
                {
                    //System.out.println("你点击了重置");
                    jtf.setText(null);//将账号设为空值
                    jpf.setText(null);
                }
            }

        }


