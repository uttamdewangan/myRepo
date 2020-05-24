import java.lang.reflect.Constructor;


public class Song implements Comparable<Song>{
	
	String title;
	String artist;
	Integer year;
	
	
	public Song(String title,String artist,Integer year)
	{
		this.title=title;
		this.artist=artist;
		this.year=year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	public String toString()
	{
		return "Song[Title="+ title + ",Artist= "+ artist +","+"year= " +year +"]";
	}

	@Override
	public int compareTo(Song anotherSong) {
		// TODO Auto-generated method stub
		//return -this.getTitle().compareTo(anotherSong.title);
		return this.getArtist().compareTo(anotherSong.artist);
		
		/*if(this.getYear()>anotherSong.getYear())
		{
			return 1;
		}
		if(this.getYear()<anotherSong.getYear())
		{
			return -1;
		}
		if(this.getYear()==anotherSong.getYear())
		{
			return 0;
		}
		return 2;*/
	
	}
	
	
	

}
