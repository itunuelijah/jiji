package africa.semicolon.jijiMoji.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document("Listers")
@Data
public class Lister {
    @Id
    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private LocalDateTime dateRegistered = LocalDateTime.now();
    private String location;
}
