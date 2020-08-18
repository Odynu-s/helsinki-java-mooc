package farmsimulator;

public class MilkingRobot {
	private BulkTank tank;
	
	public MilkingRobot() {
		
	}
	
	public BulkTank getBulkTank() {
		if (tank == null) {
			return null;
		}
		return tank;	
	}
	
	public void setBulkTank(BulkTank tank) {
		this.tank = tank;
	}
	
	public void milk(Milkable milkable) {
		if (getBulkTank() == null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed.");
		}else {
			tank.addToTank(milkable.milk());
		}
	}
}
