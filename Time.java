import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; // 月は0から始まるため、1を足す
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println("現在の日時: " + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);

        // instantの生成
        Instant i1 = Instant.now();
        System.out.println(i1);

        // instantとlong値との相互変換
        Instant i2 = Instant.ofEpochMilli(year);
        long l = i2.toEpochMilli();
        System.out.println(l);

        // ZonedDateTimeの生成
        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);

        // フォーマットを指定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // ZonedDateTimeオブジェクトを文字列に変換
        String formattedString = z.format(formatter);
        System.out.println(formattedString);

        //文字列からLocalDateを生成
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate lDate = LocalDate.now();
        LocalDate ldatep = lDate.plusDays(1000);
        String formattedDate = ldatep.format(fmt);
        System.out.println(formattedDate);
        long diff1 = ChronoUnit.DAYS.between(lDate, ldatep); //日付の差
        System.out.println(diff1);
        
    }
}
