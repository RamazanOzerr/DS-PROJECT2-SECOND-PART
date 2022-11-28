public class Main {

    private static final int TIME = 3; // kasiyerin her bir ürünü okutma suresi

    public static void main(String[] args) {

        int averageTime = 0, topTime = 0;  // ortalama işlem tamamlama süresi, toplam işlem süresi
        int[] productArray = {8, 9, 6, 7, 10, 1, 11, 5, 3, 4, 2};
        Queue q = new Queue(11);
        for(int i : productArray){
            q.insert(i * TIME + topTime);
            topTime += i * TIME;
        }

        averageTime = topTime / q.size();

        q.print();
        System.out.println();
        System.out.println(averageTime);
        System.out.println("we just printed average time");

        //-----------------------------------------------------------------------------

        PriorityQueue pq = new PriorityQueue(11);
        for(int i : productArray){
            pq.insert(i * TIME + topTime);
            topTime += i * TIME;
        }
        pq.print();
        averageTime = topTime / pq.size();
        System.out.println(averageTime);

        // alttakileri istemiyordu hoca, methodları test etmek için yazdık
        System.out.println();
        System.out.println("deneme:");
        for(int i = 0; i<11; i++){
            System.out.println(pq.remove());
        }
//        System.out.println(pq.remove());


    }





}
