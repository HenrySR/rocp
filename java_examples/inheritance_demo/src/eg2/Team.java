package eg2;

public class Team extends Player {
	
	private String teamname;
	private int tid;
	private String coachname;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
}
