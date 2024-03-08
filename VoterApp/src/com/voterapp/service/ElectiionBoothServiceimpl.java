package com.voterapp.service;

public class ElectiionBoothServiceimpl implements IElectionBoothService{

    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        ElectiionBoothServiceimpl electiionBoothServiceimpl=new ElectiionBoothServiceimpl();
        electiionBoothServiceimpl.checkAge(age);
        electiionBoothServiceimpl.checkLocality(locality);
        electiionBoothServiceimpl.checkVoterId(vid);
        return true;
    }
    private boolean checkAge(int age)throws UnderAgeException{
        if (age<18)
            throw new UnderAgeException("you are below 18,you are not eligible");
        else
            return true;
    }
    private  boolean checkLocality(String locality)throws LocationNotFoundException{
        String[] location={"btm","jayanager","Whitefield"};
        for(String local:location )
            if (local.equalsIgnoreCase(locality))
                return true;
        else
            throw new LocationNotFoundException("your location is not eligible");

    }
    private  boolean checkVoterId(int vid)throws InvalidVoterIDException{
        if (vid>1000)
            throw new InvalidVoterIDException("invalid voter id");
        else
            return true;
    }

}
