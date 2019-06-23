import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader readerToGetFilename = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, specify the path to the file of the first cashbox: ");
        BufferedReader firstCashBoxReader = new BufferedReader(new FileReader(readerToGetFilename.readLine()));
        System.out.println("Please, specify the path to the file of the second cashbox: ");
        BufferedReader secondCashBoxReader = new BufferedReader(new FileReader(readerToGetFilename.readLine()));
        System.out.println("Please, specify the path to the file of the third cashbox: ");
        BufferedReader thirdCashBoxReader = new BufferedReader(new FileReader(readerToGetFilename.readLine()));
        System.out.println("Please, specify the path to the file of the fourth cashbox: ");
        BufferedReader fourthCashBoxReader = new BufferedReader(new FileReader(readerToGetFilename.readLine()));
        System.out.println("Please, specify the path to the file of the fifth cashbox: ");
        BufferedReader fifthCashBoxReader = new BufferedReader(new FileReader(readerToGetFilename.readLine()));
        readerToGetFilename.close();
        double maxValue = 0;
        byte tickTime = 0;

        for (byte i = 0; i<16; i++){
            double currentValue = Double.parseDouble(fifthCashBoxReader.readLine()) + Double.parseDouble(firstCashBoxReader.readLine()) + Double.parseDouble(secondCashBoxReader.readLine())
                    + Double.parseDouble(thirdCashBoxReader.readLine()) + Double.parseDouble(fourthCashBoxReader.readLine());
             if (maxValue<currentValue){
                 maxValue = currentValue;
                 tickTime = i;
             }
        }
        int openingTime = 1000;
        if (tickTime%2==0){
            System.out.println("Наибольшее количество посетителей было в: " + (tickTime/2 * 100 + openingTime));
        }
        else System.out.println("Наибольшее количество посетителей было в: " + (tickTime/2 * 100 + openingTime + 30));
    }
    // При условии что первая запись в 10:00, последняя в 17:30; Всего записей 16;
}

