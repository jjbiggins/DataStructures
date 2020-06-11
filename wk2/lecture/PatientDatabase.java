class PatientDatabase {
	private	Patient[] patients;
	private int numPatients;

	PatientDatabase(int maxPatients) {
		patients = new Patient[maxPatients];
		numPatients = 0;
	}

	private void swapPatients(int a, int b) {
		Patient pa = patients[a];
		Patient pb = patients[b];
		patients[a] = pb;
		patients[b] = pa;
	}
  
	// Register a new Patient in the database (if we have space)
	boolean registerNewPatient(String name) {
		if (numPatients == patients.length) return false;

		// since they haven't been measured we will give height=0
		Patient newp = new Patient(name, 0);

		// start with the new patient at the end of the list
		patients[numPatients] = newp;

		numPatients+=1;

		// keep swapping the patient with the previous patient
		// until it is in alphabetical order
		int i = numPatients-1;
		while (i > 0 && 
			   patients[i].name.compareTo(patients[i-1].name) < 0) {
			swapPatients(i, i-1);
			i--;
		}

		return true;
	}

	// Print all patient names in alphabetical order
	void printNamesAlphabetically() {
		for (int i=0; i<numPatients; i++) { 
			System.out.println(patients[i].name);
		}
	}

	public static void main(String[] args) {
		PatientDatabase db = new PatientDatabase(100);
		db.registerNewPatient("Ron");
		db.registerNewPatient("Hermoine");
		db.registerNewPatient("Snape");
		db.registerNewPatient("Harry");
		db.printNamesAlphabetically();
	}
}
