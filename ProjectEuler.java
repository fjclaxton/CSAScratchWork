public class ProjectEuler {

    public static void main(String[] args) {
        int max = 567000;

        int sum = 0;
        for (int i = 0; i<=max; i++) {
            int value = i * i;

            if (i%2 == 0) {
                sum+=value;
            }
            

        }
        System.out.println(sum);

    }

}