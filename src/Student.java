import java.time.LocalDate;
import java.util.List;

public class Stu<dent {
    private String ism;
    private String familiya;
    private LocalDate birthdate;
    private List<String> hobbies;

    // Konstruktor
    public Student(String ism, String familiya, LocalDate birthdate, List<String> hobbies) {
        this.ism = ism;
        this.familiya = familiya;
        this.birthdate = birthdate;
        this.hobbies = hobbies;
    }

    // Getter va Setterlar
    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Ism='" + ism + '\'' +
                ", Familiya='" + familiya + '\'' +
                ", Tug'ilgan sana=" + birthdate +
                ", Qiziqishlari=" + hobbies +
                '}';
    }
}
