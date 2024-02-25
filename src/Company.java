import java.util.Arrays;

public class Company {
    public Company(int i, String abcCompany, int i1) {

    }

    public void addEmployee(int i, String alice) {

    }
    public class company {
        private int id;
        private String name;
        private int giro;
        private String[] developerNames;

        public void Company(int id, String name, int giro) {
            this.id = id;
            this.name = name;
            this.giro = Math.max(0, giro); // Giro değeri 0'ın altına düşmemesi için kontrol
            this.developerNames = new String[5]; // 5 elemanlı developerNames dizisi oluşturuldu
        }

        // Getter ve Setter metotları
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

        public int getGiro() {
            return giro;
        }

        public void setGiro(int giro) {
            this.giro = Math.max(0, giro);
        }

        // toString metodu
        @Override
        public String toString() {
            return "Company [id=" + id + ", name=" + name + ", giro=" + giro + ", developerNames=" + Arrays.toString(developerNames) + "]";
        }

        // Employee eklemek için metot
        public void addEmployee(int index, String name) {
            if (index >= 0 && index < developerNames.length) {
                if (developerNames[index] == null) {
                    developerNames[index] = name;
                } else {
                    System.out.println("Bu index dolu, lütfen başka bir index deneyin.");
                }
            } else {
                System.out.println("Geçersiz index, lütfen doğru bir index değeri girin.");
            }
        }
    }
}
