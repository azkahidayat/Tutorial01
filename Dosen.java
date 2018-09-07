public class Dosen{
	private String nama;
	private String nik;
	
	public Dosen(String nama, String nik){
		this.nama = nama;
		this.nik = nik;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getNik() {
		return nik;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void setNik(String nik){
		this.nik = nik;
	}
}