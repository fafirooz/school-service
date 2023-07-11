package ir.schoolservice.service;

import ir.schoolservice.model.Dars;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// to show to spring booth
public interface DarsService {
    public List<Dars> read();
}
