import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[3]; // 3 tane healthplan için dizi oluşturuldu
    }

    // Getter ve Setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Employee [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", healthplans=" + Arrays.toString(healthplans) + "]";
    }
    public void addHealthplan(int index, String name) {
        if (index >= 0 && index < healthplans.length) {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("Bu index dolu, lütfen başka bir index deneyin.");
            }
        } else {
            System.out.println("Geçersiz index, lütfen doğru bir index değeri girin.");
        }
    }
}

