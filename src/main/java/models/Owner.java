package models;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Builder;
import lombok.Data;

@Data

public class Owner {
    public String firstName;
    public String lastName;
    public String adress;
    public String city;
    public String telephone;
    public int id;


}
