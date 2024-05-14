package Players.Positions;

import Players.players;

public class SmallForward extends players {

	protected int Offense;
	protected int Defense;
	protected int Rebounding;
	protected int Playmaking;
	protected String name;
	protected String Type;
	
	@Override
	public int getOffense() {
		// TODO Auto-generated method stub
		return Offense;
	}

	@Override
	public int getDefense() {
		// TODO Auto-generated method stub
		return Defense;
	}

	@Override
	public int getRebounding() {
		// TODO Auto-generated method stub
		return Rebounding;
	}

	@Override
	public int getPlaymaking() {
		// TODO Auto-generated method stub
		return Playmaking;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return Type;
	}
private String Position = "Small Forward";
	
	public String getPosition() {
		return Position;
	}
}
