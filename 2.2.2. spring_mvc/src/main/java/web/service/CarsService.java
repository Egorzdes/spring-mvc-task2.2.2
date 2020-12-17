package web.service;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;



import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsService {
    private List<Cars> newModels = new ArrayList<>();

    {
        newModels.add(new Cars("BMW", 5, "black"));
        newModels.add(new Cars("MERCEDES", 200, "black"));
        newModels.add(new Cars("PORSCHE", 500, "black"));
        newModels.add(new Cars("RENAULT", 100, "black"));
        newModels.add(new Cars("LADA", 5, "black"));
    }

    public List<Cars> printAllCars() {
        return newModels;
    }

    public List<Cars> getCars(String count) {
        if (count == null) {
            return printAllCars();
        } else {
            int i = Integer.parseInt(count);
            if (i >= 5 || i < 1) {
                return printAllCars();
            } else {
                return printAllCars().stream().limit(i).collect(Collectors.toList());
            }
        }
    }
}
