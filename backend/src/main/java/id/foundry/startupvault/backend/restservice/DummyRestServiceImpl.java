package id.foundry.startupvault.backend.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import id.foundry.startupvault.backend.repository.*;
import id.foundry.startupvault.backend.restservice.DummyRestService;

import java.util.List;
import id.foundry.startupvault.backend.model.*;

@Service
@Transactional
public class DummyRestServiceImpl implements DummyRestService {
    @Autowired
    private DummyDb dummyDb;

    @Override
    public List<Dummy> retrieveRestAllDummy() {
        return dummyDb.findAll();
    }
}
