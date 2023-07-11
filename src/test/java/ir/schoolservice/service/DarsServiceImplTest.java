package ir.schoolservice.service;

import ir.schoolservice.model.Dars;
import ir.schoolservice.repository.DarsRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DarsServiceImplTest {

    @Mock
    private DarsRepository darsRepository;

    @InjectMocks
    private DarsService darsService = new DarsServiceImpl();

    private Iterable<Dars> darsList;

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
    }
}