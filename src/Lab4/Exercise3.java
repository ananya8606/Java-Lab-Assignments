package Lab4;
abstract class Item {
private int identificationNumber;
private String title;
private int numberOfCopies;
 Item(){}
public Item(int identificationNumber, String title, int numberOfCopies) {
	this.identificationNumber = identificationNumber;
	this.title = title;
	this.numberOfCopies = numberOfCopies;
}
public int getIdentificationNumber() {
	return identificationNumber;
}
public void setIdentificationNumber(int identificationNumber) {
	this.identificationNumber = identificationNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNumberOfCopies() {
	return numberOfCopies;
}
public void setNumberOfCopies(int numberOfCopies) {
	this.numberOfCopies = numberOfCopies;
}


}
abstract class WrittenItem extends Item{
	
}
class Book extends WrittenItem{
}
class JournalPaper extends WrittenItem{
	int year;
}
abstract class MediaItem extends Item{
	
}
class Video extends MediaItem{
	String director;
	String genre;
	int year;
}
class CD extends MediaItem{
	
}