package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class MyUtil {
    public String howLongRemain(LocalDate today, String month, String date){
        Period left = Period.between(today,
                LocalDate.of(today.now().getYear(), Integer.parseInt(month), Integer.parseInt(date)));

        return String.format("%s년 %s개월 %s일 남았습니다.", left.getYears(), left.getMonths(), left.getDays());

//        LocalDate today = LocalDate.now();
//        LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
//        Period left = Period.between(today, xmas);
//
//        return String.format("Today: %s\nXmas: %s\nXmas까지 앞으로 %s월 %s일", today, xmas, left.getMonths(), left.getDays());
    }

    public String usedTime(String hour1, String min1, String sec1, String hour2, String min2, String sec2){
        return String.format("총 이용 시간: %s", getTime((int)Duration
                .between(getLocalTime(hour1, min1, sec1), getLocalTime(hour2, min2, sec2)).getSeconds()));
    }

    private LocalTime getLocalTime(String hour, String min, String sec){
        return LocalTime.of(Integer.parseInt(hour), Integer.parseInt(min), Integer.parseInt(sec));
    }

    private String getTime(int sec){
        int hour = sec/(60*60);
//        int min = sec/60 - (hour*60);
        int min = (sec - (hour*60*60))/60;
        int second = sec%60;
        return String.format("%d 시간, %d 분, %d 초", hour, min, second);
    }
}
