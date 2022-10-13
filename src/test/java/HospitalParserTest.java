import domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {

    @Test
    @DisplayName("id를 잘 파싱하는지 테스트 test doing well parse id")
    void parseId() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse("eee");
        Assertions.assertEquals("1",hospital.getId());


    }
}