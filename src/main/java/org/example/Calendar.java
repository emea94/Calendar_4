package org.example;

public class Calendar {
    public static void main(String[] args){
        month[] monthes = month.getMonths();
        String[] days = {"Montag", "Dienstag", "Mittwoch", "Donnerstag",
                "Freitag", "Samstag", "Sonntag"};
        for (month monthe : monthes) {
            System.out.println(monthe.name);
            for (int j = monthe.numberNeedToAddForCorrectStartDay; j < monthe.daysOfMonth
                    + monthe.numberNeedToAddForCorrectStartDay; j++) {
                int l = j;
                if (l > 34) {
                    l -= 35;
                } else if (l > 27) {
                    l -= 28;
                } else if (l > 20) {
                    l -= 21;
                } else if (l > 13) {
                    l -= 14;
                } else if (l > 6) {
                    l -= 7;
                }
                System.out.print(days[l] + ", ");
                if (l > 0 && l % 6 == 0){
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println();
        }
    }

}