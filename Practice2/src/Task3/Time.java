package Task3;

public class Time {
    int hour;
    int minute;
    int second;
    
    public Time(int hourNum, int minuteNum, int secondNum) {
        this.hour = hourNum;
        this.minute = minuteNum;
        this.second = secondNum;
    }
    
    public String toUniversal() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("%02d:%02d:%02d", hour, minute, second));
        return result.toString();
    }
    
    public String toStandard() {
        StringBuilder tutor = new StringBuilder();
        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12; 
        }
        String period = (hour < 12) ? "AM" : "PM";
        tutor.append(String.format("%02d:%02d:%02d %s", standardHour, minute, second, period));
        return tutor.toString();
    }
    
    public void add(Time t) {
        this.second += t.second;
        if (this.second >= 60) {
            this.second -= 60;
            this.minute += 1;
        }
        
        this.minute += t.minute;
        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
        
        this.hour += t.hour;
        if (this.hour >= 24) {
            this.hour %= 24;
        }
    }
}
