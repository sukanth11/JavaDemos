package com.voterapp.service;

public interface IElectionBoothService {

    boolean checkEligibility(int agg,String locality,int vid)throws NotEligibleException;

}
