
class NQT {

	// Function to find the reduced string
	public static String reduced_String(int k, String s)
	{
		// Base Case
		if (k == 1) {
			String ans = "";
			return ans;
		}

		// Creating a stack of type Pair
		Stack<Pair> st = new Stack<Pair>();

		int l = s.length();
		int ctr = 0;

		
		for (int i = 0; i < l; i++) {

			
			if (st.size() == 0) {
				st.push(new Pair(s.charAt(i), 1));
				continue;
			}

			if (st.peek().c == s.charAt(i)) {
				Pair p = st.peek();
				st.pop();
				p.ctr += 1;
				if (p.ctr == k) {
					continue;
				}
				else {
					st.push(p);
				}
			}
			else {

				st.push(new Pair(s.charAt(i), 1));
			}
		}

		String ans = "";
		while (st.size() > 0) {
			char c = st.peek().c;
			int cnt = st.peek().ctr;
			while (cnt-- > 0)
				ans = c + ans;
			st.pop();
		}
		return ans;
	}

	// public static void main(String[] args)
	// {
	// 	int k = 2;
	// 	String st = "iinpuuut";
	// 	String ans = reduced_String(k, st);
	// 	System.out.println(ans);
	// }

	// static class Pair {
	// 	char c;
	// 	int ctr;
	// 	Pair(char c, int ctr)
	// 	{
	// 		this.c = c;
	// 		this.ctr = ctr;
	// 	}
	// }
}
