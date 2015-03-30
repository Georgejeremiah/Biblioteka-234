package biblioteka;

public class Autor {
	private String ime;
	private String prezime;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	@Override
	public String toString() {
		return "Ime: "+ime+" Prezime: "+prezime; 
	}
@Override
public boolean equals(Object o) {
	Autor autor=(Autor)(o);
	if(ime.equals(autor.getIme())&& prezime.equals(autor.getPrezime())){
		return true;}
	else{
		return false;}
	
	
	}
	
}

