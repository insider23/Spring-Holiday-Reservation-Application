package com.holidayreservation.holidayapp.restController;


import com.holidayreservation.holidayapp.entity.Housing;
import com.holidayreservation.holidayapp.services.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HousingRestController {

    @Autowired
    HousingService housingService;

    @PostMapping("/housing")
    public void saveHousing(@RequestBody Housing housing) {
        housingService.addHousing(housing);
    }

    @GetMapping("/getAllHousing")
    public List<Housing> getAllHousing() {
        return housingService.getAllHousing();
    }

    @GetMapping("/getHousingById/{id}")
    public Optional<Housing> getHousingById(@PathVariable int id) {
        return housingService.getHousingById(id);
    }

    @PutMapping("/housing")
    public Housing saveOrUpdateHousing(@RequestBody Housing housing) {
         housingService.addHousing(housing);
         return housing;

    }
    @DeleteMapping("/deleteHousing/{id}")
    public void deleteHousing(@PathVariable int id){
        housingService.deleteHousingById(id);
    }

}
