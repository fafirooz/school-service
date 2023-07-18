package ir.schoolservice.service;

import ir.schoolservice.model.Dars;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DarsServiceImplTest {

    /*@Mock
    // avoid test the main repository
    private DarsRepository darsRepository;

    @InjectMocks
    private DarsService darsService = new DarsServiceImpl();

    private Iterable<Dars> darsList;
    // a kind of list

    @BeforeEach
    void setUp() {
        darsList = Arrays.asList(new Dars(1, "Riazi"),
                new Dars(2, "Honar"),
                new Dars(3, "adabiat"));
        given(darsRepository.findAll()).willReturn(darsList);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void read() {
        List<Dars> darsList1 = darsService.read();
        assertThat(darsList1).isNotEmpty();
        assertEquals(3,darsList1.size());
        assertEquals(darsList , darsList1);
    }*/
}