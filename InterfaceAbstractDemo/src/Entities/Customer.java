package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity{
    public int Id;
    public String FirstName;
    public String LastName;
    public LocalDate DateOfBirth;
    public long NationalityId;
    
    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, long nationalityId) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    } 
}

