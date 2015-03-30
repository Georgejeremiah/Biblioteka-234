package biblioteka;

import java.util.LinkedList;

public class Knjiga {
private String naslov;
private long isbn;
private LinkedList<Autor>autor;
private String izdavac;
public String izdanje;
public String getNaslov() {
	return naslov;
}
public void setNaslov(String naslov) {
	this.naslov = naslov;
}
public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
public LinkedList<Autor> getAutori() {
	return autor;
}
public void setAutori(LinkedList<Autor> autor) {
	this.autor = autor;
}
public String getIzdavac() {
	return izdavac;
}
public void setIzdavac(String izdavac) {
	this.izdavac = izdavac;
}
public String getIzdanje() {
	return izdanje;
}
public void setIzdanje(String izdanje) {
	this.izdanje = izdanje;
}
@Override
	public String toString() {
		return " Naslov: " +naslov+ "isbn "+isbn+ " Autor "+autor+ " Izdavac "+izdavac+ "Izdanje "+izdanje;
	}
@Override
	public boolean equals(Object o) {
	Knjiga knjiga=(Knjiga)(o);
	if(isbn==knjiga.getIsbn())return true;
	else return false;
	
		
	}
}
