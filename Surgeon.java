package com.company;

public class  Surgeon extends Doctor{
    private  String m_department;
    private int m_yearsOfExperience;

    void operate(){
        System.out.println("Starting to operate...");
    }

    public String getM_department() {
        return m_department;
    }

    public void setM_department(String m_department) {
        this.m_department = m_department;
    }

    public int getM_yearsOfExperience() {
        return m_yearsOfExperience;
    }

    public void setM_yearsOfExperience(int m_yearsOfExperience) {
        this.m_yearsOfExperience = m_yearsOfExperience;
    }

    public Surgeon(int m_doctor_id, String m_doctor_name, String m_hospital, String m_department, int m_yearsOfExperience) {
        super(m_doctor_id, m_doctor_name, m_hospital);
        setM_department(m_department);
        setM_yearsOfExperience(m_yearsOfExperience);
    }

    @Override
    public String toString() {
        return "Surgeon: "+"\n" +
                "doctor id= " +getM_doctor_id()+"\n"+"doctor name: "+ getM_doctor_name()+"\n"+"hospitel= "+getM_hospital()+"\n"+"department= " +m_department+"\n"+
                " years Of Experience= " + m_yearsOfExperience ;
    }
}
