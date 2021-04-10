package tasks.day5.stringTask;

import java.util.HashMap;
import java.util.Map;

public class LogTask {

    public static final String ACCESS_GRANTED = "granted";
    private static final String MESSAGE_TEMPLATE = "ip %s: ok - %s, failed - %s";

    public static void main(String[] args) {
        String log = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied";
        String[] accessLog = log.replaceAll("access_log.", "").split("\\r?\\n");
        Map<String, Counter> map = new HashMap<>(); //ключ - строка, значение - Counter
        for (String line : accessLog) {
            String[] words = line.split(" ");
            String ip = words[1];
            String actionResult = words[2];
            Counter counter;
            if (map.containsKey(ip)) { //есть ли значение по ключу ip
                counter = map.get(ip);
            } else {
                counter = new Counter();
                map.put(ip, counter);
            }
            if (ACCESS_GRANTED.equalsIgnoreCase(actionResult)) {
                counter.increaseAccessGrantCounter(); //увеличили счетчик кол-ва успешных входов
            } else {
                counter.increaseAccessDeniedCounter();
            }
        }
        for (Map.Entry<String, Counter> pair : map.entrySet()) {
            String ip = pair.getKey();
            int success = pair.getValue().getAccessGrantCounter();
            int fail = pair.getValue().getAccessDeniedCounter();
            String message = String.format(MESSAGE_TEMPLATE, ip, success, fail);
            System.out.println(message);
        }
    }

    static class Counter {
        int accessGrantCounter = 0;
        int accessDeniedCounter = 0;

        public int getAccessGrantCounter() {
            return accessGrantCounter;
        }

        public void increaseAccessGrantCounter() {
            this.accessGrantCounter += 1;
        }

        public int getAccessDeniedCounter() {
            return accessDeniedCounter;
        }

        public void increaseAccessDeniedCounter() {
            this.accessDeniedCounter += 1;
        }
    }
}




