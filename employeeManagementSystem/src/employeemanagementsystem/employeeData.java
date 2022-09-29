/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import java.sql.Date;

/**
 *
 * @author MarcoMan
 * Subscribe our Channel --> https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 * Thanks for the support guys! <3
 */
public class employeeData {
    
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNum;
    private String position;
    private String image;
    private Date date;
    private Double salary;
    
    public employeeData(Integer employeeId, String firstName, String lastName, String gender, String phoneNum, String position, String image, Date date){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.position = position;
        this.image = image;
        this.date = date;
    }
    public employeeData(Integer employeeId, String firstName, String lastName,String position, Double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }
    
    public Integer getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNum(){
        return phoneNum;
    }    
    public String getPosition(){
        return position;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
    public Double getSalary(){
        return salary;
    }
}
