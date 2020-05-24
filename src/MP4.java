import java.util.ArrayList;
import java.util.Collections;


public class MP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList <Song> musicList =new ArrayList<>();
		Song song1=new Song("Take me to your heart", "Michel lean to rock", 2014);
		Song song2=new Song("See you again", "Wiz Khalifa", 2015);
		Song song3=new Song("Love me like you do", "Elli Goulding", 2013);
		Song song4=new Song("Just a dream", "Nelly", 2015);
		Song song5=new Song("As long as you love me ", "Back street Boys", 2008);
		
		
		
		ArrayList<Song> musicList=new ArrayList<>();
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		musicList.add(song5);
		
		TestSort tempList=new TestSort();
		tempList.iterateList(musicList);
		Collections.sort(musicList);
		System.out.println("after sorting");
		tempList.iterateList(musicList);
	}

}
