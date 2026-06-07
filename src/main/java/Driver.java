public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Hasil Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Hasil Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Hasil Count:" + counter.getCount());
		counter.increment();
		System.out.println("Hasil Count:" + counter.getCount());
		// Fungsi Pertama
public void prosesDataAngka() {
    int x = 10;
    int y = 20;
    int hasil = x + y;
    System.out.println("Hasil penjumlahan adalah: " + hasil);
    if (hasil > 15) {
        System.out.println("Angka lebih besar dari lima belas");
    } else {
        System.out.println("Angka lebih kecil");
    }
    System.out.println("Proses selesai untuk fungsi angka.");
}

// Lakukan Copy-Paste utuh fungsi di atas tepat di bawahnya dengan nama berbeda
public void prosesDataAngkaDuplicate() {
    int x = 10;
    int y = 20;
    int hasil = x + y;
    System.out.println("Hasil penjumlahan adalah: " + hasil);
    if (hasil > 15) {
        System.out.println("Angka lebih besar dari lima belas");
    } else {
        System.out.println("Angka lebih kecil");
    }
    System.out.println("Proses selesai untuk fungsi angka.");
}
	}

}
