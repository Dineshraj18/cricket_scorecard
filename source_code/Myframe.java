package cricket_scorecard;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class Myframe extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLayeredPane layeredPane;
	
	private JPanel panel;
	private JPanel contentPane;
	private JPanel homepan;
	private JPanel teamdetails;
	private JPanel inings1;
	private JPanel inings2;
	private JPanel panteam;
	private JPanel pantoss;
	private JPanel pan11;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel fisc;
	private JPanel sisc;
	private JPanel panel_5;
	
	String s;
	boolean able;
	boolean wi;
	boolean no;
	boolean by;
	boolean ww;
	int target;
	boolean bm1;
	boolean bm2;
	boolean bm;
	
	Team t1;
	Team t2;
	Team bat;
	Team bowl;
	
	Player[] a;
	Player[] b;
	Player striker;
	Player nonstriker;
	Player bowler;

	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel11;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLab1;
	private JLabel lblNewLab2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel31;
	
	private JButton tb1;
	private JButton tb2;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn9;
	private JButton btn8;
	private JButton btn10;
	private JButton btn11;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JButton btn29;
	private JButton btn30;
	private JButton btnNewButton;
	private JButton btnNewBut1;
	private JButton but3;
	private JButton but4;
	private JButton fsc;
	private JButton ssc;
	private JButton btnNewButton_1;
	JButton btnNewButton_7;
	JButton btnNewButton1;
	
	private JTextField gt1;
	private JTextField gt2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField ta;
	private JTextField tb;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField runsf;
	private JTextField runsff;
	private JTextField wicketsf;
	private JTextField oversf;
	private JTextField extrassf;
	private JTextField wicketsff;
	private JTextField oversff;
	private JTextField extrassff;
	private JTextField last;
	private JTextField[] g1;
	private JTextField[] g2;
	private JTextField[] at;
	private JTextField[] bt;
	
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JTextPane textPane_3;
	private JTextPane textPane_4;
	
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_6;
	
	private JTextField textField_26;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myframe frame = new Myframe();
					frame.setVisible(true);
					frame.setTitle("CRICKET SCORE CARD");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchpan(JPanel pan){
		layeredPane.removeAll();
		layeredPane.add(pan);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public void update(JTextField run,JTextField over,JTextField wick,JTextField extra,JTextField bat1,JTextField bat2,JTextField bow1) {
		run.setText(""+bat.score);
		over.setText(""+bat.overs+"."+bat.balls);
		wick.setText(""+bat.wickets);
		extra.setText(""+bat.extrass);
		
		bat1.setText(String.format("%10s  %d  (%d)",striker.name,striker.runs,striker.balls));
		bat2.setText(String.format("%10s  %d  (%d)",nonstriker.name,nonstriker.runs,nonstriker.balls));
		bow1.setText(String.format("%10s   (%d.%d)  %d- %d",bowler.name,bowler.overs,bowler.bowballs,bowler.wickets,bowler.conruns));
	}
	public void switchStrike() {
		Player temp=striker;
		striker=nonstriker;
		nonstriker=temp;
	}
	public void hitruns(int r) {
		bat.score+=r;
		striker.runs+=r;
		bowler.conruns+=r;
	}
	public void countballs() {
		bat.balls++;
		striker.balls++;
		bowler.bowballs++;
	}
	public void topers(JTextField tf1,JTextField tf2,JTextField tf3,JTextField tf4,JTextField tf5,JTextField tf6,JTextField tf7) {
		Player toprun=new Player();
		Player toprun2=new Player();
		Player toprun3=new Player();
		
		Player topwick=new Player();
		Player topwick2=new Player();
	
		for(Player p: bat.scorelist) {
			if(p.runs>toprun.runs) {
				toprun3=toprun2;
				toprun2=toprun;
				toprun=p;
			}
			else if(p.runs>toprun2.runs) {
				toprun3=toprun2;
				toprun2=p;
			}
			else if(p.runs>toprun3.runs) {
				toprun3=p;
			}
		}
		for(Player p:bowl.outlist) {
			if(p.wickets>topwick.wickets) {
				topwick2=topwick;
				topwick=p;
			}
			else if(p.wickets>topwick2.wickets) {
				topwick2=p;
			}
		}
		
		
		
		tf1.setText(String.format("%10s  %8d   (%d)",toprun.name,toprun.runs,toprun.balls));
		tf2.setText(String.format("%10s  %8d   (%d)",toprun2.name,toprun2.runs,toprun2.balls));
		tf3.setText(String.format("%10s  %8d   (%d)",toprun3.name,toprun3.runs,toprun3.balls));
		
		tf4.setText(String.format("%10s (%d.%d)  %d - %d", topwick.name,topwick.overs,topwick.bowballs,topwick.wickets,topwick.conruns));
		tf5.setText(String.format("%10s (%d.%d)  %d - %d",topwick2.name,topwick2.overs,topwick2.bowballs,topwick2.wickets,topwick2.conruns));
		
		tf6.setText(toprun.name);
		tf7.setText(topwick.name);
	}
	public void check() {
		if(bat.balls==6) {
			bat.overs++;
			bat.balls=0;
			bowler.overs++;
			bowler.bowballs=0;
			overchange(comboBox_3,textField_4);
			switchStrike();
		}
		if(bat.overs == 20 || bat.wickets == 10 ) {
			printlist(textPane_1,textPane_2,textField_9);
			target=bat.score+1;
			topers(textField_13,textField_15,textField_16,textField_14,textField_17,textField_7,textField_8);
			lblNewLabel_10.setVisible(true);
			lblNewLabel_11.setVisible(true);
			textField_7.setVisible(true);
			textField_8.setVisible(true);
			textField_9.setText(""+bat.extrass);
			but3.setVisible(false);
			fsc.setVisible(true);
			switchpan(fisc);
			textField_5.setText(""+bat.score);
			textField_6.setText(""+bat.overs+" . "+bat.balls);
			printlist(textPane_1,textPane_2,textField_9);
			but4.setVisible(true);
			textField_26.setText(""+target);
			able=false;
			Team temp=bat;
			bat=bowl;
			bowl=temp;
			
		}
	}
	
	public void check2() {
		if(bat.balls==6) {
			bat.overs++;
			bat.balls=0;
			bowler.overs++;
			bowler.bowballs=0;
			overchange(comboBox_6,textField_23);
			switchStrike();
		}
		if(bat.overs == 20 || bat.wickets == 10 || bat.score>=target) {
			printlist(textPane_3,textPane_4,textField_55);
			
			topers(textField_18,textField_19,textField_20,textField_24,textField_25,textField_53,textField_54);
						
			lblNewLab1.setVisible(true);
			lblNewLab2.setVisible(true);
			textField_53.setVisible(true);
			textField_54.setVisible(true);
		
			textField_55.setText(""+bat.extrass);
			but4.setVisible(false);
			ssc.setVisible(true);
			switchpan(sisc);
			textField_51.setText(""+bat.score);
			textField_52.setText(""+bat.overs+" . "+bat.balls);
			printlist(textPane_3,textPane_4,textField_55);
			last.setText(bat.name+" "+(target-bat.score)+" NEED TO WIN FROM TO WIN");
			btnNewButton_1.setVisible(true);
			if(bat.score>=target) { 
				last.setText(bat.name+" WON THE MATCH");
				textField_12.setText(bat.name+" WON THE MATCH");
			}	
			else if(bat.score<target) {
				last.setText(bowl.name+" WON THE MATCH");
				textField_12.setText(bowl.name+" WON THE MATCH");
			}	
			else {
				last.setText("MATCH TIE");
				textField_12.setText("MATCH TIE");
			}
		}
	}
	public void overchange( JComboBox<String> comboBox,JTextField textField) {
		comboBox.setVisible(true);
		textField.setVisible(false);
		btndisable();
	//	switchStrike();
	}
	public void wide() {
		bat.score++;
		bat.extrass++;
		bowler.conruns++;
	}
	public void out(JComboBox<String> comboBox,JTextField textF) { 
		bowler.wickets++;
		bat.balls++;
		bat.wickets++;
		bowler.bowballs++;
		striker.balls++;
		comboBox.setVisible(true);
		textF.setVisible(false);
		btndisable();	
	}
	public void btndisable() {

		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		
		btn21.setEnabled(false);
		btn22.setEnabled(false);
		btn23.setEnabled(false);
		btn24.setEnabled(false);
		btn25.setEnabled(false);
		btn26.setEnabled(false);
		btn27.setEnabled(false);
		btn28.setEnabled(false);
		btn29.setEnabled(false);
		btn30.setEnabled(false);
		able=true;
	}
	public void btnenable() {
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn10.setEnabled(true);
		btn11.setEnabled(true);
		
		btn21.setEnabled(true);
		btn22.setEnabled(true);
		btn23.setEnabled(true);
		btn24.setEnabled(true);
		btn25.setEnabled(true);
		btn26.setEnabled(true);
		btn27.setEnabled(true);
		btn28.setEnabled(true);
		btn29.setEnabled(true);
		btn30.setEnabled(true);
		able=false;
	}
	public void ex_wi(int n) {
		bat.score+=n;
		bat.extrass+=n;
		bowler.conruns+=n;
		wi=false;
	}
	public void ex_by(int n) {
		bat.score+=n;
		bat.extrass+=n;
		bowler.conruns+=n;
		by=false;
	}
	public void ex_no(int n) {
		bat.score+=n;
		bat.extrass+=n;
		striker.runs+=n;
		bowler.conruns+=n;
		no=false;
	}
	public void printlist(JTextPane text1,JTextPane text2,JTextField ex) {
		String s="";
		for(Player p : bat.scorelist){
			s+=String.format("%10s %3s %8d %5s(%d)\n", p.name," ",p.runs," ",p.balls);
		}
		text1.setText(s);
		s="";
		for(Player p : bowl.outlist) {
			s+=String.format("%10s   (%d.%d) %4d %6d \n", p.name,p.overs,p.bowballs,p.wickets,p.conruns);
		}
		text2.setText(s);
		ex.setText(""+bat.extrass);
	}
	public boolean bcheck(){
		if((bm1==true && bm2==true) && bm==true) {
			bm1=false;bm2=false;bm=false;
			return true;
		}
		return false;
	}
	/**
	 * Create the frame.
	 */
	public Myframe() {
		
		t1=new Team();
		t2=new Team();
		
		able=false;
		wi=false;
		no=false;
		by=false;
		
		bm=false;
		bm1=false;
		bm2=false;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel toppan = new JPanel();
		toppan.setBackground(new Color(0, 0, 128));
		toppan.setBounds(0, 0, 684, 28);
		contentPane.add(toppan);
		toppan.setLayout(null);
		
		JLabel headlab = new JLabel("CRICKET MATCH");
		headlab.setForeground(Color.WHITE);
		headlab.setFont(new Font("Tahoma", Font.BOLD, 20));
		headlab.setHorizontalAlignment(SwingConstants.CENTER);
		headlab.setBounds(263, 0, 206, 28);
		toppan.add(headlab);
		
		JPanel sidepan = new JPanel();
		sidepan.setBackground(SystemColor.activeCaptionBorder);
		sidepan.setBounds(0, 35, 142, 465);
		contentPane.add(sidepan);
		sidepan.setLayout(null);
		
		JButton but1 = new JButton("HOME");
		but1.setFocusable(false);
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpan(homepan);
			}
		});
		but1.setBounds(0, 0, 142, 31);
		sidepan.add(but1);
		
		JButton but2 = new JButton("PLAYING 11");
		but2.setVisible(false);
		but2.setFocusable(false);
		but2.setBounds(0, 33, 142, 31);
		sidepan.add(but2);
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpan(teamdetails);
			}
		});
		
		but3 = new JButton("FIRST INNIGS");
		but3.setFocusable(false);
		but3.setVisible(false);
		but3.setBounds(0, 66, 142, 31);
		sidepan.add(but3);
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchpan(inings1);
			}
		});
		fsc = new JButton("FIRST INNIGS");
		fsc.setFocusable(false);
		fsc.setVisible(false);
		fsc.setBounds(0, 66, 142, 31);
		fsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpan(fisc);
			}
		});
		sidepan.add(fsc);
	
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(145, 35, 539, 465);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		homepan = new JPanel();
		layeredPane.add(homepan, "name_104316088969500");
		homepan.setLayout(null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(0, 0, 539, 465);
		homepan.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panteam = new JPanel();
		layeredPane_1.add(panteam, "name_108662438791500");
		panteam.setLayout(null);
		
		JLabel teamlab = new JLabel("TEAMS");
		teamlab.setForeground(Color.BLACK);
		teamlab.setBackground(Color.BLUE);
		teamlab.setFont(new Font("Tahoma", Font.BOLD, 20));
		teamlab.setHorizontalAlignment(SwingConstants.CENTER);
		teamlab.setBounds(153, 62, 235, 26);
		panteam.add(teamlab);
		
		gt1 = new JTextField();
		gt1.setForeground(Color.GRAY);
		gt1.setFont(new Font("Tahoma", Font.BOLD, 17));
		gt1.setHorizontalAlignment(SwingConstants.CENTER);
		gt1.setBounds(139, 149, 278, 31);
		gt1.setText("Team A");
		panteam.add(gt1);
		gt1.setColumns(10);
		
		gt2 = new JTextField();
		gt2.setHorizontalAlignment(SwingConstants.CENTER);
		gt2.setForeground(Color.GRAY);
		gt2.setFont(new Font("Tahoma", Font.BOLD, 17));
		gt2.setBounds(139, 203, 278, 31);
		gt2.setText("Team B");
		panteam.add(gt2);
		gt2.setColumns(10);
		
		JButton tsub = new JButton("NEXT");
		tsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==tsub){
					String a=gt1.getText();
					a=a.toUpperCase();
					String b=gt2.getText();
					b=b.toUpperCase();
					
					if(a.isEmpty())
						return;
					else if(b.isEmpty() || a==b)
						return;
					t1.setName(a);
					t2.setName(b);
					
					tb1.setText(a);
					tb2.setText(b);
					
					ta.setText(a);
					tb.setText(b);
					
					switchpan(pantoss);
				}
			}
		});
		tsub.setBounds(211, 299, 128, 31);
		panteam.add(tsub);
		
		pantoss = new JPanel();
		layeredPane_1.add(pantoss, "name_108683275675200");
		pantoss.setLayout(null);
		
		JLabel tosslab = new JLabel("BATING TEAM");
		tosslab.setFont(new Font("Tahoma", Font.BOLD, 18));
		tosslab.setHorizontalAlignment(SwingConstants.CENTER);
		tosslab.setBounds(204, 51, 135, 25);
		pantoss.add(tosslab);
		
		tb1 = new JButton();
		tb1.setText(t1.getName());	
		tb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==tb1) {
					t1.toss(true);
					t2.toss(false);
					
					bat=t1;
					bowl=t2;
	
					
					switchpan(pan11);
				}
			}
		});
		tb1.setBounds(200, 154, 162, 33);
		pantoss.add(tb1);
		
		tb2 = new JButton();
		tb2.setText(t2.getName());
		tb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==tb2) {
					t2.toss(true);
					t1.toss(false);
					
					bat=t2;
					bowl=t1;
					
					switchpan(pan11);
				}
			}
		});
		tb2.setBounds(200, 213, 162, 33);
		pantoss.add(tb2);
		
		pan11= new JPanel();
		layeredPane_1.add(pan11, "name_108720146590800");
		pan11.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEAMS PLAYING 11");
		lblNewLabel.setBounds(65, 0, 404, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pan11.add(lblNewLabel);
		
		ta = new JTextField();
		ta.setForeground(Color.WHITE);
		ta.setFont(new Font("Tahoma", Font.BOLD, 17));
		ta.setHorizontalAlignment(SwingConstants.CENTER);
		ta.setBackground(Color.BLUE);
		ta.setEditable(false);
		ta.setBounds(10, 34, 238, 31);
		pan11.add(ta);
		ta.setColumns(10);
		
		tb = new JTextField();
		tb.setForeground(Color.WHITE);
		tb.setFont(new Font("Tahoma", Font.BOLD, 17));
		tb.setHorizontalAlignment(SwingConstants.CENTER);
		tb.setBackground(Color.BLUE);
		tb.setEditable(false);
		tb.setColumns(10);
		tb.setBounds(285, 34, 238, 31);
		pan11.add(tb);
		
		panel = new JPanel();
		panel.setBounds(10, 65, 238, 316);
		pan11.add(panel);
		panel.setLayout(new GridLayout(11,1));
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(285, 65, 238, 316);
		pan11.add(panel1);
		panel1.setLayout(new GridLayout(11, 1));
		
		{
		teamdetails = new JPanel();
		layeredPane.add(teamdetails, "name_104320786068100");
		teamdetails.setLayout(null);
		
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 87, 238, 328);
		teamdetails.add(panel_1);
		panel_1.setLayout(new GridLayout(12,1));
		
		panel_2 = new JPanel();
		panel_2.setBounds(291, 87, 238, 328);
		teamdetails.add(panel_2);
		panel_2.setLayout(new GridLayout(12,1));
	
		
		at=new JTextField[11];
		bt=new JTextField[11];
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.BLUE);
		textField.setBounds(10, 50, 238, 31);
		textField.setForeground(Color.WHITE);
		teamdetails.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLUE);
		textField_1.setBounds(291, 50, 238, 31);
		textField_1.setForeground(Color.WHITE);
		teamdetails.add(textField_1);
		}
		
		g1=new JTextField[11];
		g2=new JTextField[11];
		
		a=new Player[11];
		b=new Player[11];
		
		for(int i=0;i<11;i++) {
			
			a[i]=new Player();
			b[i]=new Player();
			
			g1[i]=new JTextField();
			g1[i].setHorizontalAlignment(SwingConstants.CENTER);
			g1[i].setForeground(Color.GRAY);
			g1[i].setFont(new Font("Tahoma", Font.BOLD, 18));
			g1[i].setText("player A "+i);
			g1[i].setColumns(10);
			panel.add(g1[i]);
			
			at[i]=new JTextField();
			at[i].setHorizontalAlignment(SwingConstants.CENTER);
			at[i].setForeground(Color.black);
			at[i].setFont(new Font("Tahoma", Font.BOLD, 18));
			at[i].setColumns(10);
			at[i].setEditable(false);
			panel_1.add(at[i]);
			
			bt[i]=new JTextField();
			bt[i].setHorizontalAlignment(SwingConstants.CENTER);
			bt[i].setForeground(Color.black);
			bt[i].setFont(new Font("Tahoma", Font.BOLD, 18));
			bt[i].setColumns(10);
			bt[i].setEditable(false);
			panel_2.add(bt[i]);
			
			g2[i]=new JTextField();
			g2[i].setHorizontalAlignment(SwingConstants.CENTER);
			g2[i].setForeground(Color.GRAY);
			g2[i].setFont(new Font("Tahoma", Font.BOLD, 18));
			g2[i].setText("player B "+i);
			g2[i].setColumns(10);
			panel1.add(g2[i]);
		}
	
		JButton newmatchbut = new JButton("NEW MATCH");
		newmatchbut.setBounds(195, 395, 141, 31);
		pan11.add(newmatchbut);
		newmatchbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==newmatchbut) {
			
					for(int i=0;i<11;i++) {
						String n1=g1[i].getText();
						String n2=g2[i].getText();	
						if(n1.isEmpty() || n2.isEmpty())
							return;	
					}
					for(int i=0;i<11;i++) {
						String n1=g1[i].getText();
						n1=n1.toUpperCase();
						String n2=g2[i].getText();
						n2=n2.toUpperCase();
				
						a[i].name=n1;
						b[i].name=n2;
						
						at[i].setText(n1);
						bt[i].setText(n2);
					}
					Player[] fb,sb;
					if(bat.name.equals(t1.name)) {
						fb=a;
						sb=b;
					}
					else {
						fb=b;
						sb=a;
					}
					for(int i=0;i<11;i++) {
						comboBox_1.addItem(fb[i].name);
						comboBox_2.addItem(fb[i].name);
						comboBox_6.addItem(fb[i].name);
						comboBox_3.addItem(sb[i].name);
						comboBox_4.addItem(sb[i].name);
						comboBox_5.addItem(sb[i].name);
						
						bat.players.add(fb[i]);
						bowl.players.add(sb[i]);
					}
					tsub.setVisible(false);
					but2.setVisible(true);
					but3.setVisible(true);
					
					textField.setText(t1.getName());
					textField_1.setText(t2.getName());
					
					lblNewLabel_2.setText(bat.getName());
					lblNewLabel11.setText(bowl.getName());
					
					runsf.setText(""+bat.score);
					wicketsf.setText(""+bat.wickets);
					oversf.setText(""+bat.overs+" ."+bat.balls);
					extrassf.setText(""+bat.extrass);
					
					runsff.setText(""+bowl.score);
					wicketsff.setText(""+bowl.wickets);
					oversff.setText(""+bowl.overs+" ."+bat.balls);
					extrassff.setText(""+bowl.extrass);
					switchpan(teamdetails);
				}
			}
		});

		JLabel lab1 = new JLabel("PLAYING  11");
		lab1.setHorizontalAlignment(SwingConstants.CENTER);
		lab1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lab1.setBounds(163, 11, 224, 28);
		teamdetails.add(lab1);
	
//		******************************************************************************
		
		inings1 = new JPanel();
		layeredPane.add(inings1, "name_104326297775400");
		inings1.setLayout(null);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(0, 0, 539, 465);
		inings1.add(layeredPane_2);
		layeredPane_2.setLayout(new CardLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		layeredPane_2.add(panel_3, "name_155076224014300");
		panel_3.setLayout(null);
		
		
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(156, 11, 193, 24);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("RUNS ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(38, 65, 62, 24);
		panel_3.add(lblNewLabel_1);
		
		runsf = new JTextField();
		runsf.setFont(new Font("Tahoma", Font.BOLD, 20));
		runsf.setEditable(false);
		runsf.setColumns(10);
		runsf.setBackground(Color.WHITE);
		runsf.setBounds(142, 63, 114, 26);
		panel_3.add(runsf);
		
		JLabel lblNewLabel_1_1 = new JLabel("WICKETS");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(38, 104, 79, 24);
		panel_3.add(lblNewLabel_1_1);
		
		wicketsf = new JTextField();
		wicketsf.setFont(new Font("Tahoma", Font.BOLD, 20));
		wicketsf.setEditable(false);
		wicketsf.setColumns(10);
		wicketsf.setBackground(Color.WHITE);
		wicketsf.setBounds(142, 100, 114, 26);
		panel_3.add(wicketsf);
		
		oversf = new JTextField();
		oversf.setFont(new Font("Tahoma", Font.BOLD, 20));
		oversf.setEditable(false);
		oversf.setColumns(10);
		oversf.setBackground(Color.WHITE);
		oversf.setBounds(142, 137, 114, 26);
		panel_3.add(oversf);
		
		extrassf = new JTextField();
		extrassf.setFont(new Font("Tahoma", Font.BOLD, 20));
		extrassf.setEditable(false);
		extrassf.setColumns(10);
		extrassf.setBackground(Color.WHITE);
		extrassf.setBounds(142, 174, 114, 26);
		panel_3.add(extrassf);
		
		JLabel lblNewLabel_1_2 = new JLabel("OVERS");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(38, 139, 90, 24);
		panel_3.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("EXTRASS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(38, 174, 79, 24);
		panel_3.add(lblNewLabel_3);
		
		btn1 = new JButton("*");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {
					if(wi==true) {
						ex_wi(0);
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(by==true) {
						ex_by(0);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(no==true) {
						ex_no(0);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else {
						hitruns(0);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(309, 65, 46, 40);
		panel_3.add(btn1);
		
		btn2 = new JButton("1");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2) {
					if(wi==true) {
						ex_wi(1);
						switchStrike();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(by==true) {
						ex_by(1);
						countballs();
						switchStrike();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(no==true) {
						ex_no(1);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						switchStrike();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else {
					hitruns(1);
					countballs();
					switchStrike();
					check();
					update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(368, 67, 46, 40);
		panel_3.add(btn2);
		
		btn3 = new JButton("2");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn3) {
					if(wi==true) {
						ex_wi(2);
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(by==true) {
						ex_by(2);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(no==true) {
						ex_no(2);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else {
						hitruns(2);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(424, 67, 46, 40);
		panel_3.add(btn3);
		
		btn4 = new JButton("3");
		btn4.setEnabled(false);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(483, 67, 46, 40);
		panel_3.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn4) {
					if(wi==true) {
						ex_wi(3);
						switchStrike();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(by==true) {
						ex_by(3);
						countballs();
						switchStrike();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(no==true) {
						ex_no(3);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						switchStrike();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else {
						hitruns(3);
						countballs();
						switchStrike();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
				}
			}
		});
		
		btn5 = new JButton("4");
		btn5.setEnabled(false);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(309, 116, 46, 40);
		panel_3.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn5) {
					if(wi==true) {
						ex_wi(4);
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(by==true) {
						ex_by(4);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(no==true) {
						ex_no(4);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else {
						hitruns(4);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
				}
			}
		});
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(368, 118, 46, 40);
		panel_3.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn6) {
					if(wi==true) {
						ex_wi(6);
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(by==true) {
						ex_by(0);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else if(no==true) {
						ex_no(6);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
					else {
						hitruns(6);
						countballs();
						check();
						update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					}
				}
			}
		});
		
		btn9 = new JButton("-");
		btn9.setEnabled(false);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(309, 169, 46, 40);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn9) {
					wi=true;
					wide();
					update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
				}
			}
		});
		panel_3.add(btn9);
		
		btn8 = new JButton("B");
		btn8.setEnabled(false);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(368, 169, 46, 40);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn8) {
					by=true;
					update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
				}
			}
		});
		panel_3.add(btn8);
		
		btn10 = new JButton("N");
		btn10.setEnabled(false);
		btn10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn10.setBounds(424, 118, 105, 40);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn10) {
					no=true;
					wide();
					update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
				}
			}
		});
		panel_3.add(btn10);
		
		btn11 = new JButton("W");
		btn11.setEnabled(false);
		btn11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn11.setBounds(427, 169, 102, 40);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn11) {
					out(comboBox_1,textField_2);
					update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
					if(bat.wickets==10)
						check();			
					if(bat.balls==6) {
						ww=true;
						return;
					}
					check();
				}
			}
		});
		panel_3.add(btn11);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setEditable(false);
		textField_2.setBounds(23, 265, 253, 24);
		panel_3.add(textField_2);
		textField_2.setVisible(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(23, 323, 253, 24);
		textField_3.setVisible(false);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(286, 323, 253, 24);
		textField_4.setVisible(false);
		panel_3.add(textField_4);
		
		comboBox_1 = new JComboBox<String>();  
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_1) { 
					bm1=true;
					for(Player p : bat.players) {
						if(p.name.equals(comboBox_1.getSelectedItem())){
							striker=p;
							textField_2.setText(striker.name);
							textField_2.setVisible(true);
							comboBox_1.setVisible(false);	
							
							if(able==true) {
								bat.scorelist.add(striker);
								btnenable();
							}
							if(ww==true) {
								check();
								update(runsf,oversf,wicketsf,extrassf,textField_2,textField_3,textField_4);
								btndisable();
								ww=false;
							}
						}
					}
				}
			}
		});
		comboBox_1.setBounds(23, 265, 253, 24);
		panel_3.add(comboBox_1);
	
		comboBox_2 = new JComboBox<String>();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_2) {
					bm2=true;
					for(Player p : bat.players) {
						if(p.name.equals(comboBox_2.getSelectedItem())) {
							nonstriker=p;
							textField_3.setText(nonstriker.name);	
							comboBox_2.setVisible(false);
							textField_3.setVisible(true);
							if(able==true)
								btnenable();
						}
					}
				 }
			}
		});
		
		comboBox_2.setBounds(23, 323, 253, 24);
		panel_3.add(comboBox_2);
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_3) {
					bm=true;
					for(Player p : bowl.players) {
						if(p.name.equals(comboBox_3.getSelectedItem())) {
							bowler=p;
							textField_4.setVisible(true);
							textField_4.setText(bowler.name);
							comboBox_3.setVisible(false);
							if(bowl.outlist.contains(bowler)) {
								
							}
							else {
								bowl.outlist.add(bowler);
							}
							if(able==true)
								btnenable();
							if(bcheck())
								btnNewButton_7.setVisible(true);	
						}
					}
				}
			}
		});
		comboBox_3.setBounds(286, 324, 253, 24);
		panel_3.add(comboBox_3);
		
		btnNewButton_7 = new JButton("play");
		btnNewButton_7.setVisible(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_7) {
					
					btnenable();
					btnNewButton_7.setVisible(false);
					btnNewButton.setVisible(true);
					bat.scorelist.add(striker);
					bat.scorelist.add(nonstriker);	
				}
			}
		});
		btnNewButton_7.setBounds(166, 383, 137, 32);
		panel_3.add(btnNewButton_7);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("STRIKER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(23, 239, 77, 24);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("NON STRIKER");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(23, 300, 120, 24);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("BOWLER");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2.setBounds(291, 300, 77, 24);
		panel_3.add(lblNewLabel_4_2);
		
		btnNewButton = new JButton("SCORE CARD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
				switchpan(fisc);
				lblNewLabel_5.setText(bat.name+" SCORE CARD");
				textField_5.setText(""+bat.score);
				textField_6.setText(""+bat.overs+" . "+bat.balls);
				printlist(textPane_1,textPane_2,textField_9);
				}
			}
		});
		btnNewButton.setBounds(167, 383, 136, 32);
		btnNewButton.setVisible(false);
		panel_3.add(btnNewButton);
		
		
		
		fisc = new JPanel();
		layeredPane_2.add(fisc, "name_692496033487000");
		fisc.setLayout(null);
		
		lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 11, 519, 21);
		fisc.add(lblNewLabel_5);
		
		
		
		textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setEditable(false);
		textPane_1.setBounds(10, 76, 262, 301);
		fisc.add(textPane_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_5.setBackground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setBounds(200, 388, 72, 27);
		fisc.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_6.setBackground(Color.WHITE);
		textField_6.setEditable(false);
		textField_6.setBounds(58, 388, 72, 27);
		fisc.add(textField_6);
		textField_6.setColumns(10);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("   BATSMAN                              RUNS         BALLS");
		lblNewLabel_6.setBounds(10, 51, 275, 21);
		fisc.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TOTAL =");
		lblNewLabel_7.setBounds(150, 388, 50, 27);
		fisc.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("OVERS =");
		lblNewLabel_8.setBounds(10, 388, 50, 27);
		fisc.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("   BOWLER              OVERS  WICKETS  RUNS");
		lblNewLabel_9.setBounds(282, 51, 247, 21);
		fisc.add(lblNewLabel_9);
		
		textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textPane_2.setBounds(278, 76, 251, 225);
		textPane_2.setEditable(false);
		fisc.add(textPane_2);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_7.setBounds(390, 312, 139, 27);
		fisc.add(textField_7);
		textField_7.setEditable(false);
		textField_7.setVisible(false);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.WHITE);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_8.setColumns(10);
		textField_8.setVisible(false);
		textField_8.setBounds(390, 350, 139, 27);
		textField_8.setEditable(false);
		fisc.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(Color.WHITE);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_9.setColumns(10);
		textField_9.setBounds(390, 388, 139, 27);
		textField_9.setEditable(false);
		fisc.add(textField_9);
		
		lblNewLabel_10 = new JLabel("TOP RUN GETER =");
		lblNewLabel_10.setVisible(false);
		lblNewLabel_10.setBounds(288, 312, 101, 27);
		fisc.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("TOP WICK GETER =");
		lblNewLabel_11.setVisible(false);
		lblNewLabel_11.setBounds(282, 350, 106, 27);
		fisc.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("EXTRASS =");
		lblNewLabel_12.setBounds(322, 388, 66, 27);
		fisc.add(lblNewLabel_12);	
		
	//	**********************************************************
		
		but4 = new JButton("SECOND INNINGS");
		but4.setBounds(0, 98, 142, 31);
		sidepan.add(but4);
		but4.setVisible(false);
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchpan(inings2);
			}
		});
		ssc = new JButton("SECOND INNIGS");
		ssc.setFocusable(false);
		ssc.setVisible(false);
		ssc.setBounds(0, 98, 142, 31);
		ssc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpan(sisc);
			}
		});
		sidepan.add(ssc);
		
		btnNewButton_1 = new JButton("MATCH SUMMARY");
		btnNewButton_1.setBounds(0, 129, 142, 31);
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_10.setText(String.format(" %s  %40d - %d",bowl.name,bowl.score,bowl.wickets));
				textField_11.setText(String.format(" %s  %40d - %d",bat.name,bat.score,bat.wickets));
				switchpan(panel_5);
			}
		});
		sidepan.add(btnNewButton_1);
		
		inings2 = new JPanel();
		layeredPane.add(inings2, "name_7960017428030001");
		inings2.setLayout(null);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(0, 0, 539, 465);
		inings2.add(layeredPane_3);
		layeredPane_3.setLayout(new CardLayout(0, 0));
		
		panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.controlHighlight);
		layeredPane_3.add(panel_4, "name_1550762240143001");
		panel_4.setLayout(null);
		
		
		
		lblNewLabel11 = new JLabel();
		lblNewLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel11.setBounds(10, 11, 529, 24);
		panel_4.add(lblNewLabel11);
		
		JLabel lblNewLabel12= new JLabel("RUNS ");
		lblNewLabel12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel12.setBounds(38, 65, 62, 24);
		panel_4.add(lblNewLabel12);
		
		runsff = new JTextField();
		runsff.setFont(new Font("Tahoma", Font.BOLD, 20));
		runsff.setEditable(false);
		runsff.setColumns(10);
		runsff.setBackground(Color.WHITE);
		runsff.setBounds(142, 63, 114, 26);
		panel_4.add(runsff);
		
		JLabel lblNewLabel13 = new JLabel("WICKETS");
		lblNewLabel13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel13.setBounds(38, 104, 79, 24);
		panel_4.add(lblNewLabel13);
		
		wicketsff = new JTextField();
		wicketsff.setFont(new Font("Tahoma", Font.BOLD, 20));
		wicketsff.setEditable(false);
		wicketsff.setColumns(10);
		wicketsff.setBackground(Color.WHITE);
		wicketsff.setBounds(142, 100, 114, 26);
		panel_4.add(wicketsff);
		
		oversff = new JTextField();
		oversff.setFont(new Font("Tahoma", Font.BOLD, 20));
		oversff.setEditable(false);
		oversff.setColumns(10);
		oversff.setBackground(Color.WHITE);
		oversff.setBounds(142, 137, 114, 26);
		panel_4.add(oversff);
		
		extrassff = new JTextField();
		extrassff.setFont(new Font("Tahoma", Font.BOLD, 20));
		extrassff.setEditable(false);
		extrassff.setColumns(10);
		extrassff.setBackground(Color.WHITE);
		extrassff.setBounds(142, 174, 114, 26);
		panel_4.add(extrassff);
		
		JLabel lblNewLabel14 = new JLabel("OVERS");
		lblNewLabel14.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel14.setBounds(38, 139, 90, 24);
		panel_4.add(lblNewLabel14);
		
		JLabel lblNewLabel15= new JLabel("EXTRASS");
		lblNewLabel15.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel15.setBounds(38, 174, 79, 24);
		panel_4.add(lblNewLabel15);
		
		btn21 = new JButton("*");
		btn21.setEnabled(false);
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn21) {

					if(wi==true) {
						ex_wi(0);
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(by==true) {
						ex_by(0);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(no==true) {
						ex_no(0);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else {
						hitruns(0);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
				}
			}
		});
		btn21.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn21.setBounds(309, 65, 46, 40);
		panel_4.add(btn21);
		
		btn22 = new JButton("1");
		btn22.setEnabled(false);
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn22) { 
					if(wi==true) {
						ex_wi(1);
						switchStrike();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(by==true) {
						ex_by(1);
						countballs();
						switchStrike();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(no==true) {
						ex_no(1);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						switchStrike();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else {
					hitruns(1);
					countballs();
					switchStrike();
					check2();
					update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
				}
			}
		});
		btn22.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn22.setBounds(368, 67, 46, 40);
		panel_4.add(btn22);
		
		btn23 = new JButton("2");
		btn23.setEnabled(false);
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn23) {
					if(wi==true) {
						ex_wi(2);
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(by==true) {
						ex_by(2);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(no==true) {
						ex_no(2);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else {
						hitruns(2);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
				}
			}
		});
		btn23.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn23.setBounds(424, 67, 46, 40);
		panel_4.add(btn23);
		
		btn24 = new JButton("3");
		btn24.setEnabled(false);
		btn24.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn24.setBounds(483, 67, 46, 40);
		panel_4.add(btn24);
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn24) {
					if(wi==true) {
						ex_wi(3);
						switchStrike();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(by==true) {
						ex_by(3);
						countballs();
						switchStrike();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(no==true) {
						ex_no(3);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						switchStrike();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else {
						hitruns(3);
						countballs();
						switchStrike();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
				}
			}
		});
		
		btn25 = new JButton("4");
		btn25.setEnabled(false);
		btn25.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn25.setBounds(309, 116, 46, 40);
		panel_4.add(btn25);
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn25) {
					if(wi==true) {
						ex_wi(4);
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(by==true) {
						ex_by(4);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(no==true) {
						ex_no(4);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else {
						hitruns(4);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					
				}
			}
		});
		
		btn26 = new JButton("6");
		btn26.setEnabled(false);
		btn26.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn26.setBounds(368, 118, 46, 40);
		panel_4.add(btn26);
		btn26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn26) {
					if(wi==true) {
						ex_wi(6);
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(by==true) {
						ex_by(0);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else if(no==true) {
						ex_no(6);
						countballs();
						bat.balls--;
						bowler.bowballs--;
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
					else {
						hitruns(6);
						countballs();
						check2();
						update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					}
				}
			}
		});
		
		btn27 = new JButton("-");
		btn27.setEnabled(false);
		btn27.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn27.setBounds(309, 169, 46, 40);
		btn27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn27) {
					wi=true;
					wide();
					update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
				}
			}
		});
		panel_4.add(btn27);
		
		btn28 = new JButton("B");
		btn28.setEnabled(false);
		btn28.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn28.setBounds(368, 169, 46, 40);
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn28) {
					by=true;
					update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
				}
			}
		});
		panel_4.add(btn28);
		
		btn29 = new JButton("N");
		btn29.setEnabled(false);
		btn29.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn29.setBounds(424, 118, 105, 40);
		btn29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn29) {
					no=true;
					wide();
					update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					
				}
			}
		});
		panel_4.add(btn29);
		
		btn30 = new JButton("W");
		btn30.setEnabled(false);
		btn30.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn30.setBounds(427, 169, 102, 40);
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn30) {
					out(comboBox_4,textField_21);
					update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
					if(bat.wickets==10)
						check2();
					if(bat.balls==6) {
						ww=true;
						return;
					}
					check2();
				}
			}
		});
		panel_4.add(btn30);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_21.setEditable(false);
		textField_21.setBounds(23, 265, 253, 24);
		panel_4.add(textField_21);
		textField_21.setVisible(false);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(23, 323, 253, 24);
		textField_22.setVisible(false);
		panel_4.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(286, 323, 253, 24);
		textField_23.setVisible(false);
		panel_4.add(textField_23);
	 	
		comboBox_4 = new JComboBox<String>();  
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_4) { 
					bm1=true;
					for(Player p : bat.players) {
						if(p.name.equals(comboBox_4.getSelectedItem())){
							striker=p;
							textField_21.setText(striker.name);
							textField_21.setVisible(true);
							comboBox_4.setVisible(false);
							if(able==true) {
								bat.scorelist.add(striker);
								btnenable();
							}
							if(ww==true) {
								check2();
								update(runsff,oversff,wicketsff,extrassff,textField_21,textField_22,textField_23);
								btndisable();
								ww=false;
							}
						}
					}
				}
			}
		});
		comboBox_4.setBounds(23, 265, 253, 24);
		panel_4.add(comboBox_4);
		
		comboBox_5 = new JComboBox<String>();
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_5) {
					bm2=true;
					for(Player p : bat.players) {
						if(p.name.equals(comboBox_5.getSelectedItem())) {
							nonstriker=p;
							textField_22.setText(nonstriker.name);	
							comboBox_5.setVisible(false);
							textField_22.setVisible(true);
							if(able==true)
								btnenable();
						}
					}
				 }
			}
		});
		
		comboBox_5.setBounds(23, 323, 253, 24);
		panel_4.add(comboBox_5);
		
		comboBox_6 = new JComboBox<String>();
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==comboBox_6) {
					bm=true;
					for(Player p : bowl.players) {
						if(p.name.equals(comboBox_6.getSelectedItem())) {
							bowler=p;
							textField_23.setVisible(true);
							textField_23.setText(bowler.name);
							comboBox_6.setVisible(false);
							if(bowl.outlist.contains(bowler)) {
								
							}
							else {
								bowl.outlist.add(bowler);
							}
							if(able==true)
								btnenable();
						    }
							if(bcheck())
								btnNewButton1.setVisible(true);
					}
				}
			}
		});
		comboBox_6.setBounds(286, 324, 253, 24);
		panel_4.add(comboBox_6);
	
		btnNewButton1 = new JButton("play");
		btnNewButton1.setVisible(false);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton1) {
					btnenable();
					btnNewButton1.setVisible(false);
					btnNewBut1.setVisible(true);
					bat.scorelist.add(striker);
					bat.scorelist.add(nonstriker);
				}
			}
		});
		btnNewButton1.setBounds(166, 383, 137, 32);
		panel_4.add(btnNewButton1);
		
		
		
		JLabel lblNewLabel1 = new JLabel("STRIKER");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel1.setBounds(23, 239, 77, 24);
		panel_4.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("NON STRIKER");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel2.setBounds(23, 300, 120, 24);
		panel_4.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("BOWLER");
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel3.setBounds(291, 300, 77, 24);
		panel_4.add(lblNewLabel3);
		
		btnNewBut1 = new JButton("SCORE CARD");
		btnNewBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewBut1) {
				switchpan(sisc);
				lblNewLabel31.setText(bat.name+" SCORE CARD");
				textField_51.setText(""+bat.score);
				textField_52.setText(""+bat.overs+" . "+bat.balls);
				printlist(textPane_3,textPane_4,textField_55);
				last.setText(bat.name+" "+(target-bat.score)+" NEED TO WIN FROM TO WIN");
				}
			}
		});
		btnNewBut1.setBounds(167, 383, 136, 32);
		btnNewBut1.setVisible(false);
		panel_4.add(btnNewBut1);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(415, 263, 114, 26);
		panel_4.add(textField_26);
		
		JLabel lblTarget = new JLabel("TARGET");
		lblTarget.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTarget.setBounds(348, 265, 62, 24);
		panel_4.add(lblTarget);
		
//	***********************************************
		
	sisc = new JPanel();
	layeredPane_3.add(sisc, "name_692496033487000");
	sisc.setLayout(null);
	
	lblNewLabel31 = new JLabel();
	lblNewLabel31.setFont(new Font("Tahoma", Font.BOLD, 20));
	lblNewLabel31.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel31.setBounds(10, 11, 519, 21);
	sisc.add(lblNewLabel31);
	
	
	
	textPane_3 = new JTextPane();
	textPane_3.setFont(new Font("Tahoma", Font.BOLD, 17));
	textPane_3.setBackground(Color.WHITE);
	textPane_3.setEditable(false);
	textPane_3.setBounds(10, 76, 262, 301);
	sisc.add(textPane_3);
	
	textPane_4 = new JTextPane();
	textPane_4.setFont(new Font("Tahoma", Font.BOLD, 17));
	textPane_4.setBounds(278, 76, 251, 225);
	textPane_4.setEditable(false);
	sisc.add(textPane_4);
	
	textField_51 = new JTextField();
	textField_51.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_51.setBackground(Color.WHITE);
	textField_51.setEditable(false);
	textField_51.setBounds(200, 388, 72, 27);
	sisc.add(textField_51);
	textField_51.setColumns(10);
	
	textField_52 = new JTextField();
	textField_52.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_52.setBackground(Color.WHITE);
	textField_52.setEditable(false);
	textField_52.setBounds(58, 388, 72, 27);
	sisc.add(textField_52);
	textField_52.setColumns(10);
	
	
	JLabel lblNew= new JLabel("   BATSMAN                              RUNS         BALLS");
	lblNew.setBounds(10, 51, 275, 21);
	sisc.add(lblNew);
	
	JLabel lblNewLabe= new JLabel("TOTAL =");
	lblNewLabe.setBounds(150, 388, 50, 27);
	sisc.add(lblNewLabe);
	
	JLabel lblNewLab= new JLabel("OVERS =");
	lblNewLab.setBounds(10, 388, 50, 27);
	sisc.add(lblNewLab);
	
	JLabel lbl = new JLabel("   BOWLER              OVERS  WICKETS  RUNS");
	lbl.setBounds(282, 51, 247, 21);
	sisc.add(lbl);
	
	
	
	textField_53 = new JTextField();
	textField_53.setBackground(Color.WHITE);
	textField_53.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_53.setBounds(390, 312, 139, 27);
	sisc.add(textField_53);
	textField_53.setEditable(false);
	textField_53.setVisible(false);
	textField_53.setColumns(10);
	
	textField_54 = new JTextField();
	textField_54.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_54.setBackground(Color.WHITE);
	textField_54.setColumns(10);
	textField_54.setVisible(false);
	textField_54.setBounds(390, 350, 139, 27);
	textField_54.setEditable(false);
	sisc.add(textField_54);
	
	textField_55 = new JTextField();
	textField_55.setBackground(Color.WHITE);
	textField_55.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_55.setColumns(10);
	textField_55.setBounds(390, 388, 139, 27);
	textField_55.setEditable(false);
	sisc.add(textField_55);
	
	lblNewLab1 = new JLabel("TOP RUN GETER =");
	lblNewLab1.setVisible(false);
	lblNewLab1.setBounds(288, 312, 101, 27);
	sisc.add(lblNewLab1);
	
	lblNewLab2 = new JLabel("TOP WICK GETER =");
	lblNewLab2.setVisible(false);
	lblNewLab2.setBounds(282, 350, 106, 27);
	sisc.add(lblNewLab2);
	
	JLabel lbl12 = new JLabel("EXTRASS =");
	lbl12.setBounds(322, 388, 66, 27);
	sisc.add(lbl12);
	
	last = new JTextField();
	last.setHorizontalAlignment(SwingConstants.CENTER);
	last.setFont(new Font("Tahoma", Font.BOLD, 20));
	last.setEditable(false);
	last.setColumns(10);
	last.setBackground(Color.WHITE);
	last.setBounds(10, 427, 519, 27);
	sisc.add(last);
	
	panel_5 = new JPanel();
	layeredPane.add(panel_5, "name_69289677170200");
	panel_5.setLayout(null);
	
	JLabel lblNewLabel_5_1 = new JLabel();
	lblNewLabel_5_1.setText("MATCH  SUMMARY");
	lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	lblNewLabel_5_1.setBounds(10, 11, 519, 21);
	panel_5.add(lblNewLabel_5_1);
	
	textField_10 = new JTextField();
	textField_10.setFont(new Font("Tahoma", Font.BOLD, 20));
	textField_10.setEditable(false);
	textField_10.setForeground(Color.WHITE);
	textField_10.setBackground(Color.BLUE);
	textField_10.setBounds(47, 60, 459, 27);
	panel_5.add(textField_10);
	textField_10.setColumns(10);
	
	textField_11 = new JTextField();
	textField_11.setFont(new Font("Tahoma", Font.BOLD, 20));
	textField_11.setForeground(Color.WHITE);
	textField_11.setEditable(false);
	textField_11.setBackground(Color.BLUE);
	textField_11.setColumns(10);
	textField_11.setBounds(47, 213, 459, 27);
	panel_5.add(textField_11);
	
	textField_12 = new JTextField();
	textField_12.setFont(new Font("Tahoma", Font.BOLD, 20));
	textField_12.setHorizontalAlignment(SwingConstants.CENTER);
	textField_12.setForeground(Color.WHITE);
	textField_12.setEditable(false);
	textField_12.setBackground(Color.BLUE);
	textField_12.setColumns(10);
	textField_12.setBounds(47, 374, 459, 27);
	panel_5.add(textField_12);
	
	textField_13 = new JTextField();
	textField_13.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_13.setBackground(Color.WHITE);
	textField_13.setEditable(false);
	textField_13.setBounds(47, 99, 227, 27);
	panel_5.add(textField_13);
	textField_13.setColumns(10);
	
	textField_14 = new JTextField();
	textField_14.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_14.setBackground(Color.WHITE);
	textField_14.setEditable(false);
	textField_14.setColumns(10);
	textField_14.setBounds(279, 99, 227, 27);
	panel_5.add(textField_14);
	
	textField_15 = new JTextField();
	textField_15.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_15.setBackground(Color.WHITE);
	textField_15.setEditable(false);
	textField_15.setColumns(10);
	textField_15.setBounds(47, 137, 227, 27);
	panel_5.add(textField_15);
	
	textField_16 = new JTextField();
	textField_16.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_16.setBackground(Color.WHITE);
	textField_16.setEditable(false);
	textField_16.setColumns(10);
	textField_16.setBounds(47, 175, 227, 27);
	panel_5.add(textField_16);
	
	textField_17 = new JTextField();
	textField_17.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_17.setBackground(Color.WHITE);
	textField_17.setEditable(false);
	textField_17.setColumns(10);
	textField_17.setBounds(279, 137, 227, 27);
	panel_5.add(textField_17);
	
	textField_18 = new JTextField();
	textField_18.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_18.setBackground(Color.WHITE);
	textField_18.setEditable(false);
	textField_18.setColumns(10);
	textField_18.setBounds(47, 256, 227, 27);
	panel_5.add(textField_18);
	
	textField_19 = new JTextField();
	textField_19.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_19.setBackground(Color.WHITE);
	textField_19.setEditable(false);
	textField_19.setColumns(10);
	textField_19.setBounds(47, 293, 227, 27);
	panel_5.add(textField_19);
	
	textField_20 = new JTextField();
	textField_20.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_20.setBackground(Color.WHITE);
	textField_20.setEditable(false);
	textField_20.setColumns(10);
	textField_20.setBounds(47, 331, 227, 27);
	panel_5.add(textField_20);
	
	textField_24 = new JTextField();
	textField_24.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_24.setBackground(Color.WHITE);
	textField_24.setEditable(false);
	textField_24.setColumns(10);
	textField_24.setBounds(279, 256, 227, 27);
	panel_5.add(textField_24);
	
	textField_25 = new JTextField();
	textField_25.setFont(new Font("Tahoma", Font.BOLD, 17));
	textField_25.setBackground(Color.WHITE);
	textField_25.setEditable(false);
	textField_25.setColumns(10);
	textField_25.setBounds(279, 293, 227, 27);
	panel_5.add(textField_25);
	
	
	
	
	
		
	}
}
