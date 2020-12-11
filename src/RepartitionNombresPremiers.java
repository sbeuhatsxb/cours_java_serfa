import java.math.BigDecimal;
import java.math.RoundingMode;


public class RepartitionNombresPremiers {


    private static BigDecimal one = new BigDecimal("0");
    private static BigDecimal three = new BigDecimal("0");
    private static BigDecimal five = new BigDecimal("0");
    private static BigDecimal seven = new BigDecimal("0");
    private static BigDecimal nine = new BigDecimal("0");
    private static BigDecimal total = new BigDecimal("0");
    private static int boucle = 100000;

    public static void main(String args[]){
        for (int n=0; n<boucle;n++){
            int i,m=0,flag=0;
            m=n/2;
            if(n==0||n==1){
                continue;
            }else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    if(n!=2){
                        switch (n % 10) {
                            case 1 -> one = one.add(BigDecimal.ONE);
                            case 3 -> three =three.add(BigDecimal.ONE);
                            case 5 -> five =five.add(BigDecimal.ONE);
                            case 7 -> seven = seven.add(BigDecimal.ONE);
                            case 9 -> nine = nine.add(BigDecimal.ONE);
                            default -> System.out.println("Is not primal");
                        }
                    }

                }
                total = one.add(three).add(seven).add(nine);
            }//end of else
        }
        System.out.println("Total :" + total);
        System.out.println(
                "1 : " + returnPercent(one, total) +"%\n" +
                "3 : " + returnPercent(three, total)+"%\n"+
                "7 : " + returnPercent(seven, total)+"%\n"+
                "9 : " + returnPercent(nine, total)+"%"
        );
    }

    static BigDecimal returnPercent(BigDecimal n, BigDecimal total){
        return n.divide(total, 6, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
    }

}
