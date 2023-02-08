package transport;

public class Mechanic {
    private String nameSurname;
    private String company;

    public void doService(Transport transport) {
        System.out.println("Проводится техобслуживание: " + transport);
    }

    public void fixCar(Transport transport) {
        System.out.println("Производится ремонт машины: " + transport);
    }

    public Mechanic(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return " имя: " + nameSurname +
                ", компания: " + company;
    }
}
