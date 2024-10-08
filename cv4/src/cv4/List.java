package cv4;

public class List {
    private RTP hlava;
    
    public List(RTP next) {
        this.hlava = next;
    }

    
    public void setFirst(RTP paket) {
        paket.next = this.hlava;
        this.hlava = paket;
    }
    
    
    public RTP deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        RTP schluss = this.hlava;
        this.hlava = this.hlava.getNext();
        return schluss;
    }

    
    public boolean isEmpty() {
        return this.hlava == null;
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
    
    public void print() {
        int idx = 1;
        RTP ukazovacek = this.hlava;
        while (ukazovacek != null) {
            System.out.println("Item number: " + idx + ", value: " + ukazovacek.getValue());
            idx++;
            ukazovacek = ukazovacek.getNext();
        }
    }

    
}