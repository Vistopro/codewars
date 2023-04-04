public class GreedIsGood {

    public static void main(String[] args) {

        int[] dice= {5,5,5,5,4};
        System.out.println(Greed.greedy(dice));
    }
}
class Greed{
    public static int greedy(int[] dice){
        //code here
        int points=0;
        for (int i = 1; i <= 6; i++) {
            int count=0;
            for (int j = 0; j < dice.length; j++) {
                if (dice[j] == i) {
                    count++;
                }
            }
            if(count >=3 && i!=1){
                points+=i*100*(count/3);
            }
            else if (count >=3){
                points+=i*1000*(count/3);
            }

            if(i==1){
                points+=i*100*(count%3);
            }
            else if (i==5) {
                points += i * 10*(count%3);
            }
        }
        return points;
    }
}