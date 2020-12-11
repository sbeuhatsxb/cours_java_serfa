public class Chrono {
    public static void main(String[] args) {

        int secondsMax = 60;
        int minutesMax = 60;
        int hoursMax = 24;
        int i;
        int j;
        int k;

        for(i=0;i<hoursMax;i++){
            for(j=0;j<minutesMax;j++){
                for(k=0;k<secondsMax;k++){
                    if (i<10 & j<10 & k<10) {
                        System.out.println("0" + i + ":0" + j + ":0" + k);
                    } else if (i<10 & j<10) {
                        System.out.println("0" + i + ":0" + j + ":" + k);
                    } else if (j<10 & k<10) {
                        System.out.println(i + ":0" + j + ":0" + k);
                    } else if (i<10 & k<10) {
                        System.out.println("0"+i + ":" + j + ":0" + k);
                    } else if (i<10){
                        System.out.println("0"+i + ":" + j + ":" + k);
                    } else if (j<10){
                        System.out.println(i + ":0" + j + ":" + k);
                    } else if (k<10){
                        System.out.println(i + ":" + j + ":0" + k);
                    } else {
                        System.out.println(i+":"+j+":"+k);
                    }
                }
            }
        }
    }
}
