package com.company;

public class Main {

    public static void main(String[] args) {
        Surgeon doctor = new Surgeon(1234, "avner shamir", "rambam","HAND",5);
        System.out.println(doctor);
        FamliyDoctor famliyDoctor = new FamliyDoctor();

        famliyDoctor.setOccupied(false);
        famliyDoctor.setM_clinic("hifa");
        famliyDoctor.acceptClient();
        famliyDoctor.finishApointment();
        System.out.println(famliyDoctor);
        famliyDoctor.acceptClient();
        famliyDoctor.finishApointment();
    }

}
