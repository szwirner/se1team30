
public class Sort implements SortIF {
	private String[][] ruleset;
	

	public Sort(String [][] ruleset) {
		this.ruleset = ruleset;
	}

	
	@Override
	public boolean isWellSorted(String[] s) {
		int t=0;
		for(int i=0; i<s.length; i++) {
			for(int a=0;a<ruleset.length; a++) {
				if(s[i].equals(ruleset[a][1])) {
					for(int b=0;b<i;b++) {
						if(ruleset[a][0].equals(s[b])) 	t=1;
					}
					if(t==0) return false;
					t=0;
				}
			}
		}
		return true;
	}

}
