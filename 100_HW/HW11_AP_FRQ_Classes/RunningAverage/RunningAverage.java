public class RunningAverage {
    private int count;
    private double average;

    public RunningAverage() {
        count = 0;
        average = 0.0;
    }

    public void updateAverage(double updatedValue) {
        average = (average * count + updatedValue) / (count + 1);
        count++;
    }

    public int processNewRatings(int num) {
        int wrongCount = 0;
        for (int i = 0; i < num; i++) {
            double rating = getRating();
            if (rating >= 0 && rating <= 100) {
                updateAverage(rating);
            } else {
                wrongCount++;
            }
        }
        return wrongCount;
    }

    public double getRating() {
        return (Math.random() * 120) - 10;
    }

    public double getAverage() {
        return average;
    }

    public int getCount() {
        return count;
    }
}
