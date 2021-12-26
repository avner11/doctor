package com.company;

public class FamliyDoctor {

   private boolean m_is_occupied;
   private String m_clinic;

   public void setOccupied(boolean m_is_occupied){
       this.m_is_occupied = m_is_occupied;
   }

   public boolean getM_occupied(){
       return m_is_occupied;
   }
   public void setM_clinic(String m_clinic){
       this.m_clinic = m_clinic;
   }

    void acceptClient() {
        if (m_is_occupied == false) {
            System.out.println("the doctor is busy");
        } else {
            m_is_occupied = true;
            System.out.println("welcome!");
        }
    }
    void finishApointment(){
         m_is_occupied = true;
    }

    @Override
    public String toString() {
        return "FamliyDoctor{" +
                "m_is_occupied=" + m_is_occupied +
                ", m_clinic='" + m_clinic + '\'' +
                '}';
    }
}
