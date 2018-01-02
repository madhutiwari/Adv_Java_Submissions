public class coin_change
{

	public static int minCoins(int[] coins, int m, int V)
	{
	   	int[] table = new int[V+1];
 
	    table[0] = 0;
	 
	    for (int i=1; i<=V; i++)
	        table[i] = Integer.MAX_VALUE;
	 
	    for (int i=1; i<=V; i++)
	    {
	        for (int j=0; j<m; j++)
	          if (coins[j] <= i)
	          {
	              int sub_res = table[i-coins[j]];
	              if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
	                  table[i] = sub_res + 1;
	          }
	    }
	    return table[V];
	}

	public static void main(String[] args) {
		int coins[] = {100,25,10,1};

		int m = 4;
    	int value = 288;

    	int ans = minCoins(coins,m,value);
    	System.out.println("Minimum Coins: "+ans);
	}
}