public class VotingEligibility {

    /**
     * Checks if a person is eligible to vote based on their age.
     * @param age The person's age (int).
     * @return true if eligible, false otherwise (boolean).
     */
    public static boolean isEligibleToVote(int age) {
        // Primitive boolean for the result of the comparison
        return age >= 18;
    }

    public static void main(String[] args) {
        int personAge1 = 20;
        int personAge2 = 16;
        
        System.out.println("Is a " + personAge1 + "-year-old eligible to vote? " + isEligibleToVote(personAge1));
        System.out.println("Is a " + personAge2 + "-year-old eligible to vote? " + isEligibleToVote(personAge2));
    }
}
