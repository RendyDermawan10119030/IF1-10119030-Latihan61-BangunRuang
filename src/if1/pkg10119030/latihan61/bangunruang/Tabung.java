package if1.pkg10119030.latihan61.bangunruang;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini merupakan program hitung untuk bangun ruang 
*                    Tabung.
*/
public class Tabung extends BangunRuang{
    
    private final float r;
    private final float h;
    
    public Tabung(int r, int h){
        this.r = r;
        this.h = h;
    }
            
    @Override
    public float hitungVolume(){
        double volume = (Math.PI*Math.pow(r,2)*h);
        return (float) volume;
    }
}
