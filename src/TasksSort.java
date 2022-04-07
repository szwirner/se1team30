public class TasksSort implements TasksSortIF{

	private String[][] sort;
	
	public TasksSort(String[][] strings) {
		this.sort = strings;
	}

	@Override
	public String[][] getSort() {
		return sort;
	}

	@Override
	public boolean isWellSorted(String[] sequence) {
		for(int i = 0; i < sort.length; i++) {
			String first = sort[i][0];
			String second = sort[i][1];
			int indexFirst = -1;
			int indexSecond = -1;
			for(int j = 0; j < sequence.length; j++) {
				if(first.equals(sequence[j])) {
					indexFirst = j;
				}
				if(second.equals(sequence[j])) {
					indexSecond = j;
				}
			}
			if(indexFirst == -1 || indexSecond == -1) {
				continue;
			}
			if(indexFirst > indexSecond) {
				return false;
			}
		}
		return true;
	}

}
