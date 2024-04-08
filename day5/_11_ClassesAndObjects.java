package day5;

public class _11_ClassesAndObjects {
    public static class Success {
        int timePeriod;
        float successRate;
        String successfulPersonName;

        public void setSuccessRate(float a) {
            successRate = a;
        }

        public float getSuccessRate() {
            return successRate;
        }

        public void setSuccessfulPersonName(String name) {
            successfulPersonName = name;
        }

        public String getSuccessfulPersonName() {
            return successfulPersonName;
        }
    }

    public static void main(String[] args) {
        Success success = new Success();
        success.setSuccessRate(100);
        System.out.println(success.getSuccessRate());
    }

}
