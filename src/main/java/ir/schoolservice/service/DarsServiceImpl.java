package ir.schoolservice.service;

import ir.schoolservice.model.Dars;
import ir.schoolservice.repository.DarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DarsServiceImpl implements DarsService {

    @Autowired
    private DarsRepository darsRepository;

    @Override
    public List<Dars> read() {
        //if we want to read just one dars, read neads ip as a parameter
        Iterable<Dars> darsIterable = darsRepository.findAll();

        List<Dars> darsList = new ArrayList<>();
        for (Dars dars : darsIterable) {
            darsList.add(dars);
        }
        return darsList;
    }
}
