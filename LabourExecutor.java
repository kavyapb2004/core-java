class LabourExecutor {

    public static void main(String[] workers) {

        Labour labour1 = new Labour();
        labour1.name = "Ravi Kumar";
        labour1.salary = 15000;

        String[] proofsForRavi = {"Aadhar Card", "PAN Card", "Voter ID"};
        labour1.idProofs = proofsForRavi;


        Labour labour2 = new Labour();
        labour2.name = "Suresh Babu";
        labour2.salary = 16500;

        String[] proofsForSuresh = {"Driving License", "Aadhar Card", "Employee ID"};
        labour2.idProofs = proofsForSuresh;

        Labour labour3 = new Labour();
        labour3.name = "Manoj Singh";
        labour3.salary = 17000;

        String[] proofsForManoj = {"PAN Card", "Passport", "Aadhar Card"};
        labour3.idProofs = proofsForManoj;


        Labour labour4 = new Labour();
        labour4.name = "Kiran Shetty";
        labour4.salary = 18000;

        String[] proofsForKiran = {"Voter ID", "Driving License", "Aadhar Card"};
        labour4.idProofs = proofsForKiran;


        System.out.println("\nDetails of the labour named " + labour1.name);
        System.out.println("The salary of the labour is " + labour1.salary);
        System.out.println("The identification proofs available are:");
        for(String proof : labour1.idProofs){
            System.out.println(proof);
        }


        System.out.println("\nDetails of the labour named " + labour2.name);
        System.out.println("The salary of the labour is " + labour2.salary);
        System.out.println("The identification proofs available are:");
        for(String proof : labour2.idProofs){
            System.out.println(proof);
        }


        System.out.println("\nDetails of the labour named " + labour3.name);
        System.out.println("The salary of the labour is " + labour3.salary);
        System.out.println("The identification proofs available are:");
        for(String proof : labour3.idProofs){
            System.out.println(proof);
        }


        System.out.println("\nDetails of the labour named " + labour4.name);
        System.out.println("The salary of the labour is " + labour4.salary);
        System.out.println("The identification proofs available are:");
        for(String proof : labour4.idProofs){
            System.out.println(proof);
        }
    }
}