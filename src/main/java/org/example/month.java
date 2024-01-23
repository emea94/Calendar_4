package org.example;

public class month {
    int daysOfMonth;
    int numberNeedToAddForCorrectStartDay;
    String name;
    month(int daysOfMonth, int numberNeedToAddForCorrectStartDay, String name){
        this.daysOfMonth = daysOfMonth;
        this.numberNeedToAddForCorrectStartDay = numberNeedToAddForCorrectStartDay;
        this.name = name;
    }
    public static month[] getMonths() {
        month Januar = new month(31, 0,"Januar");
        month Februar = new month(28, 3, "Februar");
        month März = new month(31, 3, "März");
        month April = new month(30, 6, "April");
        month Mai = new month(31, 1, "Mai");
        month Juni = new month(30, 4, "Juni");
        month Juli = new month(31, 6, "Juli");
        month August = new month(31, 2, "August");
        month September = new month(30, 5, "September");
        month Oktober = new month(31, 1, "Oktober");
        month November = new month(30, 4, "November");
        month Dezember = new month(31, 6, "Dezember");

        month[] monthes = new month[]{Januar, Februar, März, April, Mai, Juni,
                Juli, August, September, Oktober, November, Dezember};
        return monthes;
    }
}
