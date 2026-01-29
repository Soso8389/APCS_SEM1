public class StepTracker {
    private int minSteps;
    private int activeDays;
    private int totalDays;
    private int totalSteps;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.activeDays = 0;
        this.totalDays = 0;
        this.totalSteps = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
