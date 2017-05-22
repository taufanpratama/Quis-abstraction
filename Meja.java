package oop.Quis;


public class Meja extends Ruangan_kelas{
    
    
    @Override
    protected void tempatbelajar() {
         System.out.println("tempat dosen");
   }

    @Override
    protected void tempatmakan() {
         System.out.println("kalo pas istirahat meja dipake tempat makan");
    }

    @Override
    protected void tempatngobrol() {
        System.out.println("kalo pas istirahat meja dipake tempat ngobrol");
    }
  
    
    
}
