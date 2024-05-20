package dio.challenge.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthdate;
    private String gender;
    private List<String> healthProblems;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Client(){
    }
    private Client(ClientBuilder builder) {
        this.name = builder.name;
        this.birthdate = builder.birthdate;
        this.gender = builder.gender;
        this.healthProblems = builder.healthProblems;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getHealthProblems() {
        return healthProblems;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static final class ClientBuilder {
        private String name;
        private String birthdate;
        private String gender;
        private List<String> healthProblems;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public static ClientBuilder aClient() {
            return new ClientBuilder();
        }

        public ClientBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ClientBuilder birthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public ClientBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public ClientBuilder healthProblems(List<String> healthProblems) {
            this.healthProblems = healthProblems;
            return this;
        }

        public ClientBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ClientBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
