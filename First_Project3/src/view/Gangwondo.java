package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import MountainDB.MountainList;
import fix_frame.Fix_Frame;
public class Gangwondo extends JPanel{
	   private Image backgroundImage; // 배경 이미지를 위한 멤버 변수
	   private JLabel label;
	   
	   public Gangwondo() {       
	      this(null);      
	   }
	   public Gangwondo(JPanel e) {
	      
	       // 이미지 로드
	        ImageIcon icon = new ImageIcon("산 배경.png"); // 여기서 이미지 파일 경로를 적어주세요.
	        backgroundImage = icon.getImage();
	      // JPanel 구조
	        setBackground(new Color(187, 229, 255));
	        setLayout(null);

	        
	        //설악산
	        ImageIcon gpsIcon1 = new ImageIcon("pin.png");
	        Image gps1a = gpsIcon1.getImage();
	        Image scaleGps1 = gps1a.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	        ImageIcon gpsBtn1 = new ImageIcon(scaleGps1);
	        JButton gps1 = new JButton(gpsBtn1);
	        gps1.setBounds(300, 250, 30, 30);      
	        gps1.setBorderPainted(false);   
	        gps1.setContentAreaFilled(false);
	        gps1.setFocusPainted(false);
	        JLabel label1 = new JLabel("용문산");
	        label1.setBounds(300, 280, 60, 30);
	        add(label1);
	        
	        
	        //태백산
	        ImageIcon gpsIcon2 = new ImageIcon("pin.png");
	        Image gps2a = gpsIcon2.getImage();
	        Image scaleGps2 = gps2a.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	        ImageIcon gpsBtn2 = new ImageIcon(scaleGps2);
	        JButton gps2 = new JButton(gpsBtn2);
	        gps2.setBounds(400, 490, 30, 30);      
	        gps2.setBorderPainted(false);   
	        gps2.setContentAreaFilled(false);
	        gps2.setFocusPainted(false);
	        JLabel label2 = new JLabel("태백산");
	        label2.setBounds(400, 510, 60, 30);
	        add(label2);
	        
	        //가리왕산
	        ImageIcon gpsIcon3 = new ImageIcon("pin.png");
	        Image gps3a = gpsIcon3.getImage();
	        Image scaleGps3 = gps3a.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	        ImageIcon gpsBtn3 = new ImageIcon(scaleGps3);
	        JButton gps3 = new JButton(gpsBtn3);
	        gps3.setBounds(360, 400, 30, 30);       
	        gps3.setBorderPainted(false);   
	        gps3.setContentAreaFilled(false);
	        gps3.setFocusPainted(false);
	        JLabel label3 = new JLabel("가리왕산");
	        label3.setBounds(360, 425, 60, 30);
	        add(label3);
	        
	        //계방산
	        ImageIcon gpsIcon4 = new ImageIcon("pin.png");
	        Image gps4a = gpsIcon4.getImage();
	        Image scaleGps4 = gps4a.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	        ImageIcon gpsBtn4 = new ImageIcon(scaleGps4);
	        JButton gps4 = new JButton(gpsBtn4);
	        gps4.setBounds(250, 350, 30, 30);       
	        gps4.setBorderPainted(false);   
	        gps4.setContentAreaFilled(false);
	        gps4.setFocusPainted(false);
	        JLabel label4 = new JLabel("계방산");
	        label4.setBounds(250, 375, 60, 30);
	        add(label4);
	        
	        //매봉산
	        ImageIcon gpsIcon5 = new ImageIcon("pin.png");
	        Image gps5a = gpsIcon5.getImage();
	        Image scaleGps5 = gps5a.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	        ImageIcon gpsBtn5 = new ImageIcon(scaleGps5);
	        JButton gps5 = new JButton(gpsBtn5);
	        gps5.setBounds(325, 460, 30, 30);        
	        gps5.setBorderPainted(false);   
	        gps5.setContentAreaFilled(false);
	        gps5.setFocusPainted(false);
	        JLabel label5 = new JLabel("매봉산");
	        label5.setBounds(325, 485, 60, 30);
	        add(label5);
	        
	        //랜덤주사위버튼
	        ImageIcon ran = new ImageIcon("dice.png");
	        Image ran1a = ran.getImage();
	        Image scaleRan = ran1a.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	        ImageIcon ranBtn = new ImageIcon(scaleRan);
	        JButton random = new JButton(ranBtn);
	        random.setBounds(520, 520, 40, 40);        
	        random.setBorderPainted(false);   
	        random.setContentAreaFilled(false);
	        random.setFocusPainted(false);
	        
	        JButton back = new JButton("");
	        back.setBounds(30, 620, 100, 100);     
	        back.setBorderPainted(false);   
	        back.setContentAreaFilled(false);
	        back.setFocusPainted(false);
	        
	        add(gps1);
	        add(gps2); 
	        add(gps3);
	        add(gps4);
	        add(gps5);
	        add(back);
	        add(random);
	        random.addActionListener(new ActionListener() {         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	             String[] mountainNames = {"설악산", "태백산", "계방산", "매봉산", "가리왕산"};

	                 // 랜덤으로 산 이름 선택
	                 int randomIndex = (int) (Math.random() * mountainNames.length);
	                 String selectedMountainName = mountainNames[randomIndex];

	                 Fix_Frame.getDispose();
	                 Fix_Frame.getInstance(new Info(e, selectedMountainName));
	         }
	      });
	        
	        back.addActionListener(new ActionListener() {         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	             Fix_Frame.getDispose();
	                Fix_Frame.getInstance(new MainF());
	         }
	      });   

	        label = new JLabel();
	        label.setBounds(90, 100, 500, 500); // 위치와 크기 설정
	        add(label);
	        setImage("강원도.png");
	        
	        gps1.addActionListener(new ActionListener() {            
	           @Override
	            public void actionPerformed(ActionEvent e) {
	               Fix_Frame.getDispose();
	                
	            Fix_Frame.getInstance(new Info(e,"설악산"));
	            }
	      });
	               
	        gps2.addActionListener(new ActionListener() {            
	           @Override
	            public void actionPerformed(ActionEvent e) {
	               Fix_Frame.getDispose();
	                Fix_Frame.getInstance(new Info(e,"태백산"));
	            }
	      });
	        
	        gps3.addActionListener(new ActionListener() {            
	           @Override
	            public void actionPerformed(ActionEvent e) {
	               Fix_Frame.getDispose();
	                
	            Fix_Frame.getInstance(new Info(e,"가리왕산"));
	            }
	      });
	        
	        gps4.addActionListener(new ActionListener() {            
	           @Override
	            public void actionPerformed(ActionEvent e) {
	               Fix_Frame.getDispose();
	                
	            Fix_Frame.getInstance(new Info(e,"계방산"));
	            }
	      });
	        
	        gps5.addActionListener(new ActionListener() {            
	           @Override
	            public void actionPerformed(ActionEvent e) {
	               Fix_Frame.getDispose();
	                
	            Fix_Frame.getInstance(new Info(e,"매봉산"));
	            }
	      });
	        
	   } 
	   
	   private void setImage(String imagePath) {
		    try {
		        BufferedImage image = ImageIO.read(new File(imagePath));
		        Image scaledImage = image.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

		        ImageIcon icon = new ImageIcon(scaledImage);
		        label.setIcon(icon);

		        // 테두리를 만들고 적용
//		        Border border = BorderFactory.createLineBorder(new Color(125, 82, 133), 5);
//		        label.setBorder(border);

		        // 이미지 크기에 맞게 label 크기 설정
		        label.setBounds(50, 110, scaledImage.getWidth(this), scaledImage.getHeight(this));
		        
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

	  
	     // FrameGetMountainInfo 클래스 호출 메서드
	    private void callFrameGetMountainInfo(MountainList mountainlist, int mountainIndex) {
	        Fix_Frame.getDispose();
	        Fix_Frame.getInstance(new FrameGetMountainInfo(mountainlist, mountainIndex));
	    }
	    
	    
	    // 배경 이미지를 그리기 위한 paintComponent 오버라이드
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (backgroundImage != null) {
	           g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
	        }
	    }
	}
