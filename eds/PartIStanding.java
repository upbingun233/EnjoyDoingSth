package eds;

import java.io.Serializable;

@SuppressWarnings("serial")
/**
 * PartI的替身
 */
public class PartIStanding  implements Serializable {
	public int score=0;
	public int part=1;
	@Override
	public String toString() {
		return "score="+this.score+";part="+this.part;
	}
}
