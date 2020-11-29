package if1.pkg10119030.latihan61.bangunruang;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini merupakan program hitung untuk bangun ruang 
*                    Kerucut.
*/
public class Kerucut extends BangunRuang{
    private final float r;
    private final float t;
    
    public Kerucut(int r, int t){
        this.r = r;
        this.t = t;
    }
    
    @Override
    public float hitungVolume() {
        double volume = (0.33333333333*Math.PI*Math.pow(r,2)*t);
        return (float) volume;
    }
}