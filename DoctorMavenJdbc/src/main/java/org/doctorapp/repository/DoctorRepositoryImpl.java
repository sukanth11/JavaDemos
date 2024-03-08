package org.doctorapp.repository;

import org.doctorapp.model.Doctor;
import org.doctorapp.util.DoctorDataBase;
import org.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        //estblish a connection
        //create s prepared statement
        //
        try(Connection  connection= DoctorDataBase.openConnection();
        PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
        statement.setString(1, doctor.getDoctorName());
        statement.setString(2, doctor.getSpeciality());
        statement.setInt(3, doctor.getExperince());
        statement.setInt(4, doctor.getRating());
        statement.setDouble(5, doctor.getFees());

        boolean result=statement.execute();
            System.out.println("one row inserted "+!result );
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
            statement.setInt(2,doctorId);
            statement.setDouble(1,fees);
            int result=statement.executeUpdate();
            System.out.println("one row updated "+result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public Doctor findById(int doctorId) {
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDALLQUERY);)
        {
            ResultSet resultSet=statement.executeQuery(Queries.FINDALLQUERY);
            while (resultSet.next()){
                int doctorId=resultSet.getInt("doctor_id");
                String doctorName=resultSet.getString("doctor_name");
                String speciality=resultSet.getString("speciality");
                double fees=resultSet.getDouble("fees");
                int rating=resultSet.getInt("rating");
                int experience=resultSet.getInt("experience");
                Doctor doctor=new Doctor(doctorId,doctorName,speciality,fees,rating,experience);
                doctors.add(doctor);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return doctors;
    }

    @Override
    public List<Doctor> findAll(String speciality) {
        return null;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITY);) {
            statement.setString(1, speciality);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperince(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRating(resultSet.getInt("rating"));
                    doctors.add(doctor);
                }
            }
        } catch (Exception e){
                e.printStackTrace();
            }
        return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDEXP);) {
            statement.setString(1,speciality);
            statement.setInt(2,experience);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperince(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRating(resultSet.getInt("rating"));
                    doctors.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFee(String speciality, double fees) {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDFEES);) {
            statement.setString(1,speciality);
            statement.setDouble(2,fees);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperince(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRating(resultSet.getInt("rating"));
                    doctors.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndRating(String speciality, int ratings) {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDRAT);) {
            statement.setString(1,speciality);
            statement.setInt(2,ratings);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperince(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRating(resultSet.getInt("rating"));
                    doctors.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctors;

    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection=DoctorDataBase.openConnection();
            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITY);) {
            statement.setString(1, speciality);
            statement.setString(2,"%"+doctorName+"%");
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperince(resultSet.getInt("experience"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setRating(resultSet.getInt("rating"));
                    doctors.add(doctor);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return doctors;
    }
}
