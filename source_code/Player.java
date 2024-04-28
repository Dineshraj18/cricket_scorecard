package cricket_scorecard;

public class Player {
	public String name;
	
	public int runs;
	public int balls;
	public int four;
	public int six;
	
	public int overs;
	public int bowballs;
	public int wickets;
	public int conruns;
	
	public Player() {
		runs=0;
		balls=0;
		four=0;
		six=0;
		
		overs=0;
		bowballs=0;
		wickets=0;
		conruns=0;
	}
	

	public String getname() {
		return name;
	}
}
