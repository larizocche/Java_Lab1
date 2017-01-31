package exercise3;

public class GameObject 
{
	//instance variables
	private double coordX;
	private double coordY;
	private double velocity;
	private double rotation;
	private boolean state = true;
	
	//constructor
		
	public GameObject(double coordX, double coordY, double velocity, double rotation, boolean state ) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.velocity = velocity;
		this.rotation = rotation;
		this.state = state;
	}
	public GameObject(){
		
	}
		//getter methods
	public double getVelocity() {
		return velocity;
	}

	public double getCoordX() {
		return coordX;
	}
	public double getCoordY() {
		return coordY;
	}
	public double getRotation() {
		return rotation;
	}

	public boolean isState() {
		return state;
	}
		
	//method to return game object information
	public String getGameObjectInfo(){
		
		String stateStr;
		
		if (state == true){
			stateStr = "Alive";
		}
		else{
			stateStr = "Dead";
		}
		
		return "\nCenter:" + (coordX + coordY) +
				"\nVelocity:"+ velocity +
				"\nRotation:" + rotation + 
				"\nState: " + stateStr;		
	}	
}
