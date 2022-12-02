public class Main {

    private static final int TIME = 3; // kasiyerin her bir ürünü okutma suresi

    public static void main(String[] args) {

        double average1 = 0.0, average2 = 0.0;
        int topTime1 = 0, topTime2 = 0;  // toplam işlem süresi
        int[] productArray = {8, 9, 6, 7, 10, 1, 11, 5, 3, 4, 2};
        Queue q = new Queue(11);
        for(int item : productArray){
            q.insert(item);
        }

        int counter1 = 1;
        int time = 0;  //işlem süresi
        double averageTime1 = 0;
        while(!q.isEmpty()){
            int item = q.remove();
            time += item *  TIME;
            averageTime1 += time;
            System.out.println(counter1 + ".Müşterinin urun sayisi: "+item+"    İşlem süresi: "+time);
            counter1++;
        }
        System.out.println("Queue için ortalama işlem tamamlama süresi: " + averageTime1/11);

        //-----------------------------------------------------------------------------

        PriorityQueue pq = new PriorityQueue(11);
        for(int i : productArray){
            pq.insert(i);
        }

        int counter2 = 1;
        int time2 = 0;
        double averageTime2 = 0;
        while(!pq.isEmpty()){
            int item = pq.remove();
            time2 += item * TIME;
            averageTime2 += time2;
            System.out.println(counter2 + ". Müşterinin urun sayısı : " + item +   "    İşlem suresi: " + time2 );
            counter2++;
        }
        System.out.println("Priority Queue için ortalama işlem tamamlama süresi:"+ String.valueOf(averageTime2/ 11));
    }
}