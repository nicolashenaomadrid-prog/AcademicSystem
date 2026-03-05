package cesde;

import java.util.List;
import java.util.Scanner;

public class School {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String name;
    private String director;

    // Constructors
    public School() {
    }

    public School(int id, String name, String director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }

    //get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //Methods

    public School createSchool(School school) {
        System.out.println("Enter School Id:");
        int id = sc.nextInt();
        school.setId(id);
        sc.nextLine();

        System.out.println("Enter School Name:");
        String name = sc.nextLine();
        school.setName(name);

        System.out.println("Enter Director Name:");
        String director = sc.nextLine();
        school.setDirector(director);

        return school;
    }

    public void getSchoolById(int id) {
        if (id == this.id) {
            System.out.println("Id: " + this.id + "\n" +
                    "School Name: " + this.name + "\n" +
                    "Director: " + this.director);
        } else {
            System.out.println("School ID not found");
        }
    }


    public School updateSchool(School school) {
        return school;
    }

    public void deleteSchool(int id) {
        System.out.println("School with id " + id + " has been deleted.");
    }
}