package assignments;
import java.util.Scanner;

class SmartCalculator {
	
     double principal;
     double rate;
     double time;
     double amount;
     double maxMarks;
     double marksObtained;
    
    public SmartCalculator() {		// Non-parameterized constructor
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
        this.amount = 0;
        this.maxMarks = 0;
        this.marksObtained = 0;
    						  }

    
    public SmartCalculator(double principal, double rate, double time, double totalMarks, double obtainedMarks) {		// Parameterized constructor
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.amount = 0; 
        this.maxMarks = totalMarks;
        this.marksObtained = obtainedMarks;
    																											}

    //*****getters and setters******
    
    public double getPrincipal() {
        return principal;
    						     }

    public void setPrincipal(double principal) {
        this.principal = principal;
    											}

    public double getRate() {
        return rate;
    						}

    public void setRate(double rate) {
        this.rate = rate;
    								 }

    public double getTime() {
        return time;
    						}

    public void setTime(double time) {
        this.time = time;
    								 }

    public double getAmount() {
        return amount;
    						  }

    public void setAmount(double amount) {
        this.amount = amount;
    									}

    public double getMaxMarks() {
        return maxMarks;
    							}

    public void setMaxMarks(double totalMarks) {
        this.maxMarks = totalMarks;
    											}

    public double getMarks() {
        return marksObtained;
    						}

    public void setMarks(double obtainedMarks) {
        this.marksObtained = obtainedMarks;
    											}

    // *****Methods****** 
    
    public double simpleInterest() {
        amount = (principal * rate * time)/100; 
        return amount;
    								}

    public double compoundInterest() {
        amount = principal * Math.pow((1 + rate), time);
        return amount - principal;
    								 }

    public double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        						   }
        return sum / numbers.length;
    									}

    public double factorial(int n) {
        
    	int fact = 1;
    	for(int i=1; i<=n; i++) {
    	  fact = fact * i;
    							}
    	return fact;
  
    								}

    public double percentage() {
        return (marksObtained / maxMarks) * 100;
    						   }

    public static void main(String[] args) {
    	
        SmartCalculator cal = new SmartCalculator();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
        	System.out.println("\nChoose option:\n1. Calculate Simple Interest\n2. Calculate Compound Interest\n3. Calculate Mean\n4. Calculate Factorial\n5. Calculate Percentage\n6. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter principal Amount, rate, and time:");
                    cal.setPrincipal(scanner.nextDouble());
                    cal.setRate(scanner.nextDouble());
                    cal.setTime(scanner.nextDouble());
                    System.out.println("Simple Interest: "+ cal.simpleInterest());
                    break;
                case 2:
                    System.out.println("Enter principal Amount, rate, and time:");
                    cal.setPrincipal(scanner.nextDouble());
                    cal.setRate(scanner.nextDouble());
                    cal.setTime(scanner.nextDouble());
                    System.out.println("Compound Interest: "+ cal.compoundInterest());
                    break;
                    
                case 3:
                    System.out.println("Enter number of values:");
                    int n = scanner.nextInt();
                    double[] numbers = new double[n];
                    System.out.println("Enter values:");
                    for (int i = 0; i < n; i++) {
                        numbers[i] = scanner.nextDouble();
                    }
                    System.out.println("Mean: " + cal.mean(numbers));
                    break;
                    
                case 4:
                    System.out.println("Enter num to calculate factorial:");
                    int num = scanner.nextInt();
                    System.out.println("Factorial: " + cal.factorial(num));
                    break;
                    
                case 5:
                    System.out.println("Enter max marks and marks obtained:");
                    cal.setMaxMarks(scanner.nextDouble());
                    cal.setMarks(scanner.nextDouble());
                    System.out.println("Percentage: "+ cal.percentage()+"%");
                    break;
                    
                case 6:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
