package web.CarServise;

import org.springframework.stereotype.Service;
import web.model.CarModel;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<CarModel> listCarModels = List.of(new CarModel("vaz", "white", 1976),
            new CarModel("audi", "green", 1990),
            new CarModel("bmw", "black", 2001),
            new CarModel("kea", "blue", 2010),
            new CarModel("ford", "red", 1957),
            new CarModel("gaz", "white", 1977),
            new CarModel("maz", "grey", 1985));

    @Override
    public List<CarModel> getCars(int count) {
        List<CarModel> list = new ArrayList<>();
        if (count <= 0) {
            return list;
        } else if (count <= listCarModels.size() && count < 5) {
            for (int i = 0; i < count; i++) {
                list.add(listCarModels.get(i));
            }
        } else {
            list = listCarModels;
        }
        return list;
    }


}
