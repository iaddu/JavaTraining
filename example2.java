/*2. You have a file that stores data about players' scores they achieved in different matches against different teams at different points in time, 
You have to identify the highest score of each player among all the matches
If the entry is only a string that is the name of the player, and if the entry is pak_55_01_nov that implies the match against Pakistan scored 55 
runs on November first.*/

import java.io.*;
import java.util.*;
class Demo{
	public static int myScore(String str){
		StringTokenizer st=new StringTokenizer(str,"_");
		String sc="0";
		int n=2;
		for(int i=1;i<=n;i++){
			if(st.hasMoreTokens())sc=st.nextToken();
		}
		int res=0;
		try{
			res=Integer.parseInt(sc);
		}
		catch(Exception e){
			res=0;
		}
		return res;
	}
	private static HashMap<String,Integer> readScoresFromCsv (String filename) throws Exception{
		HashMap<String,Integer> myMap=new HashMap<>();
		BufferedReader br=new BufferedReader(new FileReader(filename));
		String line;
		while(true){
			line=br.readLine();
			if(line==null)break;
			String []data=line.split(",");
			String name=data[0].trim();
			int res=0;
			for(int i=1;i<data.length;i++){
				res=Math.max(res,myScore(data[i].trim()));
			}
			myMap.put(name,res);
		}
		return myMap;
	}
	public static void display(HashMap<String,Integer>myMap){
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
	}
	public static void main (String ar[]) throws Exception{
		String filename="Scores.csv";
		HashMap<String,Integer> myMap=readScoresFromCsv(filename);
		//traverse map
		display(myMap);
	}
	
}
