public class Class {
    private  int butunSan;
    private  String soz;
    private  int[] massiv;


    public Class(int butunSan,String soz, int ... massiv){
        this.butunSan=butunSan;
        this.soz=soz;
        this.massiv=massiv;
    }
    int getButunSan(){
        return  butunSan;
    }String getSoz(){
        return soz;
    }int [] getMassiv(){
        return massiv;
    }
}

