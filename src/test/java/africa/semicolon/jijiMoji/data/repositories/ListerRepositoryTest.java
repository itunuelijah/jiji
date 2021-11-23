package africa.semicolon.jijiMoji.data.repositories;


import africa.semicolon.jijiMoji.data.models.Condition;
import africa.semicolon.jijiMoji.data.models.Lister;
import africa.semicolon.jijiMoji.data.models.Listing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
class ListerRepositoryTest {
    @Autowired
    private ListerRepository listerRepository;

    public void repositorySaveTest(){
        Lister lister =new Lister();
        lister.setFullName("Kim Bauer");
        lister.setEmail("kim@bauer.com");
        lister.setLocation("Sabo");
        lister.setPhoneNumber("0987654");
        Lister savedLister = listerRepository.save(lister);
        assertEquals("Kim Bauer", savedLister.getFullName());
        assertNotNull(savedLister.getId());
    }
    }

}