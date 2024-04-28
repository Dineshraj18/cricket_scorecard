package cricket_scorecard;

import java.util.ArrayList;

public class Team {
	public String name;
	
	public int score;
	public int wickets;
	public int overs;
	public int balls;
	public int extrass;
	
	public boolean batting;
	public ArrayList<Player>players;
	public ArrayList<Player>scorelist;
	public ArrayList<Player>outlist;
	
	public Team() {
		score=0;
		wickets=0;
		overs=0;
		balls=0;
		extrass=0;
		players=new ArrayList<Player>();
		scorelist=new ArrayList<Player>();
		outlist=new ArrayList<Player>();
	}
	
	
	public void setName(String s) {
		name=s;
	}
	public void toss(boolean b) {
		batting=b;
	}
	public String getName() {
		return name;
	}
	public void pplayers() {
		for(Player i:players) {
			System.out.println(i.name);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
