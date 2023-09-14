package session15.learning.enums;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWeekday;

    private Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}