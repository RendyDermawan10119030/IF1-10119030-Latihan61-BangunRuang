package if1.pkg10119030.latihan61.bangunruang;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :Program ini merupakan program hitung untuk bangun ruang 
*                    Bola.
*/
    public class Bola extends BangunRuang{
        
         private final float r;
    
    public Bola(int r){
        this.r = r;
    }
    
    @Override
    public float hitungVolume(){
        double volume = (1.33333333333*Math.PI*Math.pow(r,3));
        return (float) volume;
    }        
}
