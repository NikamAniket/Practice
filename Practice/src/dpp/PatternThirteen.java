package dpp;

public class PatternThirteen {
	public static void patternThirteen(int n) {
		int flag=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(flag);
				flag++;
					}
			
	System.out.println();
			}
		}

	public static void main(String[] args) {
		PatternThirteen.patternThirteen(5);

	}

}
