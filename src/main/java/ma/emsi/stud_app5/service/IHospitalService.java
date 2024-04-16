package ma.emsi.stud_app5.service;

import ma.emsi.stud_app5.entities.Consultation;
import ma.emsi.stud_app5.entities.Medecin;
import ma.emsi.stud_app5.entities.Patient;
import ma.emsi.stud_app5.entities.RendezVous;

import java.beans.MethodDescriptor;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
