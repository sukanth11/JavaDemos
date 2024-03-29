package com.voterapp.service;

import com.voterapp.exception.NotEligibleException;

public interface IElectionBoothService {

    boolean checkEligibility(int agg,String locality,int vid)throws NotEligibleException;

}
