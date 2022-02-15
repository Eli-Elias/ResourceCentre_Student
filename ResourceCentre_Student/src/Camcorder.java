
public class Camcorder extends Item{
	private int opticalZoom;

	//Changed A
	//Changed D
	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	//Comment A
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}

