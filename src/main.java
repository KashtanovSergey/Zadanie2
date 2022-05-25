public class main {
    public static void main(String[] args){
        int a = 9;
        int b = 12;

        if ((a + b)>10 && (a + b)<20 ) {
            System.out.println(a + b);
        } else {
            System.err.println(false);
              }
        if (a - b >= 0) {
            System.out.println("Число положительное");
        } else{
            System.out.println("Число отрицательное");
        }
        if (a - b >= 0) {
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Положительное число");
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("*" + " ");
            }
            for (int k = 10; k > 5; k--){
                System.out.println("Отрицательное число");
            }
        }
        int d = 2;
        if ( d %100==0 && d %400 ==0 )
            System.out.println("количество дней в году: 366");

        else if (d % 4 == 0 && d % 100 > 0)
            System.out.println("количество дней в году: 366");

        else if (d % 100 == 0)
            System.out.println("количество дней в году: 365");

        else
            System.out.println("количество дней в году: 365");
    }

}
