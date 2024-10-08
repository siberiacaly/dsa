package cv4;

public class List {
    private RTP hlava;
    
    public void setPrvni(RTP paket) {
        paket.next = this.hlava;
        this.hlava = paket;
    }


    public List(RTP next) {
        this.hlava = next;
    }

    public void deletePrvni (RTP paket){
        this.hlava = this.hlava.next;
    }

    public String checkList(){
        if (this.hlava == null){
            return "List je prázdnej";
        }
        else{
            return "List není prádznej";
        }
    }

public String checkValue(int hodnota) {
    RTP aktualni = this.hlava;

    while (aktualni != null) { 
        if (aktualni.value == hodnota) {
            return "Ano, tato hodnota tam je bro frfr";
        }
        aktualni = aktualni.next;
    }

    return "Sorry bro, hodnota tam není 4u";
}
}
