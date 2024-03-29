package org.doctorapp.client;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        IDoctorService doctorService=new DoctorServiceImpl();

        Specialization specialization=Specialization.gyna;
        String speciality=specialization.getSpeciality();

//        String speciality=Specialization .gyna.getSpeciality();

        Doctor doctor=new Doctor("nikhil",speciality,12000,9,10);
        doctorService.addDoctor(doctor);

//        doctorService.deleteDoctor(4);

//        doctorService.updateDoctor(2,15000);

//        List<Doctor> doctors=doctorService.getAll();
//        for(Doctor doctor:doctors){
//            System.out.println(doctor);
//        }
//
//        try {
//            List<Doctor> doctorList=doctorService.getBySpecialityAndExp("GYNAECOLOGIST",10);
//            for(Doctor doctor:doctorList){
//                System.out.println(doctor);
//            }
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            List<Doctor> doctorList=doctorService.getBySpecialityAndRating("GYNAECOLOGIST",10);
//            for(Doctor doctor:doctorList){
//                System.out.println(doctor);
//            }
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            List<Doctor> doctorList=doctorService.getBySpecialityAndLessFee("GYNAECOLOGIST",5000.0);
//            for(Doctor doctor:doctorList){
//                System.out.println(doctor);
//            }
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
