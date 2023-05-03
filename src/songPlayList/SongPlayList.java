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
		/* Input should be in this form
		  4-->Total Number of Songs
		  3-->Initial capacity
		  S1-->Song1
		  S2-->Song2
		  S3-->Song3
		  S4-->Song4
		  //Based on the Initial Capacity songs must be given.(In this example 3)
		  Enter the song:
		  S1
		  Enter the song:
		  s2
		  Enter the song:
		  S3
		  //
		   2-->Number of Trials. you are checking for adding the current song at the end and least song should be removed
		 Enter the song:
		 S4
		 Output will be [S2,S3,S4]
		 */

	}

}
