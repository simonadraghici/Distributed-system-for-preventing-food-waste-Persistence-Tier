package dto;

public class FoodSellerCreationDTO {
    private String name;
    private String street;
    private int number;
    private String city;
    private String phoneNumber;
    private String email;
    private String password;

    public FoodSellerCreationDTO(String name, String street, int number, String city, String phoneNumber, String email, String password) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getStreet()
    {
        return street;
    }

    public int getNumber()
    {
        return number;
    }

    public String getCity()
    {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
