package id.foundry.startupvault.backend.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import id.foundry.startupvault.backend.restservice.*;
import id.foundry.startupvault.backend.model.*;
import java.util.List;
@RestController
@RequestMapping("/dummy")
public class DummyRestController {
    @Autowired
    private DummyRestService dummyRestService;
    
    @GetMapping("/view-all")
    private List<Dummy> retrieveAllDummy() {
        return dummyRestService.retrieveRestAllDummy();
    }

}
