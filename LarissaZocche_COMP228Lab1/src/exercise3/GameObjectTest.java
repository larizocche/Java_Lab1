package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {

	public static void main(String[] args) {
		String coordX = JOptionPane.showInputDialog("X coordinate: ");
		String coordY = JOptionPane.showInputDialog("Y Coordinate: ");
		String velocity = JOptionPane.showInputDialog("Velocity:");
		String rotation = JOptionPane.showInputDialog("Rotation: ");
		String state = JOptionPane.showInputDialog("Alive (true) or dead (false)?");

		//convert String to Double and state to boolean
		double coordX1 = Double.parseDouble(coordX);
		double coordY1 = Double.parseDouble(coordY);
		double velocity1 = Double.parseDouble(velocity);
		double rotation1 = Double.parseDouble(rotation);
		boolean state1 = Boolean.parseBoolean(state);
		
		
		GameObject object1 = new GameObject (coordX1, coordY1, velocity1, rotation1, state1);
		
		JOptionPane.showMessageDialog(null, object1.getGameObjectInfo());
		
	}
}
