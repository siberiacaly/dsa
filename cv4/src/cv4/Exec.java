package cv4;

public class Exec {
	public static void main(String[] args) {
		
		//1. úkol
        WordCounter wc = new WordCounter();
        wc.countAndPrintWords("C:\\Users\\Student\\.eclipse\\cv4\\src\\cv4\\soubor.txt");
        
        //2. úkol
        List list = new List(null);
        
        RTP rtp1 = new RTP(1);
        list.setFirst(rtp1);
        RTP rtp2 = new RTP(2);
        list.setFirst(rtp2);
        RTP rtp3 = new RTP(3);
        list.setFirst(rtp3);
        RTP rtp4 = new RTP(4);
        list.setFirst(rtp4);
        RTP rtp5 = new RTP(5);
        list.setFirst(rtp5);

        System.out.println("Initial state: ");
        list.print();

        list.deleteFirst();
        System.out.println("After deleteFirst: ");
        list.print();


        System.out.println("Is list empty? " + list.isEmpty());

        
        System.out.println("Contains value: 4? " + list.checkValue(4));
        System.out.println("Contains value: 5? " + list.checkValue(5));
                
	}
}
