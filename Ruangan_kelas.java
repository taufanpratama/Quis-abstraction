package oop.Quis;


public abstract class Ruangan_kelas {
    protected String meja;
    protected String kursi;
    protected double whiteboard;
    
    protected void tempatbelajar() { // ini deklarasi method konkret
        System.out.println("tempat Dosen ");
       
    }       
     // ini deklarasi method atau method abstrak     
    protected abstract void tempatmakan();
    
    protected abstract void tempatngobrol();
    
        
}


   

