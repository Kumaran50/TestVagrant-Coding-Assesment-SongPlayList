package songPlayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongPlayList {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		List<String> m=new ArrayList<String>();
		Scanner n=new Scanner(System.in);
		int number=n.nextInt();
		int capacity=n.nextInt();
		for(int i=0;i<number;i++)
		{
			String listNumbers=n.next();
			l.add(listNumbers);
		}
		for(int i=0;i<capacity;i++)
		{
			System.out.println("Enter the song:");
			String list=n.next();
			if(l.contains(list))
			{
				m.add(list);
			}
			else {
				System.out.println("Song is not in the list");
			}
		}
		int numberOfTrials=n.nextInt();
		for(int i=0;i<numberOfTrials;i++)
		{
		 System.out.println("Enter the current song:");
		 String song=n.next();
		 if(l.contains(song))
		 {
			 m.add(song);
			 m.remove(0);
		 }
		 else {
			 System.out.println("Current Song is not in the list");
		 }
		 System.out.println(m);
		}
		n.close();
	}
}
