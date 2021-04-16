public class refactoritzacio2 {
	public int sou;

	public refactoritzacio2(int losou) {
		setSou(losou);
	}
	
	public int getSou() {
		return sou;
	}

	public void setSou(int sou) {
		this.sou = sou;
	}

	public boolean EsBonempleat(int problemes) {
		if(problemes == 0) {
			return true;
		}
		
		else if(problemes < 3) {
			if(getSou() < 500) {
				return true;
			}
		
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}

}