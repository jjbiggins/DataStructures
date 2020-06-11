/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author bdmyers
 */
public class Doctor {
    void checkup(Patient p) {
    	Patient p2 = new Patient(p.name, p.height+10);
    	p = p2;
    }	

    public static void main(String[] args) {
    	Doctor d = new Doctor();
    	Patient georgia = new Patient("Georgia", 71);

    	d.checkup(georgia);
    	System.out.println(georgia.height);
    }
}
