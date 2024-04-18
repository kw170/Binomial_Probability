public class Main {
    public static void main(String[] args) {
       double noDefects = calcPercentage(0);
       double oneDefect = calcPercentage(1);
       double twoDefects = calcPercentage(2);
       double sum = noDefects + oneDefect + twoDefects;
       double atLeastThreeDefects = 1 - sum;

       System.out.println("There is a probability of " + noDefects + " tdo have no defects in a batch of 100 circuit boards.");
       System.out.println("There is a probability of " + oneDefect + " to have 1 defect in a batch of 100 circuit boards.");
       System.out.println("There is a probability of " + twoDefects + " to have 2 defects in a batch of 100 circuit boards.");
       System.out.println("There is a probability of " + atLeastThreeDefects + " to have 3 or more defects in a batch of 100 circuit boards.");
    }

    public static double calcPercentage(int defects) {
        int working = 100 - defects;
        double binomial = factorial(100) / (factorial(defects) * factorial(working));
        double exponents = Math.pow(0.01, defects) * Math.pow(0.99, working);
        double probability = binomial * exponents;
        return probability;
    }
    public static double factorial(int num) {
        if (num == 0){
            return 1;
        }
        return num * factorial(num -1);
    }
}