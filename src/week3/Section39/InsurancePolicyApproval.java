package week3.Section39;

public class InsurancePolicyApproval {
    public static void main(String[] args) {
        char geico = approveInsurancePolicy(35, 'G', 720);
        System.out.println(geico);

        char stateFarm = approveInsurancePolicy(22, 'P', 680);
        System.out.println(stateFarm);

        char progressive = approveInsurancePolicy(27, 'F', 710);
        System.out.println(progressive);
    }

    public static char approveInsurancePolicy(int age, char drivingRecord, int creditScore) {
        if(age >= 25 && age <=65 && drivingRecord == 'G' && creditScore >= 700) {
            return 'A';
        } else if (age < 25 || drivingRecord == 'P' || creditScore < 700) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
